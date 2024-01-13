package abstractClassStudy;

public class Principal extends Student{

	public static void main(String[] args) {
		Principal p = new Principal();
		p.height();
		p.marks();

	}

	@Override
	public void marks() {
		System.out.println("Priya's marks is 65");
		
	}

	@Override
	public void height() {
		System.out.println("Abhijit's Height is 6 feet");
		
	}

}
