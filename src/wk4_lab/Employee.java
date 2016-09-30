package wk4_lab;

public class Employee {
	private static int count = 0;// Number of employees created
	private String firstName;
	private String lastName;

	public Employee(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;

		count++;

		System.out.printf("Employee constructor: %s %s count = %d%n", this.firstName, this.lastName, this.count);
	}

	public static int getCount() {
		return count;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
}
