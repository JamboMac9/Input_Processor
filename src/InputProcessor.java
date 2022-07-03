/**
 * 
 * Building an application that will i) convert ASCII to binary,
 * ii) convert binary to ASCII and iii) check if the given words
 * in the main text file contains Strings that are considered a
 * Palindrome.
 *
 **/

public class InputProcessor {
	
	/**
	 * @param text  	finding the variable text from main.
	 * @return result   returning the binary number value.
	 */

	// Converting ASCII text string to binary. 
	public static String asciiToBinary(String text) {

		// converting given string in to sequence of bytes and returns an array of bytes.
		byte[] b = text.getBytes();
		// transform the string of characters from immutable to mutable.
		StringBuilder result = new StringBuilder();
		
		// setting each value in 'b' to 'bytes' on each loop.
		for (byte bytes : b) {
			
			int binary = bytes;
		
			// looping through 'text' arg max. 8 times.
			for (int i = 0; i < 8; i++) {
				// setting bits to 128 and looking for booleans values. Appending 'binary' & 'result'.
				result.append((binary & 128) == 0 ? 0 : 1);
					
				// shift bits left once using bitwise left (<<=).
				binary <<= 1;
			}
		}
		return result.toString();
	}
	
	/**
	 * @param text  	finding the variable text from main.
	 * @return binary   returning the value of String binary.
	 */

	// Converting binary text string to ASCII. 
	public static String binaryToAscii(String text) {
	    
		String ascii = "";

		// looping through 'text' arg to find the length of Binary characters.
	    for (int i = 0; i < text.length() / 8; i++) {
	    	// converting String to int && returning start and end of each word using substring.
	        int binary = Integer.parseInt(text.substring(8 * i, (i + 1) * 8), 2);
	        ascii += (char)binary;
	    }
		return ascii;
	}
	
	/**
	 * @param text  	finding the variable text from main.
	 * @return boolean  true if palindrome, false if not.
	 */

	// Checking if String text is a palindrome.
	public static boolean isPalindrome(String text) {
		String w = text;
		// getting the length of the word (w).
	    int len = w.length();
	    int fwd = 0;
	    // reversing the int to find repetition.
	    int rev = len - 1;
	    // looping through each char to find repetition, otherwise carry on looping.
	    while (rev > fwd) {
	    	// setting the value of chars from beginning.
	        char fwd_char = w.charAt(fwd++);
	        // finding the reverse value of chars from end to beginning.
	        char rev_char = w.charAt(rev--);
	        // if forward value and reverse value are not equal.
	        if (fwd_char != rev_char)
	            return false;
	    }
	    // if forward value and reverse value are equal.
	    return true;
	}

	}
