/*
In the name of Allah, the Gracious, the Merciful
 */
package treesetwords;

import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author ibrahim
 */
public class TreeSetWords {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<>();
		System.out.println("Enter String :");
		Scanner input = new Scanner(System.in);
		String[] strings = input.nextLine().split(" ");
		
		for(String string : strings){
			treeSet.add(string);
		}
		
		System.out.println(treeSet);
	}
	
}
