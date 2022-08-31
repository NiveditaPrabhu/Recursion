/* Nivedita Prabhu 05/05/2022
 * Assignment - Recursive Algorithms 
 * Recursion Class
 */
import java.util.*;

public class Recursion {

	//returns the nth fibonacci number
	public static int fib(int n) {
		
		//Sets scenario for if n is equal to 0
		if (n == 0) {
			//returns 0
			return 0;
		}
		//Sets scenario for if n is equal to 1 or 2
		else if (n == 1 || n == 2) {
			//returns 1
			return 1;
		}
		//Sets scenario for is none of the above conditions are true
		else {
			//returns the fibonacci numbers of the previous two numbers before n by calling the fib method 
			return (fib(n-1)) + (fib(n-2));
		}
	}
	
	//returns the reverse of the string s
	public static String reverse(String s) {
		
		//Sets scenario for if the string s has none or only 1 character
		if (s.length() == 0 || s.length()==1) {
			//returns s
			return s;
		}
		//Sets scenario for if the above condition is not true
		else {
			//returns the reverse of the string when the first character of s is removed, and concatenates with the first character of s
			return reverse(s.substring(1)) + s.charAt(0);
		}
	}
	
	//returns true if the string s is a palindrome and false if s is not a palindrome
	public static boolean isPalindrome(String s) {
		
		//Sets scenario for if the reverse of s is equal to s
		if (s.equalsIgnoreCase(reverse(s))) {
			//returns true
			return true;
		}
		//Sets scenario for if the above condition is not true
		else {
			//returns false
			return false;
		}
	}
}
