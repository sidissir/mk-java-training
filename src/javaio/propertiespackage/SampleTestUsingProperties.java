package javaio.propertiespackage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class SampleTestUsingProperties {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		
		System.out.println("My Test execution started");
		
		System.out.println("Opening web browser");
		
		System.out.println("Entering URL");
		ReadingFromPropertiesFile propsUtil = new ReadingFromPropertiesFile();

		Properties props = propsUtil.getPropertiesObject();
		String webURL = props.getProperty("url");
		System.out.println("Opening the URL in selenium : " +webURL );
		
		System.out.println("Entering username");
		
		String uname = props.getProperty("username");
		System.out.println("Entering username in selenium : " +uname );

		
		System.out.println("Entering Password");
		String pwd = props.getProperty("password");
		System.out.println("Entering password in selenium : " +pwd );
		
		System.out.println("My Test execution completed");


	}

}
