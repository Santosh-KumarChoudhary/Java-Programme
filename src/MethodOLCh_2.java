
public class MethodOLCh_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println(getDurationStriing(3905));

	}
	
	public static String getDurationStriing(int seconds)
	
	{
	if(seconds<=0)
	{
		return "invalid data for seconds( "+seconds+"), must be postive integer value";
	}
	int minutes= seconds/60;
	int hours=minutes/60;
	System.out.println("Hours = "+hours);
	int remminutes=minutes%60;
	System.out.println("remaining minutes "+remminutes);
	int remseconds=seconds%60;
	System.out.println();
		getDurationStriing( 12,2);
		return hours +"h "+remminutes+"m "+remseconds+"s ";
	}
	
	public static String getDurationStriing(int minutes,int seconds)
	
	{
		if (minutes<=0 || seconds<=0 || seconds >=60)
		{
			System.out.println("Invalid time format");
		}
		
		return "XXh YYm ZZs";
	}


}
