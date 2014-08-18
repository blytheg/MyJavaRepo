package DAO;
import java.util.List;
import DTO.PersonDTO;;

/*
 * Interface for the Data Access Object for the person file
 */
public interface PersonDAO {

	public List<PersonDTO> getAllPersons();

}
