package com.config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ObjectMap {
	
	public static String getconfig (String object) {
		//if u throw one time u have to throw always, better use try catch
	String file = "./config.properties";
	/*String is data type
	 * file is variable
	 * ("./config.properties";is value(this is path of my data)
	 */ 
	FileInputStream fis=null;
	try {
		fis = new FileInputStream(file);//Serilization: Data to Stream
		                                //deserilization stream to data// FileOutput
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
	} 
	Properties properties=new Properties(); //To read Note pad 
	
	try {
		properties.load(fis);//properties and serilization connect together
	} catch (IOException e) {
		
		e.printStackTrace();
	} 
	

	properties.getProperty(object) ;
	
	return properties.getProperty(object);

}	
	

}
