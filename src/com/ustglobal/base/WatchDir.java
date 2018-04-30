package com.ustglobal.base;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mpenna
 */

import java.nio.file.*;
import static java.nio.file.StandardWatchEventKinds.*;
import static java.nio.file.LinkOption.*;
import java.nio.file.attribute.*;
import java.io.*;
import java.text.ParseException;
import java.util.*;

import javax.xml.bind.JAXBException;
import javax.xml.datatype.DatatypeConfigurationException;

import com.ustglobal.caremanager.model.codes.NDCPackageModel;
import com.ustglobal.caremanager.model.codes.NDCProductModel;

/**
 * Example to watch a directory (or tree) for changes to files.
 */

public class WatchDir {

	private final WatchService watcher;
	private final Map<WatchKey, Path> keys;
	private final boolean recursive;
	private boolean trace = false;
	public static Environment env = new Environment();
	private static volatile boolean isPackProcessed = false;
	private static volatile boolean isProdProcessed = false;
	private static NDCPackageModel[] packProcessed = null;
	private static NDCProductModel[] prodProcessed = null;

	@SuppressWarnings("unchecked")
	static <T> WatchEvent<T> cast(WatchEvent<?> event) {
		return (WatchEvent<T>) event;
	}

	/**
	 * Register the given directory with the WatchService
	 */
	private void register(Path dir) throws IOException {
		WatchKey key = dir.register(watcher, ENTRY_CREATE);
		if (trace) {
			Path prev = keys.get(key);
			if (prev == null) {
				System.out.format("register: %s\n", dir);
			} else {
				if (!dir.equals(prev)) {
					System.out.format("update: %s -> %s\n", prev, dir);
				}
			}
		}
		keys.put(key, dir);
	}

	/**
	 * Register the given directory, and all its sub-directories, with the
	 * WatchService.
	 */
	private void registerAll(final Path start) throws IOException {
		// register directory and sub-directories
		Files.walkFileTree(start, new SimpleFileVisitor<Path>() {
			@Override
			public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
				register(dir);
				return FileVisitResult.CONTINUE;
			}
		});
	}

	/**
	 * Creates a WatchService and registers the given directory
	 */
	WatchDir(Path dir, boolean recursive) throws IOException {
		this.watcher = FileSystems.getDefault().newWatchService();
		this.keys = new HashMap<WatchKey, Path>();
		this.recursive = recursive;

		if (recursive) {
			System.out.format("Scanning %s ...\n", dir);
			registerAll(dir);
			System.out.println("Done.");
		} else {
			register(dir);
		}

		// enable trace after initial registration
		this.trace = true;
	}

	/**
	 * Process all events for keys queued to the watcher
	 * @throws InterruptedException 
	 */
	void processEvents() throws IOException, FileNotFoundException, ParseException, DatatypeConfigurationException, InterruptedException {

		for (;;) {
			
			long start = System.nanoTime();
			// wait for key to be signalled
			WatchKey key;
			try {
				key = watcher.take();
			} catch (InterruptedException x) {
				return;
			}

			Path dir = keys.get(key);
			if (dir == null) {
				System.err.println("WatchKey not recognized!!");
				continue;
			}

			for (WatchEvent<?> event : key.pollEvents()) {
				WatchEvent.Kind kind = event.kind();

				// TBD - provide example of how OVERFLOW event is handled
				if (kind == OVERFLOW) {
					continue;
				}

				// Context for directory entry event is the file name of entry
				WatchEvent<Path> ev = cast(event);
				Path name = ev.context();
				Path child = dir.resolve(name);

				// print out events and process files
				// CPT file
				if (child.toString().toLowerCase().contains(Environment.cptfile.toLowerCase())) {
					// UnZip uz = new UnZip();
					// uz.unZipIt(child.toString());
					//if(kind == ENTRY_MODIFY) {
					Thread t1 = new Thread(new Runnable() {

						@Override
						public void run() {
							// TODO Auto-generated method stub
							int processed = 0;
							System.out.format("%s: %s\n", event.kind().name(), child);
							try {
								Thread.sleep(5000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							ProcessCodes pc = new ProcessCodes();
							try {
								processed = pc.processCPT(child.toString());
							} catch (FileNotFoundException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							} catch (ParseException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							} catch (DatatypeConfigurationException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							System.out.println("Processed: " + processed + " CPT Records.");
							MoveMe(child.toString());
						}
						
					});
					t1.start();
					
					//}
					// ProcessStatusFile psf = new ProcessStatusFile();
					// psf.processStatusFileOut(child.toString());

				}
				// HCPCS
				else if (child.toString().toLowerCase().contains(Environment.hcpcsfile.toLowerCase())) {
					Thread t1 = new Thread(new Runnable() {

						@Override
						public void run() {
							// TODO Auto-generated method stub
							int processed = 0;
							System.out.format("%s: %s\n", event.kind().name(), child);
							try {
								Thread.sleep(5000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							if(child.toString().toLowerCase().contains(".zip")) {
							UnZip uz = new UnZip();
							uz.unZipIt(child.toString());
							try {
								Thread.sleep(1000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							MoveMe(child.toString());
							}
							else {
								ProcessCodes pc = new ProcessCodes();
								try {
									processed = pc.processHCPCS(child.toString());
								} catch (FileNotFoundException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								} catch (IOException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								} catch (ParseException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								} catch (DatatypeConfigurationException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								System.out.println("Processed: " + processed + " HCPCS Records.");
								MoveMe(child.toString());
							}
						}
						
					});
					t1.start();
					
					
					
					
					
				}
				// ICD10CM
				else if (child.toString().toLowerCase().contains(Environment.icd10cmfile.toLowerCase())) {
					Thread t1 = new Thread(new Runnable() {

						@Override
						public void run() {
							// TODO Auto-generated method stub
							System.out.format("%s: %s\n", event.kind().name(), child);
							int processed = 0;
							try {
								Thread.sleep(5000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							ProcessCodes pc = new ProcessCodes();
							try {
								try {
									processed = pc.processICD10CMBulk(child.toString());
								} catch (JAXBException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							} catch (FileNotFoundException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							} catch (ParseException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							} catch (DatatypeConfigurationException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							System.out.println("Processed: " + processed + " ICD10CM Records.");
							MoveMe(child.toString());
						}
						
					});
					t1.start();
					
				}
				//ICD10pcs
				else if (child.toString().toLowerCase().contains(Environment.icd10pcsfile.toLowerCase())) {
					Thread t1 = new Thread(new Runnable() {

						@Override
						public void run() {
							// TODO Auto-generated method stub
							System.out.format("%s: %s\n", event.kind().name(), child);
							int processed = 0;
							try {
								Thread.sleep(5000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							ProcessCodes pc = new ProcessCodes();
							try {
								processed = pc.processICD10PCS(child.toString());
							} catch (FileNotFoundException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							} catch (ParseException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							} catch (DatatypeConfigurationException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							System.out.println("Processed: " + processed + " ICD10PCS Records.");
							MoveMe(child.toString());
						}
						
					});
					t1.start();
					
				}
				//NDC Product
				else if (child.toString().toLowerCase().contains(Environment.ndcproduct.toLowerCase())) {
					Thread t1 = new Thread(new Runnable() {

						@Override
						public void run() {
							// TODO Auto-generated method stub
							
							
							System.out.format("%s: %s\n", event.kind().name(), child);
							    try {
									Thread.sleep(5000);
								} catch (InterruptedException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
								ProcessCodes pc = new ProcessCodes();
								try {
									prodProcessed = pc.processNDCProduct(child.toString());
								} catch (FileNotFoundException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								} catch (IOException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								} catch (ParseException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								} catch (DatatypeConfigurationException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								System.out.println("Processed: " + prodProcessed.length + " NDC Prod Records.");
								MoveMe(child.toString());
								isProdProcessed = true;
							
						}
						
					});
					t1.start();
				}
				
				//NDC Package
				else if (child.toString().toLowerCase().contains(Environment.ndcpackage.toLowerCase())) {
					Thread t1 = new Thread(new Runnable() {
						
						@Override
						public void run() {
							// TODO Auto-generated method stub
							
							
							System.out.format("%s: %s\n", event.kind().name(), child);
							    try {
									Thread.sleep(5000);
								} catch (InterruptedException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
								ProcessCodes pc = new ProcessCodes();
								try {
									packProcessed = pc.processNDCPackage(child.toString());
								} catch (FileNotFoundException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								} catch (IOException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								} catch (ParseException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								} catch (DatatypeConfigurationException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								System.out.println("Processed: " + packProcessed.length + " NDC Package Records.");
								MoveMe(child.toString());
								isPackProcessed = true;
							
						}
						
					});
					t1.start();
				}
				
				
				
				
				long end = System.nanoTime();
				long elapsedTime = end - start;
				double seconds = (double)elapsedTime / 1000000000.0;
				System.out.println("TOOK: " + seconds + " to complete");

				// if directory is created, and watching recursively, then
				// register it and its sub-directories
				if (recursive && (kind == ENTRY_CREATE)) {
					try {
						if (Files.isDirectory(child, NOFOLLOW_LINKS)) {
							registerAll(child);
						}
					} catch (IOException x) {
						// ignore to keep sample readbale
					}
				}
			}

			// reset key and remove from set if directory no longer accessible
			boolean valid = key.reset();
			if (!valid) {
				keys.remove(key);

				// all directories are inaccessible
				if (keys.isEmpty()) {
					break;
				}
			}
		}
	}

	static void usage() {
		System.err.println("usage: java WatchDir [-r] dir");
		System.exit(-1);
	}

	public static void main(String[] args)
			throws IOException, FileNotFoundException, ParseException, DatatypeConfigurationException, InterruptedException {
		// parse arguments

		// args = new String[1];
		// args[0] = "/tmp";
		// args[1] = "/tmp";
		// args[1] = ''
		/*
		 * if (args.length == 0 || args.length > 2) usage(); boolean recursive = false;
		 * int dirArg = 0; if (args[0].equals("-r")) { if (args.length < 2) usage();
		 * recursive = true; dirArg++; }
		 */

		// register directory and process its events
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				while(true) {
				if(isPackProcessed && isProdProcessed) {
					System.out.println("Running combination...");
					ProcessCodes pc = new ProcessCodes();
					pc.combine3(packProcessed, prodProcessed);
					isPackProcessed = false;
					isProdProcessed = false;
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				}
			}
		});
			t1.start();
		
		
		Path dir = Paths.get(Environment.dir);
		File folder = new File(Environment.processedDir);
    	if(!folder.exists()){
    		folder.mkdir();
    	}
		new WatchDir(dir, false).processEvents();
		
		
		
	
	}
	
	private void MoveMe(String file) {
		File moveToProcessed = new File(file);
		moveToProcessed.renameTo(new File(Environment.processedDir + File.separator + moveToProcessed.getName() + "_processed"));
		
	}
}
