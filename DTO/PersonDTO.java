package DTO;

/*
 * A data transfer object for encapsulating the properties of a person
 */
public class PersonDTO {

	private String firstName;
	private int personID;
	private String lastName;
	private String city;
	private String street;
	

	/*
	 * Constructor that is used to create the person DTO
	 * @param	personID		The unique ID associated with the person
	 * @param	firstName		The first name of the person
	 * @param	lastName		The last name of the person
	 * @param	street			A street name associated with a person
	 * @param	city			A city associated with a person
	 * @return	PersonDTO
	 */
	public PersonDTO( int personID, String firstName, String lastName, String street, String city){
		
		this.personID 	= personID;
		this.firstName 	= firstName;
		this.lastName 	= lastName;
		this.street		= street;
		this.city		= city;
		
}
	
	/*
	 * Constructor that is used to create the person DTO
	 * @param	personID		The unique ID associated with the person
	 * @param	firstName		The first name of the person
	 * @param	lastName		The last name of the person
	 * @param	street			A street name associated with a person
	 * @param	city			A city associated with a person
	 * @return	PersonDTO
	 */
	public PersonDTO( String personID, String firstName, String lastName, String street, String city){
		
		this.personID 	= new Integer (personID).intValue();
		this.firstName 	= firstName;
		this.lastName 	= lastName;
		this.street		= street;
		this.city		= city;
		
}
	/*
	 * Default person DTO
	 */
	public PersonDTO (){
		
	}
	
	/*
	 * A method to get the person ID
	 * @return	The person ID
	 */
	public int getPersonID() {
		return personID;
	}
	
	/*
	 * A method to set the person id
	 * @param 	int	The person id
	 */
	public void setPersonID(int personID) {
		this.personID = personID;
	}
	
	/*
	 * A method to get the person first name
	 * @return	The person first name
	 */
	public String getFirstName() {
		return firstName;
	}
	
	/*
	 * A method to set the person first name
	 * @param 	String	The person first name
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	/*
	 * A method to get the person last name
	 * @return	The person last name
	 */
	public String getLastName() {
		return lastName;
	}
	
	/*
	 * A method to set the person last name
	 * @param 	String	The persons last name
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	/*
	 * A method to get the persons street
	 * @return	The persons street
	 */
	public String getStreet() {
		return street;
	}
	
	/*
	 * A method to set the persons street
	 * @param 	String	The persons street
	 */
	public void setStreet(String street) {
		this.street = street;
	}
	
	/*
	 * A method to get the persons city
	 * @return	The persons city
	 */
	public String getCity() {
		return city;
	}
	
	/*
	 * A method to set the persons city
	 * @param 	String	The persons city
	 */
	public void setCity(String city) {
		this.city = city;
	}
	
	public void dump(){
		System.out.println("PersonID = " + personID +
						   " Last name = " + lastName +
						   " FirstName = " + firstName + 
						   " Street = " + street +
						   " city = " + city );
		
	}
}
