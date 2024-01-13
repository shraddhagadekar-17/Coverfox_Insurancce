package inheritanceStudy;

public class SimpleInheritanceUse extends SimpleInheritance{

	public static void main(String[] args) {
		SimpleInheritanceUse s1 = new SimpleInheritanceUse();
		s1.scooty();
        s1.nature();
	}
    public void scooty()
    {
    	System.out.println("This is my Scooty");
    }
    public void nature()
    {
    	System.out.println("My husbands nature is good");
    }

}
