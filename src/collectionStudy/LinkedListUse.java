package collectionStudy;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListUse {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Shraddha");
		ll.add("Diksha");
		ll.add("Sahil");
		ll.add("Prashant");
		ll.add("Sonali");
		ll.add("Apurva");
		
		System.out.println(ll);
		System.out.println("==============================================");
		System.out.println(ll.element());
		System.out.println(ll.getFirst());
		System.out.println(ll.offer("Sahil"));
		System.out.println(ll.peek());
		ll.poll();
		ll.pop();
		
		System.out.println("====================for each loop================");
		for(String l:ll)
		{
			System.out.println(l);
		}
        
		System.out.println("==================Iterator===================");
		Iterator<String> it = ll.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	    
		System.out.println("=====================list iterator====================");
		
		ListIterator<String> lit = ll.listIterator();
		while(lit.hasNext())
		{
			System.out.println(lit.next());
			
		}
		System.out.println("===============================================");
		while(lit.hasPrevious())
		{
			System.out.println(lit.previous());
			
		}
		
		System.out.println("=====================for loop=====================");
		
		for(int i=0;i<=ll.size()-1;i++)
		{
			System.out.println(ll.get(i));
		}
	}

}
