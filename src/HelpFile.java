/**
 * Helper file for ASCII/Binary/Palindrome
 *
 */

public class HelpFile {
	/**
	 * Main entry point to the application.
	 * 
	 * @param args unused command line arguments.
	 * @throws UnsupportedEncodingException 
	 */
	public static void main(String[] args) {
		// Create the text to convert to binary.
		String text = "Hello World 20.";
		print("Input text: " + text);
		
		// Perform the conversion.
		String binary = InputProcessor.asciiToBinary(text);
		
		print("Binary translation: " + binary);
		
		// Now try to recover the original string from the binary.
		String recovered = InputProcessor.binaryToAscii(binary);
		
		print("Recovered: " + recovered);
		
		// Now we can check if the solution can identify palindromes.
		String palindrome_test = "abba";
		print("Is " + palindrome_test + " a palindrome? " + InputProcessor.isPalindrome(palindrome_test));
		
		palindrome_test = "jamie";
		print("Is " + palindrome_test + " a palindrome? " + InputProcessor.isPalindrome(palindrome_test));
			
	}
	
	/**
	 * I've wrapped the print method, to make my examples clearer.
	 * 
	 * @param text the text to print to standard output.
	 */
	private static void print(String text) {
		System.out.println(text);
	}
}
