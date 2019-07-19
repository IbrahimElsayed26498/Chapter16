/*
In the name of Allah, the Gracious, the Merciful
 */
package sortedlinkedlist;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author ibrahim
 */
public class SortedLinkedList {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		LinkedList<Integer> lList = new LinkedList<>();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 25 numbers (0-100) : ");
		int number = 0;
		for(int i=0; i<25; i++){
			System.out.printf("Numebr %d : ", i);
			number = input.nextInt();
			if(number < 0 || number > 25 ){
				i--;
				System.out.println("Number must be between 0 and 100");
				continue;
			}
			lList.add(number);
		}
		// sort the linked list
		Collections.sort(lList);
		Iterator<Integer> iterator = lList.iterator();
		
		int sum =0;
		float avg = 0.0f;
		
		while(iterator.hasNext()){
			sum+=iterator.next();
		}
		avg = (float)sum / lList.size();
		System.out.printf("Sum = %d%nAvarage = %f%n", sum, avg);
	}
	
}
