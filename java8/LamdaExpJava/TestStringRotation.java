package LamdaExpJava;

public class TestStringRotation {

	public static void main(String[] args) {
		InterfRotations ip = (String s1, String s2) -> {
			return (s1.length() == s2.length()) && ((s1 + s1).indexOf(s2) != -1);
		};

		boolean validateStringRotate = ip.validateStringRotate("AACD", "ACDA");
		if (validateStringRotate == true) {
			System.out.println("Strings are rotations of each other");
		} else {
			System.out.println("Strings are not rotations of each other");
		}
	}

}
