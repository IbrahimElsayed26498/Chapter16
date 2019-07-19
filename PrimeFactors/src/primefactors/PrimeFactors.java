/*
In the name of Allah, the Gracious, the Merciful
 */
package primefactors;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author ibrahim
 */
public class PrimeFactors {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		for(int i=0; i<5; i++){
			int number = 0;
			try{
				number = input.nextInt();
			}catch(NumberFormatException e){
				System.out.println(e);
			}
			if(primeNumbers(number))
				System.out.println("Prime numebr " + number);
			else{
				Set<Integer> set = new HashSet<>();
				set = primeFactors(number);
				System.out.println("Prime factors are : " + set);
			}
		}
		
	}
	
	private static boolean primeNumbers(int number){
		if(number <= 0)
			return false;
		if(number == 2)
			return true;
		for(int i=2; i<number/2; i++){
			if(number %2 == 0)
				return false;
		}
		return true;
	}
	
	private static Set<Integer> primeFactors(int number){
		Set<Integer> set = new HashSet<>(); // hash set : no duplication
		for(int i=2; i<number; i++){
			if(number % i == 0){
				set.add(i);
				number = number/i;
				i = 2;
			}
		}
		return set;
	}
}
