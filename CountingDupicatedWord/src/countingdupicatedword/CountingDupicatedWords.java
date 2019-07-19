/*
In the name of Allah, the Gracious, the Merciful
 */
package countingdupicatedword;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author ibrahim
 */
public class CountingDupicatedWords {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
// create HashMap to store String keys and Integer values
		Map<String, Integer> myMap = new HashMap<>();
		createMap(myMap); // create map based on user input
		displayMap(myMap); // display map content
	}
// create map from user input

	private static void createMap(Map<String, Integer> map) {
		Scanner scanner = new Scanner(System.in); // create scanner
		System.out.println("Enter a string:"); // prompt for user input
		String input = scanner.nextLine();
// tokenize the input
		String[] tokens = input.split(" ");
// processing input text
		for (String token : tokens) {
			String word = ignorePuncituation(token); // we must ignore punc. in the for loop, because it ignores spaces, too.
// if the map contains the word
			if (map.containsKey(word)) // is word in map
			{
				int count = map.get(word); // get current count
				map.put(word, count + 1); // increment count
			} else {
				map.put(word, 1); // add new word with a count of 1 to map
			}
		}
	}
// display map content

	private static void displayMap(Map<String, Integer> map) {
		Set<String> keys = map.keySet(); // get keys
// sort keys
		TreeSet<String> sortedKeys = new TreeSet<>(keys);
		System.out.printf("%nMap contains:%nKey\t\tValue%n");
// generate output for each key in map
		for (String key : sortedKeys) {
			if((int)map.get(key) != 2)
				continue;
			System.out.printf("%-10s%10s%n", key, map.get(key));
		}
		System.out.printf(
				"%nsize: %d%nisEmpty: %b%n", map.size(), map.isEmpty());
	}
	
	private static String ignorePuncituation(String string) {
		string = string.toLowerCase();
		String newString = "";
		for (int i = 0; i < string.length(); i++) {
			if ((string.charAt(i) >= 'a' && string.charAt(i) <= 'z')) {
				newString += string.charAt(i);
			}
		}
		return newString;
	}

}
