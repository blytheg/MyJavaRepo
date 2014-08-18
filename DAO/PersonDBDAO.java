package DAO;
import java.util.List;
import DTO.PersonDTO;
import java.sql.SQLException;

/*
 * Interface for the Data Access Object for the person table
 */
public interface PersonDBDAO {

	public List<PersonDTO> getAllPersons() throws SQLException;

}
