package Factories;
import DAO.*;

/*
 * An abstract DAO factory which allows the generation of a
 * DOA for specific sources
 */
public abstract class DAOFactory {

	  // List of DAO types supported by the factory
	  public static final int FILE = 1;
	  
	  // There will be a method for each DAO that can be 
	  // created. The concrete factories will have to 
	  // implement these methods.
	  public abstract PersonDAO getPersonDAO();
	  public abstract OrderDAO getOrderDAO();	 
	 	

	  /*
	   * Create the DAO factory in the constructor
	   * @param aFactory	The type of factory need to access the the source.
	   */
	  public static DAOFactory getDAOFactory(
	      int aFactory) {
	  
	    switch (aFactory) {
	      case FILE: 
	          return new FileDAOFactory();
	      default           : 
	          return null;
	    }
	  }
}
