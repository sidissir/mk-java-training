package javaio.propertiespackage;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadingFromPropertiesFile {

	// Properties file a text file with .properties extension
	// All those constant values used across the framework/code are pulled out and
	// placed inside properties file as key value pairs
	// Advantage=> If future, if there is change in the value of any property, you
	// can go change at single place in properties file rather than going and
	// changing everywhere in code
	
	/*
	 * public static void main(String[] args) throws FileNotFoundException,
	 * IOException { Properties props = new Properties();
	 * 
	 * props.load(new FileReader("config.properties"));
	 * 
	 * System.out.println(props.getProperty("url"));
	 * System.out.println(props.getProperty("username"));
	 * System.out.println(props.getProperty("password"));
	 * 
	 * 
	 * }
	 */
	
	public Properties getPropertiesObject() throws FileNotFoundException, IOException {
		Properties props = new Properties();
		
		props.load(new FileReader("config.properties"));
		
		return props;
	}

}
