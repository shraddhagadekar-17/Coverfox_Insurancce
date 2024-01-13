package thisAndSuperKeyword;

public class SuperKeywordUse extends ThisKeywordUse{
    int a=800;// Non-static Global Variable
    static int b=1;// Static Global Variable
    
	public static void main(String[] args) {
		SuperKeywordUse s = new SuperKeywordUse();
		s.class1(); //Calling non-static method of Super Class(ThisKeywordUse)
		s.class2(); //Calling non-static method of Sub Class(SuperKeywordUse)
		s.class3(); //Calling non-static method of Sub Class(SuperKeywordUse)

	}
    public void class2() //Non-static complete method
    {
    	int a=10;
    	int sum=this.a+900;
    	System.out.println("Sum is "+sum);
    }

    public void class3() //Non-static complete method
    {
    	int sum1=this.a+b;
    	int sum=super.a+90;// Use of super keyword
    	System.out.println("Sum is "+sum);
    	System.out.println("Sum is "+sum1);
    }


}
