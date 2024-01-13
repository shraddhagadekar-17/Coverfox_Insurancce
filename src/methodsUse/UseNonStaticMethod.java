package methodsUse;

public class UseNonStaticMethod {

	public static void main(String[] args) {
		// How to call non-static method in same class
		//Firstly create object
		//Syntax:- ClassName ObjectName = new ClassName();
		UseNonStaticMethod call = new UseNonStaticMethod(); 
        
		//call method Syntax:- ObjectName.MethodName();
		call.name();
		call.city();
	    // How to call different class method
	    // Create object of that class
		
		AnotherClass call1 = new AnotherClass();
		call1.student1();
		call1.student2();
	
	
	}
    public void name()
    {
    	System.out.println("MY NAME IS SHRADDHA ");
    }
    public void city()
    {
    	System.out.println("MY CITY NAME IS PUNE");
    }

}



