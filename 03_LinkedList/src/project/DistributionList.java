package project;

import LinkedList.*;

/**
 * A distribution list of persons.
 *
 */
public class DistributionList {

	// the inner data structure
	private IList<Person> persons;

	/**
	 * Creates empty distribution list.
	 */
	public DistributionList() {
		persons = new LinkedList<Person>();
	}

	/**
	 * Add new person to the distribution list
	 * 
	 * @param person The new person
	 * @return True, if the new person is added. False if it is null or already
	 *         exists.
	 */
	public boolean add(Person person) {
		if (person == null) {
			return false;
		}

		if (persons.contains(person)) {
			return false;
		}
		persons.addFirst(person);
		return true;
	}

	/**
	 * Returns a given person if it exists, otherwise returns null.
	 * 
	 * @param person
	 * @return If the given person is found, the given person, otherwise null.
	 */
	public boolean contains(Person person) {
		if (persons.contains(person)) {
			return true;
		}
		if (person == null) {
			return false;
		}
		return false;
	}

	/**
	 * Deletes a given person.
	 * 
	 * @param person
	 * @return True, if the given person is deleted, otherwise false.
	 */

	public boolean remove(Person person) {
		if (persons.contains(person)) {
			persons.remove(person);
			return true;
		}

		return false;
	}

	@Override
	public String toString() {
		if (!persons.isEmpty()) {
			return "DistributionList [persons=" + persons.toString() + "]";
		}
		return "DistributionList [persons={}]";
	}

	/**
	 * Returns a partial distribution list of persons with a given first name.
	 * 
	 * @param firstName
	 * @return
	 */
	public DistributionList getByFirstName(String firstName) {
		DistributionList FirstNameList = new DistributionList();
		if (firstName != null) {
			for (Person person : persons) {
				if (person.getName().getFirstName().equals(firstName)) {
					FirstNameList.add(person);
				}
			}
		}
		return FirstNameList;
	}

	/**
	 * Returns a partial distribution list of persons with a given last name.
	 * 
	 * @param lastName
	 * @return
	 */
	public DistributionList getByLastName(String lastName) {
		DistributionList LastNameList = new DistributionList();
		if (lastName != null) {
			for (Person person : persons) {
				if (person.getName().getLastName().equals(lastName)) {
					LastNameList.add(person);
				}
			}
		}

		return LastNameList;
	}

	/**
	 * Returns a partial distribution list of persons with a given name.
	 * 
	 * @param firstName
	 * @param middleName
	 * @param lastName
	 * @return
	 */
	public DistributionList getByFullName(String firstName, String middleName, String lastName) {
		DistributionList FullNameList = new DistributionList();
		if (firstName + middleName + lastName != null) {
			for (Person person : persons) {
				if (person.getName().getFullName().equals(firstName + middleName + lastName)) {
					FullNameList.add(person);
				}

			}
		}
		return FullNameList;

	}

	/**
	 * Returns a partial distribution list of persons with with no middle name.
	 * 
	 * @return
	 */
	public DistributionList getIfHasMiddleName() {
		DistributionList MidNameList = new DistributionList();
		for (Person person : persons) {
			if (person.getName().getMiddleName() != null) {
				MidNameList.add(person);
			}
		}

		return MidNameList;

	}

	/**
	 * Returns a partial distribution list of persons with a given area code.
	 * 
	 * @param areaCode
	 * @return
	 */
	public DistributionList getByArea(String areaCode) {
		DistributionList AreaCodeList = new DistributionList();
		if (areaCode != null) {
			for (Person person : persons) {
				if (person.getPhone().getAreaCode().equals(areaCode)) {
					AreaCodeList.add(person);
				}

			}
		}
		return AreaCodeList;
	}

	/**
	 * Returns a partial distribution list of persons with a phone number that
	 * contains given sequence of digits.
	 * 
	 * @param digits
	 * @return
	 */
	public DistributionList getIfNumberHasASequenceOfDigits(String digits) {
		DistributionList DigitsList = new DistributionList();
		if (digits != null) {
			for (Person person : persons) {
				if (person.getPhone().toString().contains(digits)) {
					DigitsList.add(person);

				}
			}
		}
		return DigitsList;
	}
}
