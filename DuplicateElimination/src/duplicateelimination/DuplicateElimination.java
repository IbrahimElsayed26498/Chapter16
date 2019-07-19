/*
In the name of Allah, the Gracious, the Merciful
 */
package duplicateelimination;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author ibrahim
 */
public class DuplicateElimination {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		Set<String> firstNames = new TreeSet<>();
		Scanner input = new Scanner(System.in);
		
		for(int i=0; i<5; i++){
			System.out.print("First name : ");
			firstNames.add(input.next());
		}
		
		viewSet(firstNames);
		
		System.out.println();
		System.out.print("Search  : ");
		String firstName = input.next();
		
		System.out.printf("fist name %s found%n", firstNames.contains(firstName) ? "" : "dose not");
	}
	
	public static void viewSet(Set set){
		System.out.println("List with first names : ");
		for(Object element : set){
			System.out.print(element + " ");
		}
		System.out.println();
	}
	
}
