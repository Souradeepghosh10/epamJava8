package LamdaExpJava;

public class TestPalindrom {

	public static void main(String[] args) {
		InterfP ip = (String s) -> {
			int n = s.length();
			String rev ="";
			String originals = s;
			for (int i = n - 1; i >= 0; i--) {
				rev = rev + s.charAt(i);
			}
			if (rev.equals(originals)) {
				System.out.println("This String is a Palindrom");
			} else {
				System.out.println("This String is not a palindrom");
			}
		};

		ip.palindrom("TEST");
	}

}
