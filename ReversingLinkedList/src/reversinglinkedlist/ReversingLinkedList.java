/*
In the name of Allah, the Gracious, the Merciful
 */
package reversinglinkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author ibrahim
 */
public class ReversingLinkedList {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		LinkedList<Character> lList = new LinkedList<>();
		List<Character> reversedLList = new LinkedList<>();
		
		lList.add('a');
		lList.add('b');
		lList.add('c');
		lList.add('d');
		lList.add('e');
		
		ListIterator<Character> iterator = lList.listIterator(lList.size());
		while(iterator.hasPrevious())
			reversedLList.add(iterator.previous());
		
		System.out.println("Reversed Linked List : ");
		for(Iterator it = reversedLList.iterator(); it.hasNext(); ){
			System.out.println(it.next());
		}
	}
	
}
