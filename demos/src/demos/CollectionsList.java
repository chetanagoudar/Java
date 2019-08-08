package demos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;




public class CollectionsList {

	public static void main(String[] args) {
		
		//ArrayList and ListIterator usage
		ArrayList<String> names = new ArrayList<>();
		names.add("Denaerys");
		names.add("John");	
		names.add("Sansa");
		names.add("Robert");
		
		
		ListIterator<String> li = names.listIterator();
		System.out.println("\nTraversing ArrayList in forward direction");
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		
		System.out.println("\nTraversing ArrayList in reverse direction");
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
		
		//Linked list
		LinkedList<String> list = new LinkedList<>();
		
		list.add("Lekhana");
		list.add("Akila");	
		list.add("Madhu");
		list.add("Priyanka");
		
		System.out.println("\nTraversing linked list");
		for(String name:list) {
			System.out.println(name);
		}
		
		list.removeFirst();
		list.removeLast();
		
		
		System.out.println("\n\nLinked list after deleting the first and last elements");
		for(String name:list) {
			System.out.println(name);
		}
		
		list.addFirst("Raksha");
		list.addLast("preeti");
		System.out.println("\nLinked list after adding elements in the first and last");
		Iterator<String> it = list.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	}
}
