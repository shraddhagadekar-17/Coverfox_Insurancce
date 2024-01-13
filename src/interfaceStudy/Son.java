package interfaceStudy;

public class Son implements Father,Mother{

	public static void main(String[] args) {
		Son s = new Son();
		s.hardwork();
		s.honesty();
		s.look();
		s.nature();

	}

	@Override
	public void look() {
		System.out.println("Mother's look ");
		
	}

	@Override
	public void nature() {
		System.out.println("Mother's Nature");
		
	}

	@Override
	public void hardwork() {
		System.out.println("Father's hardwork");
		
	}

	@Override
	public void honesty() {
		System.out.println("Father's honesty");

	}

}
