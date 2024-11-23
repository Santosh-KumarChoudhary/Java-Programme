
public class ForLoopExt {

	public static void main(String[] args) {
		
		table(5,50);

	}

	// 2+2+2+2+2++....20+2

public static void table(int intialzation ,int conditionvalue)
{
	for (int i = intialzation; i<=conditionvalue;i=i+intialzation)
		
		
	{
		
		System.out.println("table :"+ i);
		
		if(i==40)
			
		{
			break;
		}
	}
	
	
	System.out.println("loop completed");

}


}
