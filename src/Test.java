
public class Test {
	public static void main(String[] args) {
		
		int newScore=playScore("San",100);
		
		System.out.println("New Score is "+newScore );
		
	}
	
	
	public static int playScore(String playerName , int score)
	
	{
		System.out.println("playerName :"+playerName +" has scored "+score );
		
		return 200*score;
	}

}
