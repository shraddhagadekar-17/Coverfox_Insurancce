package arrayStudy;
import java.util.Arrays;
public class Array1 {

	public static void main(String[] args) {
		
		char[] alpha = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		
        for(int i=alpha.length-1;i>=0;i--)
        {
        	System.out.println(alpha[i]);
        }
	     System.out.println("=====================================");
       
	    int marks[] = {45,89,20,50,70};
	    Arrays.sort(marks);
	    for(int i=0;i<=marks.length-1;i++)// Ascending Order
	    {
	    	System.out.println(marks[i]);
	    }
        System.out.println("=========================================");
	    
        for(int i=marks.length-1;i>=0;i--)// Descending Order
	    {
	    	System.out.println(marks[i]);
	    }
}
}