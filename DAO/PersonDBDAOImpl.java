package DAO;
import java.util.ArrayList;
import java.util.List;
import DTO.PersonDTO;

import java.sql.*;

public class PersonDBDAOImpl implements PersonDAO{
	
		// JDBC driver name and database URL
		static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
		static final String DB_URL = "jdbc:mysql://localhost/STUDENTS";

		//  Database credentials
		static final String USER = "username";
		static final String PASS = "password";
		
		/*
		 * Default Constructor
		 */
	   public PersonDBDAOImpl(){	 
	          
	   }
	   
	   /*
	    * Load the persons into the person table 
	    */
	   public void loadPersons( List<PersonDTO> persons ){
		   
		   for (int i = 0; i < persons.size(); i++) {			    
			    insertPerson( persons.get(i) );
			}
	   }

	   /*
	    * Retrieve the full list of persons
	    * @return List	A list of person DTO objects
	    */
	   @Override
	   public List<PersonDTO> getAllPersons() {
		   
		   List<PersonDTO> persons = new ArrayList<PersonDTO>();
		   
		   //Get all rows from the  person table
		   Statement stmt = null;
			try{
				
				stmt = getConnection().createStatement();
				String selectAll = "select PERSON,LAST_NAME,FIRST_NAME,STREET,CITY from Person";					
				ResultSet results = stmt.executeQuery( selectAll );
				stmt.close();
				
				//Process result set
				while (results.next()) {
					PersonDTO person = new PersonDTO(
			                             results.getString("PERSON"),
			                             results.getString("FIRST_NAME"),
			                             results.getString("LAST_NAME"),
			                             results.getString("STREET"),
			                             results.getString("CITY") );
					
					persons.add ( person );
					
				};
				
				}catch ( SQLException se ){
					//Handle JDBC errors
					se.printStackTrace();
				} catch ( Exception e ){
					//Handle other exceptions
					e.printStackTrace();
				}finally {
					try{
						if ( stmt != null ){
							stmt.close();
						}
					}catch ( SQLException se ){
							//Handle JDBC errors
							se.printStackTrace();
					}
						
				}
			
			  return persons;
			}	
		  
	   /*
	    * Insert a person DTO into the person table
	    * @param personDTO	A person DTO
	    */
	   private void insertPerson( PersonDTO person){
		   
		   Statement stmt = null;
			try{
				
				stmt = getConnection().createStatement();
				String insertSQL = "insert into Person " +
									"values ("  + person.getPersonID() +
											"," + person.getLastName() +
											"," + person.getFirstName() +
											"," + person.getStreet() +
											"," + person.getCity() +
											")";
				stmt.executeQuery( insertSQL );
				stmt.close();
				
				}catch ( SQLException se ){
					//Handle JDBC errors
					se.printStackTrace();
				} catch ( Exception e ){
					//Handle other exceptions
					e.printStackTrace();
				}finally {
					try{
						if ( stmt != null ){
							stmt.close();
						}
					}catch ( SQLException se ){
							//Handle JDBC errors
							se.printStackTrace();
					}
				}
		}	
	
	   /*
	    * Retrieve all persons with at least one Order
	    * @return List	A list of person DTO objects
	    */
	   public List<PersonDTO> GetPersonsAtLeastOneOrder() {
		   
		   List<PersonDTO> persons = new ArrayList<PersonDTO>();
		   
		   //Get all rows from the  person table
		   Statement stmt = null;
			try{
				
				stmt = getConnection().createStatement();
				String selectAll = "PERSON,LAST_NAME,FIRST_NAME,STREET,CITY from Person "+
								" where personID = ( select * fom order ";					
				ResultSet results = stmt.executeQuery( selectAll );
				stmt.close();
				
				//Process result set
				while (results.next()) {
					PersonDTO person = new PersonDTO(
			                             results.getString("PERSON"),
			                             results.getString("FIRST_NAME"),
			                             results.getString("LAST_NAME"),
			                             results.getString("STREET"),
			                             results.getString("CITY") );
					
					persons.add ( person );
					
				};
				
				}catch ( SQLException se ){
					//Handle JDBC errors
					se.printStackTrace();
				} catch ( Exception e ){
					//Handle other exceptions
					e.printStackTrace();
				}finally {
					try{
						if ( stmt != null ){
							stmt.close();
						}
					}catch ( SQLException se ){
							//Handle JDBC errors
							se.printStackTrace();
					}
						
				}
			
			  return persons;
			}	
	   
		   
	   private Connection getConnection() throws Exception{
		   return DriverManager.getConnection(DB_URL, USER, PASS);
	   }
	  
}
