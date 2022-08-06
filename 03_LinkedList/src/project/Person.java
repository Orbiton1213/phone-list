package project;

public class Person  {


	// The name
	private Name name;

	// The phone number
	private Phone phone;

	/**
	 * Trivial constructor.
	 * 
	 * @param name
	 * @param phone
	 */
	public Person(Name name, Phone phone) {
		this.name = name;
		this.phone = phone;
	}

	/**
	 * Returns the name.
	 * @return
	 */
	public Name getName() {
	
		return name;
	}


	/**
	 * Returns the phone.
	 * @return
	 */
	public Phone getPhone() {

		return phone;
	}

	@Override
	public String toString() {
		String Person = "Person" +"[" +"name=" + getName() + ", " + "phone" + getPhone() + "]";
		return Person;
	}

	/**
	 * Returns true if the name and the phone are equals, otherwise returns false.
	 */
	@Override
	public boolean equals(Object x) {
		if(!(x instanceof Person)) {
			return false;
		}
		Person Newp = (Person) x;
		return this.name.equals(Newp.getName()) && this.phone.equals(Newp.getPhone());
				}
	
}

