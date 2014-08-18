package DAO;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import Control.Controller;
import Control.ReadCSV;
import DTO.OrderDTO;
import DTO.PersonDTO;

public class OrderDBDAOImpl implements OrderDAO{
	
	   //list of orders
	   List<OrderDTO> orders;

	   public OrderDBDAOImpl(){	   
	      orders = new ArrayList<OrderDTO>();	
	      readOrderFile();
	   }

	   /*
	    * Retrieve the full list of orders
	    * @return List	A list of order DTO objects
	    */
	   @Override
	   public List<OrderDTO> getAllOrders() {
	      return orders;
	   }

	   /*
	    * Access the order file and read the orders
	    */
	   private void readOrderFile()
	   {
		   BufferedReader br = null;  
		   String line = ""; 
		   String csvFileToRead = Controller.properties.getProperty("orderFilenamePath");
		   String separator = Controller.properties.getProperty("orderSeparator");
		   String headerToken = Controller.properties.getProperty("orderHeaderToken");

		   if ( separator.equals("|") ){
			   separator = "\\|";
		   }
			 
		   
		   try {  
				 
				br = new BufferedReader(new FileReader(csvFileToRead));  
				while ((line = br.readLine()) != null) {  
					
				   if ( !line.isEmpty() && !line.contains(headerToken) ){
					  
					   String[] data = line.split(separator);  
					
					   //Load DTO
					   OrderDTO orderDTO = new OrderDTO(data[0],
							   							   data[1],
							   							   data[2]);
					   orders.add( orderDTO );
					   
					   //Dump contents
					   orderDTO.dump();
					   	   
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
