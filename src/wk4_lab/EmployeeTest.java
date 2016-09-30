package wk4_lab;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("Employees created: %d%n", Employee.getCount());

		Employee e1 = new Employee("Wallace", "Balaniuc");
		Employee e2 = new Employee("Bob", "Barker");

		System.out.printf("%nEmployees after instantiation:%n");
		System.out.printf("via e1.getCount(): %d%n", e1.getCount());
		System.out.printf("via e2.getCount(): %d%n", e2.getCount());
		System.out.printf("via Employee.getCount(): %d%n", Employee.getCount());
	}

}
