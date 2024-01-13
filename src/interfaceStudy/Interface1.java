package interfaceStudy;

public class Interface1 implements Interface3{

	public static void main(String[] args) {
		Interface1 i1 = new Interface1();
        i1.method1();
        i1.method2();
        i1.test1();
        i1.test2();
	}

	@Override
	public void method2() {
	   System.out.println(Interface2.a);
		System.out.println("method2 method is completed in Interface1 class");
		
	}

	@Override
	public void test2() {
		System.out.println("test2 method completed in Interface1 class");
		
	}

	@Override
	public void method1() {
		System.out.println("method1 method completed in Interface1 class");
		
	}

	@Override
	public void test1() {
		System.out.println("test1 method completed in Interface1 class");
		
	}

}
