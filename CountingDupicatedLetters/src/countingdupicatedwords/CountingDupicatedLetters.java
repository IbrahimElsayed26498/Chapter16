/*
In the name of Allah, the Gracious, the Merciful
 */
package countingdupicatedwords;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author ibrahim
 */
public class CountingDupicatedLetters {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter String : ");
		char[] letters = ignorePuncituation
			(input.nextLine().toLowerCase()).toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		
		for (char letter : letters) {
			if (map.containsKey(letter)) { // if the letter is already exits
				int count = map.get(letter);
				map.put(letter, count + 1);
			} else {
				map.put(letter, 1);
			}
		}
		//display(map);
		displayDuplicated(map);
	}

	private static String ignorePuncituation(String string) {
		String newString = "";
		for (int i = 0; i < string.length(); i++) {
			if ((string.charAt(i) >= 'a' && string.charAt(i) <= 'z')) {
				newString += string.charAt(i);
			}
		}
		return newString;
	}

	private static void displayDuplicated(Map map) {
		Set<Character> keys = map.keySet(); // get keys
		// sort keys
		TreeSet<Character> sortedKeys = new TreeSet<>(keys);

		System.out.println("Duplicated letters");
		for (char key : sortedKeys) {
			if ((int) map.get(key) == 2) {
				System.out.print(key + " ");
			}
		}
		System.out.println();
	}
	
	private static void display(Map map) {
		Set<Character> keys = map.keySet(); // get keys
		// sort keys
		TreeSet<Character> sortedKeys = new TreeSet<>(keys);

		System.out.println("Duplicated letters");
		for (char key : sortedKeys) {
				System.out.print(key + "\t" + map.get(key) + "\n");
		}
		System.out.println();
	}
	
	
}
