
public class SwitchEnahanced {
	
	public static void main(String[] args) {
		
		String month = "Dec";
		System.out.println( month +" is in the " +quarterMonth(month) + " quarter");
		System.out.println("employee is eligible for "+ incper(130));
		
	}
	
	
	public static String quarterMonth(String month)
	
	{
		
		switch (month)
		
		{
		case "Jan" :
		case "Feb":
		case "March":
			return "1st";
			
			
		case "Apr":
		case "May":
		case "June":
			
			return "2nd";
			
		case "July":
		case "Aug":
		case "Sep":
			return "3rd";
			
		case "Oct":
		case "Nov":
		case "Dec":
			return "4th";
				
		
			
		
		}
		
		return "Bad";
	}
	
	public static String incper(int value)
	
	{
		return switch (value)
				
				
				{
				
				case 10 -> "10 % hike";
				
					
				case 20 -> "20% hike";
				
				case 30 -> "30% hike";
				
				case 40 -> "40% hike";
				
				case 50 ->"50% hike";
				
				case 60 -> "60% hike ";
				case 70 -> "70 % hike";
				
				case 80 -> "80 % hike";
				
				case 90 -> "90% hike";
				
				case 100 ->"100% hike";
				
				
				default ->
				
				{
				String bad  =value + " and its a bad";
				
				yield bad;
				}
			
				
		
	};
		
	}
	
	
	
}