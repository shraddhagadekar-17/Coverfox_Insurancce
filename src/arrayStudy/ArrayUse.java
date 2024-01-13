package arrayStudy;

public class ArrayUse {

	public static void main(String[] args) {
		
		String players[] = new String[10];
		players[0] ="Sachin";
		players[1] ="Rohit";
		players[2] ="Virat";
		players[3] ="Rahul";
		players[4] ="Jadeja";
		
		System.out.println(players[0]);
		System.out.println(players[1]);
		System.out.println(players[2]);
		System.out.println(players[3]);
		System.out.println(players[4]);
	    System.out.println(players[5]);
        System.out.println("===================================");
	
        for(int i=0;i<=4;i++)
	{
		System.out.println(players[i]);
	}
       int rollNo[] = new int[5]; 
       rollNo[0]=10;
       rollNo[1]=11;
       rollNo[2]=12;
       rollNo[3]=13;
       rollNo[4]=14;
       
       for(int j=0;j<=4;j++)
       {
    	   System.out.println(rollNo[j]);
       }
       
       for(int i=0;i<=rollNo.length-1;i++)
       {
    	   System.out.println(rollNo[i]);
       }
        
        
        
        
        
        
        
        
        
        
  }
}