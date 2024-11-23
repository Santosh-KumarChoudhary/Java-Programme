
public class OverloadingChallenge {
	public static void main(String[] args) {
		
		System.out.println("5ft 8 inch "+convertToCentimeters(5,8));
		System.out.println(converToCentimeters(8));
		
		
	}
	
	
	
	public static double converToCentimeters(int inches)
	{
	
return inches * 2.54;
	
	
		
	}
	
	public static double convertToCentimeters(int feet , int inches)
	
	{
		
		int feetToInches=feet*12;
		int totalInches=feetToInches+inches;
		double result=converToCentimeters(totalInches);
		
		return result;
	}

}
