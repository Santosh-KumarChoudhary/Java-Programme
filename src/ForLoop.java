
public class ForLoop {
	
	public static void main(String[] args) {
		
	
		
		for(double rate =10;
				
				rate<=50;//50
				
				rate=rate+5)//15
			
		{
			double intRate=calInterset(100,rate);//15
			
			System.out.println("Rs 100 at "+rate +" % inetrset = " +intRate);// 10,15
		}
		
		
		System.out.println("***************");
		
		
		System.out.println(calInterset(120,5));
		System.out.println(calInterset(120,10));
		System.out.println(calInterset(120,15));
		System.out.println(calInterset(120,20));
		System.out.println(calInterset(120,25));
		System.out.println(calInterset(120,30));
		System.out.println(calInterset(120,35));

		
		
	}
	
	
	public static double calInterset(double amount , double intersetRate)
	
	{
		
		return(amount*(intersetRate/100));
	}
	
	

}
