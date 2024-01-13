package collectionStudy;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorUse {

	public static void main(String[] args) {
	   Vector<Object> v = new Vector<Object>();
	   v.add("Shraddha");
	   v.add(1000);
	   v.add(50.6877f);
	   v.add('V');
	   v.add("MH");
	   v.add(true);
	   
	   System.out.println(v);
	   
	   System.out.println(v.capacity());
	   
	   System.out.println(v.contains('V'));
	   
	  // v.clear();
	  // System.out.println(v);
	   
	   Object v1 = v.clone();
	   System.out.println(v1);
	   
	   v.elementAt(1);
       System.out.println(v.elementAt(1));
       
       System.out.println(v.firstElement());
       
       System.out.println(v.get(3));
       
       System.out.println(v.lastElement());
       System.out.println("================for each loop================");
       for(Object vect:v)
       {
    	   System.out.println(vect);
       	   
       }
       System.out.println("=================iterator===================");
        Iterator<Object> it = v.iterator();
         while(it.hasNext())
         {
        	 System.out.println(it.next());
         }
        
         System.out.println("================enumeration=================");
         
          Enumeration<Object> ele = v.elements();
          while(ele.hasMoreElements())
          {
        	  System.out.println(ele.nextElement());
        	  
          }
         System.out.println("=================list eterator================="); 
         
         ListIterator<Object> lit = v.listIterator();
         while(lit.hasNext())
         {
        	 System.out.println(lit.next());
        	 
         }
        
         System.out.println("==================for loop=======================");
         
         for(int i=0;i<=v.size()-1;i++)
         {
        	 System.out.println(v.get(i));
         }
        
	
	}

}
