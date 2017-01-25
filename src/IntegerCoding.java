import java.util.Scanner;

/**
 * 
 */

/**
 * @author c.pruden
 *
 */
public class IntegerCoding {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner userInput = new Scanner(System.in);
		int userNumber;
		boolean isPrime;
		
		System.out.println("Please enter a number: ");
		userNumber = userInput.nextInt();
		
		isPrime = isPrime(userNumber);
		
		if(isPrime == true){
			System.out.println("Your number is prime");
		} else {
			System.out.println("Your number is not prime");
		}
		
		userInput.close();
	}
	
	/**
	 * isPrime checks whether or not a number is prime.
	 * @param number is the number to check
	 * @return whether or not the number is prime.
	 */
	public static boolean isPrime(int number){
		boolean result = true;
		

		for(int i = 2; result && i <= Math.sqrt(number); i++){
			if(number % i == 0){
				result = false;
			}
		}
		
		return result;

	}

}
