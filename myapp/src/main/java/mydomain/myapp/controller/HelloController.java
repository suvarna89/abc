package mydomain.myapp.controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class HelloController {	
	
	  //String propValue=null;
	  String propConfigValue=null;
	  
	  public String getPropConfigValue() {
		return propConfigValue;
	}

	public void setPropConfigValue(String propConfigValue) {
		this.propConfigValue = propConfigValue;
	}

	public HelloController(){
		  
		  Properties props = new Properties();
			
			InputStream input = null;
			try {
				 
				input = this.getClass().getClassLoader().getResourceAsStream("config.properties");
				
				props.load(input);
				
					 //ropValue=props.getProperty("DEV");
					 
					 propConfigValue=props.getProperty("DEV");
				  // get the property value and print it out
				 System.out.println(props.getProperty("DEV"));
				 
				  
				  } catch (IOException ex) { 
					  ex.printStackTrace(); }
		  
		  }
		
	public String sayHello() { 
		
		
		return propConfigValue;
		
	
}
}