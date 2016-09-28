package wk4_lecture;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Wallace's actual birthday
		Date birth = new Date(8, 24, 1987);

		Date hire = new Date(3, 12, 1988);

		Employee employee = new Employee("Wallace", "Balaniuc", birth, hire);

		System.out.println(employee);
	}

}
