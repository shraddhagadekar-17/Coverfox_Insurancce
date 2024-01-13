package constructorUse;

public class Test {
   
	//variable declaration
	int a;
    int b;
    int c;
	String n;
    public Test()
	{
	    a=45;
	    b=10;
	    c=90;
	    System.out.println(a+b+c);
    	System.out.println("My city name is Pune");
	}
	
    public Test(int x,int y)
    {
    	a=x; //Value of x assign to the variable a
    	b=y; //Value of y assign to the variable b
    }

	public Test(int x,int y,int z,String name, String name1)//Constructor with parameter
	{
	    a=x;  //Value of x assign to the variable a
	    b=y;  //Value of y assign to the variable b
	    c=z;//Value of z assign to the variable c
	    n=name;
	    System.out.println("My City name is "+name); 
	    System.out.println("My Dream Project is "+name1);

	}
    
    
    public static void main(String[] args) {
		// Creating object 
       
    	Test t = new Test();
        t.addition();
	    Test t1 = new Test(100,200);//Object created of constructor with 2 parameters
	    t1.addition();
	    Test t2 = new Test(50,100,200,"Pune","Smart City");//Object created for constructor of 5 parameter
	    t2.subtraction();	
	    t2.addition();
        Test t3 = new Test(10,20,30,"Shraddha","Vikas");
        t2.subtraction();
    }
 
	public void addition()
	{
		int sum;
		sum=a+b+c;
		System.out.println("Addition is "+sum);
	}
    
	public void subtraction()
	{
	    int sub;
	    sub=a-b-c;
	    System.out.println("Subtraction is "+sub);
	    System.out.println("My city name is "+n);
	}

}

