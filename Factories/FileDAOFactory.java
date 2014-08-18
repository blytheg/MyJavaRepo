package Factories;
import DAO.*;

/*
 * Extend the abstract DOA Factory to create an instance of a FilDAOFactory
 * which will be used to access the person and order files to create
 * lists of person and order DTO's
 */
public class FileDAOFactory extends DAOFactory{
  
	  public PersonDAO getPersonDAO() {
	    // Create a PersonDAOImpl implements PersonDAO
	    return new PersonDAOImpl( );
	  }
	  public OrderDAO getOrderDAO() {
	    // OrderDAOImpl implements OrderDAO
	    return new OrderDAOImpl();
	  }

}
