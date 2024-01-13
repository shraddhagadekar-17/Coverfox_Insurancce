package collectionStudy;

import java.util.ArrayList;

public class ArrayListUse {

	public static void main(String[] args) {
		
		//ArrayList Declaration
		ArrayList<Object> al = new ArrayList<Object>();
		
		al.add("Vikas");
		al.add(100);
		al.add('S');
		al.add("Pune");
		al.add("Maharashtra");
		
		System.out.println(al);
		
		al.add(1, 200);
		System.out.println(al);
		System.out.println("====================================");
		
		//al.clear();
		//System.out.println(al);
		
		System.out.println(al.isEmpty());
		
		Object newal = al.clone(); // Clone means Duplicate
		System.out.println(newal);
		
		System.out.println(al.contains("Shraddha")); // It check specific element is present or not in array
		System.out.println("====================================");
		
		al.ensureCapacity(3); // It ensures minimum capacity 
		//al.add("Chakan");
		System.out.println(al);
		
		System.out.println(al.equals(newal)); // It compares elements of two arrays. It is same or not
		
		System.out.println(al.get(2)); //This method gives element of that index in output
		
		System.out.println(al.indexOf("Pune")); // This method gives index no. of particular element passed by parameter
		
		System.out.println(al.remove(2)); //This method remove element of that index
		System.out.println(al);
		
		al.set(0,"Shraddha"); // This method used to replace element of that index 
		System.out.println(al);
		
		System.out.println(al.size()); //This method gives size of actual element present in array
	}
}
