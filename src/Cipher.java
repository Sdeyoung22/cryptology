import java.util.Scanner;

/**
 * 
 * @author Sdeyoung22
 *
 */
public class Cipher {

	public static void main(String[]args) {
		String cipher = "That is a very cool thing you have there.";
		for (int i = 0; i < cipher.length(); i++) {
			if (isLower(cipher.charAt(i))) {
				int let = cipher.charAt(i) - 'a';
				let -= 3;
				let %= 26;
				let += 'a';
				System.out.print((char)let);
			}
			else if (isUpper(cipher.charAt(i))) {
				int let = cipher.charAt(i) - 'A';
				let -= 3;
				let %= 26;
				let += 'A';
				System.out.print((char)let);
			}
			else {
				System.out.print(cipher.charAt(i));
			}
		}
		
		
		
		
		
	}
	public static boolean isLower (char a) {
		return a >= 'a' && a <= 'z';
	}
	public static boolean isUpper (char a) {
		return a >= 'A' && a <= 'Z';
	}
}
