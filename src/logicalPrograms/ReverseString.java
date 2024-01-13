package logicalPrograms;

public class ReverseString {

	public static void main(String[] args) {
		String str= "HELLO";
		String result = "";
		for(int i=str.length()-1;i>=0;i--)
		
			result += str.charAt(i);
			System.out.println(result);
			
			String s = "ishaan";
			
			String k= new StringBuffer(s).reverse().toString();
			System.out.println(k);
		

	}

}
