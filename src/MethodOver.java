
public class MethodOver {
	public static void main(String[] args) {
		
		MethodOver m1=new MethodOver();
		
		int a=m1.calculateScore("Santosh", 123);
		System.out.println("new val "+a);
		System.out.println(m1.calculateScore("xoxo", 14));
		
	}

	
	public int calculateScore(String playerName, int Score)
	
	{
		
		System.out.println("Player "+playerName +" Scored "+Score);
		
		return Score *100;
	}
			
}
