package Factories;
import DAO.*;

/*
 * Extend the abstract DOA Factory to create an instance of a DBDAOFactory
 * which will be used to access the person and order tables
 */
public class DBDAOFactory extends DAOFactory{
  
	  public PersonDAO getPersonDAO() {
	    return new PersonDAOImpl();
	  }
	  public OrderDAO getOrderDAO() {
	    return new OrderDBDAOImpl();
	  }

}
