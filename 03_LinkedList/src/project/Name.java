package project;

public class Name {


	// the first name
	private String firstName;
	
	// the middle name
	private String middleName;
	
	// the last name
	private String lastName;

	// trivial constructor
	public Name(String firstName, String middleName, String lastName) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
	}
	

	// constructor with no middle name
	public Name(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	// returns the first name
	public String getFirstName() {
		return firstName;
	}

	// returns the middle name
	public String getMiddleName() {
	
		return middleName;
	}

	// returns the last name
	public String getLastName() {
		return lastName;
	}
	public String getFullName() {
		return  firstName + middleName + lastName ;
	}
	@Override
	public String toString() {
		if(middleName != null) {
			String Name = firstName + " "+  middleName + " " +  lastName;
			return Name ;	
		
	}
		String Rename = firstName + " " +  lastName;
		return Rename;
	}
	
	}
	


