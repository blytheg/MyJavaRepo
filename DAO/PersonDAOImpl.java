package DAO;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import DTO.PersonDTO;
import Control.*;

public class PersonDAOImpl implements PersonDAO{
	
	   //list of persons
	   List<PersonDTO> persons;

	   public PersonDAOImpl(){	 
		   
	      persons = new ArrayList<PersonDTO>();	
	      
	      //Read the person file
	      readPersonFile();
	      
	   }

	   /*
	    * Retrieve the full list of persons
	    * @return List	A list of person DTO objects
	    */
	   @Override
	   public List<PersonDTO> getAllPersons() {
	      return persons;
	   }

	   /*
	    * Access the person file and read the persons
	    */
	   private void readPersonFile()
	   {
		   BufferedReader br = null;  
		   String line = ""; 
		   String csvFileToRead = Controller.properties.getProperty("personFilenamePath");
		   String separator = Controller.properties.getProperty("personSeparator");
		   String headerToken = Controller.properties.getProperty("personHeaderToken");
			  	
			try {  
			 
				br = new BufferedReader(new FileReader(csvFileToRead));  
				while ((line = br.readLine()) != null) {  
					
				   if ( !line.isEmpty() && !line.contains(headerToken) ){
					   
					   String[] data = line.split(separator);  
					    
					   //Load DTO
					   PersonDTO personDTO = new PersonDTO(data[0],
							   							   data[1],
							   							   data[2],
							   							   data[3],
							   							   data[4]);
					   persons.add( personDTO );
					   
					   //Dump contents
					   personDTO.dump();
					   	   
				   }
				}  
				
			} catch (FileNotFoundException e) {  
				e.printStackTrace();  
				  } catch (IOException e) {  
					  e.printStackTrace();  
				  } finally {  
					  if (br != null) {  
						  try {  
							  br.close();  
						  } catch (IOException e) {  
							  e.printStackTrace();  
						  }  
					  }  
				  }  
				   
			}  
		   
	   
	  
}
