
import java.util.Properties;

import Control.Controller;
import Factories.*;
import DAO.*;

public class MainProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//create a controller to do the work
		//Give it access to properties file
		Controller controller = new Controller ( );
		
		//Create a factory DOA objects
		DAOFactory factory = DAOFactory.getDAOFactory( 1 );
		
		//Load the personDAO
		PersonDAO personDAO = factory.getPersonDAO();
		
		//Load the orderDAO
		OrderDAO orderDAO = factory.getOrderDAO();

		
		//load DTOs into to the database
		
		
		//Retrieve from data base tables
		
		
	}

}
