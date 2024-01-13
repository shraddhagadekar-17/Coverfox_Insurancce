package methodsUse;

public class StudentInfo {

	public static void main(String[] args) {
	     StudentInfo si = new StudentInfo();
	     si.studentDetails();
	     si.studentDetails("Shraddha",70, 50.60f, 'F');

	}
public void studentDetails()
{
	String name;
	int rollNum;
	float avg;
	char gender;
	name="Shraddha";
	rollNum=30;
	avg=80.89f;
	gender='F';
	System.out.println("Student name is "+name);
	System.out.println("Student roll number is "+rollNum);
	System.out.println("Student Result is "+avg);
	System.out.println("Student gender is "+gender);
}

public void studentDetails(String name,int rollNum, float avg, char gender)
{
	System.out.println("Student name is "+name);
	System.out.println("Student roll number is "+rollNum);
	System.out.println("Student average marks is "+avg);
	System.out.println("Student gender is "+gender);
	
	
}
}
