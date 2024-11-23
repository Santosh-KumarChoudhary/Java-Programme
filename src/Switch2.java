
public class Switch2 {
	
	public static void main(String[] args) {
		
		switchMethod(51);
		
	}
	
	public static void switchMethod(int value)
	
	{
		
		
		
		switch( value)
		
		{
		case 1: 
			System.out.println("Value was 1");
			break;
			
			
		case 2:
			System.out.println("value is 2");
			
		
			
		case 3: case 4: case 5:
			
		{
			System.out.println("Value is 3 , 4, 5");
			
			System.out.println("Switch value :" +value);
			break;
		}
			
			default :
				
				System.out.println("value was not 1,2,3,4,5");
		}
		
		

}}
