package week3assignment;

public class Palindrome {

	public static void main(String[] args) {
		
		String value="mom";
		String rev="";
		char[] charArray = value.toCharArray();
		
		for (int i = charArray.length-1; i >= 0 ; i--) {
			rev=rev+charArray[i];
		}
			if(value.equals(rev)) {
				System.out.println("It is a Palindrom");
			}
			else {
				System.out.println("its not a palindrome");
			}
			}
			
		}
	
/*
 * Pseudo Code
 * a) Declare A String value as"madam"
 * b) Declare another String rev value as ""
 * c) Iterate over the String in reverse order
 * d) Add the char into rev
 * e) Compare the original String with the reversed String, if it is same then print palinDrome 
 * Hint: Use .equals or .equalsIgnoreCase when you compare a String 
 */