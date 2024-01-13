package variableUse;

public class Demo1 {

	//Declare global variable
	int a;
	String name;
	//Declare static variable
	static int rollNum;
	static float height;
	
	public Demo1()
	{
		a=100;
		name="Pune";
	}
	
	public static void main(String[] args) {
		//Create object 
		Demo1 d1=new Demo1();
		d1.method1();
        staticUse();
       
	}
public void method1()
{
	int x;
	x=a;
	String n;
	n=name;
	System.out.println("X value is "+x);
	System.out.println("My city name is "+n);
}
public static void staticUse()
{
	rollNum=90;
	height=5.6f;
	System.out.println("My roll number is "+rollNum);
	System.out.println("My height is "+height);
}
}
