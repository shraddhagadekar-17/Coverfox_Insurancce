package arrayStudy;

import java.util.Arrays;

public class Array2 {

	public static void main(String[] args) {
		String actors[]= {"Ranveer","Akshay","Varun","Bobby","Salman"};
		
		Arrays.sort(actors);
		for(int i=0;i<=actors.length-1;i++)
		{
			System.out.println(actors[i]);
		}

	}

}
