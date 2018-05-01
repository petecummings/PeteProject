package com.ustglobal.base;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import com.click4care.thinkhealth._6_5.dto.HcpcscptCodeType;
import com.ustglobal.caremanager.model.codes.CPTModel;

public class CPTTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Path filePath = new File("C:\\Users\\u61906\\Documents\\UST-GLOBAL-PROJECTS\\IUHP\\CODE_SETS\\CPT.TAB").toPath();
		Charset charset = Charset.defaultCharset();        
		List<String> stringList = Files.readAllLines(filePath, charset);
		String[] stringArray = stringList.toArray(new String[]{});
		
		CPTModel[] codes = new CPTModel[stringArray.length];
		for(int i = 0; i < stringArray.length; i++) {
			codes[i] = new CPTModel(stringArray[i]);
			System.out.println(codes[i].getCode() + " Count: " + i);
			HcpcscptCodeType t = new HcpcscptCodeType();
			t.setCode(codes[i].getCode());
			t.setDescription(codes[i].getLongDescription());
			t.setLongDescription(codes[i].getFulldescription());
			System.out.println(t.getCode() + " " + t.getLongDescription());
			
		}
	}
}
