package com.mypackage.MyClass;



import org.testng.TestNG;
import java.util.ArrayList;
import java.util.List;

public class CICD {

    //public static String ServiceName="";
   // public static String ServiceNameParameter;
   // public static String Environment;
   // public static String currentSuitePath;

    public static void main(String[] args) {

    	/*
        try{
            ServiceNameParameter =  args[0];
            //if run from remote machine update to YES instead of NO
            System.setProperty("Access_CloudAPI","YES");
        }catch(Exception e)
        {
            System.err.println("Error in ServiceName parameter : Please provide ServiceName ");
        }

        try {
            Environment =  args[1];
            if( !Environment.contentEquals("QA") && !Environment.contentEquals("DEV")&& !Environment.contentEquals("STG")){
                System.err.println("Error in passing Environment parameter => "+Environment);
                System.exit(0);
            }
        }catch(Exception e)
        {
            System.out.println("Error in Environment parameter : Please provide valid Environment like STG or DEV etc");
        }

        try {
            currentSuitePath = args[2];
        }catch(Exception e)
        {
            System.out.println("Workspace path parameter is optional if execute jar from" +
                    " same workspace or else system will take default workspace where executable jar placed");
            currentSuitePath=System.getProperty("user.dir" );
        }

        System.setProperty("currentSuitePath",currentSuitePath);
        String selectedServiceName = getServiceName(ServiceNameParameter);

        System.setProperty( "Environment", Environment );
        System.out.println(selectedServiceName + " Service to be execute in "+Environment+" Environment");
        */
    	
          
        TestNG test = new TestNG();
        List<String> suites = new ArrayList<String>();
        System.out.println("Smoke XML Path = C:\\Users\\balaji.sridharan\\eclipse-workspace\\Mobile_Automation_Launch\\testng.xml");
        suites.add("C:\\Users\\balaji.sridharan\\eclipse-workspace\\Mobile_Automation_Launch\\testng.xml");
        test.setTestSuites(suites);
        test.run();
        System.out.println("***********Testing completed**********");
    }
/*
    public static String getServiceName(String Service){

        if(Service.toLowerCase().contains("locationapi"))
        {
            ServiceName="LocationAPI";
        }
        else if(Service.toLowerCase().contains("billofladdingapi"))
        {
            ServiceName="BillOfLaddingAPI";
        }
        else {
            System.err.println("Error in name of Service selection => " + Service);
            System.err.println("Error in ServiceName parameter : Please provide Correct ServiceName like EventDomain,LocationAPI etc");
            System.exit(0);
        }
        return ServiceName;
    }

*/

}


