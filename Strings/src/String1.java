
public class String1 {

	public static void main(String[] args) {
		String s1="RAMA";
		String s2=s1;
		if (s1==s2) {
			System.out.println("references are equal");
		}
		else {
			System.out.println("references are unequal");
		}
		if (s1.equals(s2)) {
			System.out.println("strings are equal");
		}
		else {
			System.out.println("strings are not equal");
		}
		// TODO Auto-generated method stub

	}

}
