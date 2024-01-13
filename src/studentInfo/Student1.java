package studentInfo;

public class Student1 {
     private int a=80;
     private int b=400;
     
	public static void main(String[] args) {
	 Student1 s =new Student1();
	 s.marks();
	 s.result();

	}
	 public void marks()
	  {
	   System.out.println("Student marks are "+a);

	  }
	   
	  public void result()
	  {
	    System.out.println("Student result is Pass");
	  }
}
