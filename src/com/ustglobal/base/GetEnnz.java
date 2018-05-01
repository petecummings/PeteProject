 public void GetEnns() throws JAXBException, ParseException, DatatypeConfigurationException {

              AnyItemsType ai = new AnyItemsType();

              ObjectFactory of = new ObjectFactory();

              EnrollmentListFilter umlf = new EnrollmentListFilter();

              //umlf.setMemberUniversalId("00000303501");

              EnrollmentList uel = port.listEnrollments(umlf);

              List<EnrollmentType> umpt = uel.getEnrollment();

              JAXBElement<AnyItemsType> ait = of.createAnyItems(ai);

 

              for (EnrollmentType ut : umpt) {

                     ut.setState(TypeOfEnrollmentState.DELETED);

                     ut.setDeletedDate(StringToGreg("1999-01-01"));

                     ut.setTerminationDate(StringToGreg("1999-01-01"));

                     ut.setDisenrollmentDate(StringToGreg("1999-01-01"));

                    

                     JAXBElement<EnrollmentType> jaxbpayer = of.createEnrollment(ut);

                     ai.getAny().add(jaxbpayer);

              }

 

              port.addOrUpdate(ai);

              JAXBContext context = JAXBContext.newInstance(AnyItemsType.class);

              //Version v = port.showVersion();

              // System.out.println("THE VERSION: " + v.getVersion());

              Marshaller m = context.createMarshaller();

              m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

              // m.marshal(umet, System.out);

              m.marshal(ait, System.out);

       }

 
