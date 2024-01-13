package stringUse;

public class StringMethods {

	public static void main(String[] args) {
		
		// .equal()
		String S1= "Shraddha";
		String S2= "Shraddha";
		String S3= "shraddha";
		String S4= new String("Shraddha");
		String S5= new String("Shraddha");
		boolean result =S1.equals(S2);
		System.out.println(result);
        System.out.println(S2.equals(S3)); //Using .equals method
        System.out.println("==========================");
        
        // "==" Operator 
        System.out.println(S1==S2);// Using == Operator
        System.out.println(S1==S3);
        System.out.println(S1==S4);
        System.out.println(S4==S5);
        System.out.println("==========================");
       
        // length()
        String s1 ="Velocity";
        int slength = s1.length();
        System.out.println(s1.length());
        System.out.println(slength);
        System.out.println("==========================");
        
        //isEmpty()
        String a1 = "Pune";
        String a2 = "";
        String a3 = " ";
        boolean isEmpty = a2.isEmpty();
        System.out.println(a3.isEmpty());
        System.out.println(isEmpty);
        System.out.println("==========================");
        
        //isBlank()
        System.out.println(a1.isBlank());
        System.out.println(a3.isBlank());
        System.out.println("==========================");
        
        // contains()
        String b1 ="MUMBAI";
        System.out.println(b1.contains("A"));
        System.out.println(b1.contains("MBA"));
        System.out.println(b1.contains("MAI"));
        System.out.println("==========================");
        
        //charAt()
        String c1= "Katraj";
        String c2= "Shraddha";
        char mychar =c1.charAt(1);
        System.out.println(mychar);
        System.out.println(c2.charAt(6));
        System.out.println("==========================");
        
        //endsWith()
        String d1 ="Velocity";
        System.out.println(d1.endsWith("city"));
        System.out.println(d1.endsWith("loc"));
        System.out.println("==========================");
        
        //startsWith()
        boolean s = d1.startsWith("Vel");
        System.out.println(s);
        
        System.out.println(d1.startsWith("loc",2));
        System.out.println("==========================");
        
        //conCat()
        String d2 ="My name is ";
        String d3 ="Shraddha";
        System.out.println(d2.concat(d3));
        System.out.println("==========================");
        
        //indexOf()
        String f1= "Katraj";
        int index =f1.indexOf('t');
        System.out.println(index);
        System.out.println(f1.indexOf("raj"));
        System.out.println(f1.indexOf("r", 0));
        System.out.println(f1.indexOf(f1, index));
	}

}

       
        