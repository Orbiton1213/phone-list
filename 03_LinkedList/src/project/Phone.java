package project;

public class Phone {

/**
 * A phone number
 *
 */

	// the area (like 02, 03, 05 ...)
	private String areaCode;
	
	// the number
	private int number;

	// trivial constructor
	public Phone(String areaCode, int number) {
		this.areaCode = areaCode;
		this.number = number;
		
	}
	
	// returns the area
	public String getAreaCode() {
		
		return areaCode;
	}
	
	// returns the number
	public int getNumber() {
		
		return number;
	}

	@Override
	public String toString() {
		String area = "(" + areaCode + ")";
		String num = number / 1000 + "-" + number%1000;
		
		return area + num;
	}
}

