package thisAndSuperKeyword;

public class ThisKeywordUse {
    int a=100;//Global non-static variable
    int b=10;
    
	public static void main(String[] args) {
		ThisKeywordUse t = new ThisKeywordUse();
        t.class1();
	}
   public void class1()
   {
	   int a=999;//Local non-static variable
	   int sum=a+100;
	   System.out.println("Sum is "+sum);
	   sum=this.a+b; // Use of this keyword 
	   System.out.println("Sum is "+sum);
   }
}
