/*
In the name of Allah, the Gracious, the Merciful
 */
package lettertypecount;

import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;
import java.util.Scanner;

/**
 *
 * @author ibrahim
 */
public class LetterTypeCount {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		// create HashMap to store String keys and Integer values
		Map<Character, Integer> myMap = new HashMap<>();
		createMap(myMap); // create map based on user input
		displayMap(myMap); // display map content

	}

	// create map from user input
	private static void createMap(Map<Character, Integer> map) {
		Scanner scanner = new Scanner(System.in); // create scanner
		System.out.println("Enter a string:"); // prompt for user input
		String input = scanner.nextLine();
		char[] letters = input.toLowerCase().toCharArray();
		for(char letter : letters){
			if (map.containsKey(letter)) // is letter in map
			{
				int count = map.get(letter); // get current count
				map.put(letter, count + 1); // increment count
			} else {
				map.put(letter, 1); // add new letter with a count of 1 to map
			}
		}
	}
	// display map content

	private static void displayMap(Map<Character, Integer> map) {
		Set<Character> keys = map.keySet(); // get keys
	// sort keys
		TreeSet<Character> sortedKeys = new TreeSet<>(keys);
		System.out.printf("%nMap contains:%nKey\t\tValue%n");
	// generate output for each key in map
		for (char key : sortedKeys) {
			System.out.printf("%-10s%10s%n", key, map.get(key));
		}
		System.out.printf(
				"%nsize: %d%nisEmpty: %b%n", map.size(), map.isEmpty());
	}

}
