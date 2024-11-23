
public class TestifElse {
	
	public static void main(String[] args) {
		
			
		
		System.out.println("Final score is "+calcScore(1000,200,true,5));
		
		
		
	}
	
	public static int calcScore(int score, int bonus, boolean gameOver, int levelCompleted)
	
	{
		
		int finalscore=score;
		
		//System.out.println("First final score "+finalscore);

		if(gameOver)
		{
		finalscore= finalscore+(score*levelCompleted);
		finalscore+=1000;
		
				
		}
		
		return finalscore;

		
	}

}
