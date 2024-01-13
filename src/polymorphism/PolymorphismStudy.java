package polymorphism;

public class PolymorphismStudy extends PolymorphismUse{

	public static void main(String[] args) {
		PolymorphismStudy ps = new PolymorphismStudy();
		ps.test();
		PolymorphismUse p = new PolymorphismUse();
		p.test();
       
	}
   public void test()
   {
	   int a=900;
	   int sum=a+90;
	   System.out.println("Sum is "+sum);
   }
}
