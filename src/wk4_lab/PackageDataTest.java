package wk4_lab;

public class PackageDataTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PackageData packageData = new PackageData();

		System.out.printf("After instantiation: %n%s%n", packageData);
		
		packageData.number=77;
		packageData.str="Goodbye";

		System.out.printf("After modification: %n%s%n", packageData);
	}

}

class PackageData {
	int number;
	String str;

	public PackageData() {
		number = 0;
		str = "Hello";
	}

	/**
	 * Returns a string representation of the PackageData object
	 */
	public String toString() {
		return String.format("Number = %d%nStr = %s%n", number, str);
	}
}