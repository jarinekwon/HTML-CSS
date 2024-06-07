package chapter10;

public class Person {
	
	public String lastName;
	public String firstName;
	
	public int getlength() {
		return lastName.length()+firstName.length();
	}
	public String getLastName() {
		return lastName;
	}
	public String getFirstName() {
		return firstName;
	}
}
