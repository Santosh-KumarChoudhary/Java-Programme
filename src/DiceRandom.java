
public class DiceRandom {
	double num ;

	
	public static void main(String[] args) {
		
		DiceRandom ran= new DiceRandom();
		
System.out.println(ran.roll());
		
	
	}
	
	int roll()
	
	{
		for(int i=1;i<=10;i++)
		 num=Math.random();
		//num*6;
		System.out.println(num);

		return (int)Math.ceil(num);
		/**
		 * @param guess the number
		 */
	}

}