/* Nivedita Prabhu 05/05/2022
 * Assignment - Recursive Algorithms 
 * Recursion Tester
 */
public class RecursionTest {

	public static void main(String[] args) {
		//Outputs the 10th fibonacci number
		System.out.println("The 10th Fibonacci number is: "+ Recursion.fib(10));
		//Outputs the 5th fibonacci number
		System.out.println("The 5th Fibonacci number is: "+ Recursion.fib(5));
		
		//Outputs the reverse string of hat
		System.out.println("\nThe reverse of \"hat\" is: "+ Recursion.reverse("hat"));
		//Outputs the reverse string of racecar
		System.out.println("The reverse of \"racecar\" is: "+Recursion.reverse("racecar"));
		
		//Outputs if hat is a palindrome
		System.out.println("\nIs \"hat\" a palindrome?: "+Recursion.isPalindrome("hat"));
		//Outputs if racecar is a palindrome
		System.out.println("Is \"racecar\" a palindrome?: "+Recursion.isPalindrome("racecar"));

	}

}
