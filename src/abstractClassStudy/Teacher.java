package abstractClassStudy;

public class Teacher extends Student{

	public static void main(String[] args) {
	     Teacher t = new Teacher();
	     t.marks(); 
	     t.height();
	     t.weight(); //calling abstract class non-static method
	     t.subject(); //calling concrete class own non-static method

	}

	@Override
	public void marks() //Abstract class incomplete method completed in concrete class(Teacher) 
	{
		int a=80;
		System.out.println("Sachin's marks is "+a);
		
	}

	@Override
	public void height() //Abstract class incomplete method completed in concrete class(Teacher)
	{
	    float h=5.2f;
	    System.out.println("Meera's height is "+h);
		
	}
    
	public void subject() //Concrete class own method
    {
    	System.out.println("Teacher Manasi's Subject is English");
    }
}
