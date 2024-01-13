package methodsUse;

public class MathOperations {

	public static void main(String[] args) {
		// to call non static method create object of this class
		MathOperations mo = new MathOperations();
		mo.addition();
		mo.addition(55, 23, 99);
		mo.subtraction(10, 20, 30);

	}
public void addition()
{
	int a;
	int b;
	int sum;
	a=10;
	b=30;
	sum =a+b;
	System.out.println("Addition is "+sum);
}

public void addition(int a,int b,int c)
{
	int sum;
	sum=a+b+c;
	System.out.println("Addition is "+sum);
}

public void subtraction(int a,int b,int c)
{
	int sub;
	sub=a-b-c;
	System.out.println("Subtraction is "+sub);
}
}
