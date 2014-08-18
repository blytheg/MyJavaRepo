package Control;
import java.util.Properties;
import java.io.*;


/*
 * Controllers the processing.
 */
public class Controller {

	public static Properties properties = new Properties();
	  
	public Controller ( ){
		
		//Load properties file
		readProperties (  );
	}
	
	public void readPersons(){
		
	}
	
	public void readOrders (){
		
	}
	
	public void loadPersons(){
		
	}
	
	public void loadOrders(){
		
	}
	
	public void getPersonsLeastOneOrder(){
		
	}
	
	public void getAllOrdersPerPerson(){
		
	}
	
	  /*
	   * Read the properties file
	   */
	  private void readProperties( ) {
	   
		  try {
				properties.load(Controller.class.getClassLoader().getResourceAsStream("config.properties"));
				
			} catch (IOException e) {
	 
				e.printStackTrace();
			}

		  dumpProperties();
	  }
	  
	  /*
	   * Dump method for properties
	   */
	  private void dumpProperties (){
		  
		  String name = properties.getProperty("orderfilename");
		  System.out.println(name);
		  
		  name = properties.getProperty("personfilename");
		  System.out.println(name);
		  
	  }
}
