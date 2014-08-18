package DTO;

/*
 * A data transfer object for encapsulating the properties of a order
 */
public class OrderDTO {

	private int orderID;
	private int orderNumber;
	private int personID;
	
	

	/*
	 * Constructor that is used to create the person DTO
	 * @param	orderID			The unique ID associated with an order
	 * @param	orderNumber		The a number associated with an order
	 * @param	personID		A unique ID associated with a person
	 * @return	OrderDTO
	 */
	public OrderDTO( int orderID, int orderNumber, int personID){
		
		this.orderID 		= orderID;
		this.orderNumber 	= orderNumber;
		this.personID 		= personID;
		
		
}
	
	/*
	 * Constructor that is used to create the person DTO
	 * @param	orderID			The unique ID associated with an order
	 * @param	orderNumber		The a number associated with an order
	 * @param	personID		A unique ID associated with a person
	 * @return	OrderDTO
	 */
	public OrderDTO( String orderID, String orderNumber, String personID){
		
		this.orderID 		= new Integer(orderID).intValue();
		this.orderNumber 	= new Integer (orderNumber).intValue();
		this.personID 		= new Integer (personID).intValue();
		
		
}
	/*
	 * A method to get the person ID associated with an order
	 * @return	The person ID
	 */
	public int getPersonID() {
		return personID;
	}
	
	/*
	 * A method to set the person id associated with an order
	 * @param 	int	The person id
	 */
	public void setPersonID(int personID) {
		this.personID = personID;
	}
	
	/*
	 * A method to get the orderID
	 * @return	The orderID
	 */
	public int getOrderID() {
		return orderID;
	}
	
	/*
	 * A method to set the orderID
	 * @param 	int	The orderID
	 */
	public void setFirstName(int orderID) {
		this.orderID = orderID;
	}
	
	/*
	 * A method to get the order number
	 * @return	The order number
	 */
	public int getOrderNumber() {
		return orderNumber;
	}
	
	/*
	 * A method to set the orderNumber
	 * @param 	int	The orderNumber
	 */
	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}
	
	public void dump(){
		System.out.println("personID = " + personID +
						   " order ID = " + orderID +
						   " order number = " + orderNumber );
		
	}
}

