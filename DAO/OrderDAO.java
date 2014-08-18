package DAO;
import java.util.List;
import DTO.OrderDTO;;

/*
 * Interface for the Data Access Object for the person file
 */
public interface OrderDAO {

	public List<OrderDTO> getAllOrders();

}
