
public class SwitchPro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num =11;
		
		if(num==1)
		{
			System.out.println("Number is 1");
		}
		else if(num==2)
			
		{
			System.out.println("Number is 2");
		}
		else
		{
			System.out.println("It was not 1 or 2");
		}
		
		
		String browser= "Firefoxd";
		
		if (browser.equals("Chrome"))
			
		{
			System.out.println("Chrome Browser selected");
		}
		else if (browser.equals("Firefox"))
			
		{
			System.out.println("firefox selected");
		}
		else if(browser.equals("Safari"))
			
		{
			System.out.println("Safari selected");
		}
		else 
		{
			System.out.println("Its a edge/exploere");
		}
		
		//String switchValue="Chrome";
		
		switch ("miniy") {
		case "Chrome":
		{
			System.out.println("Chrome selected");
		}
		break;
		case "Firefox":case "Opera": case "mini":
		{
			System.out.println("Switched to firefox/Opera/mini");
			break;
		}
		
		case "safari":
			
		{
			System.out.println("Switched to safari");
			
		}
		
		case "other":
			
		{
			System.out.println("It's another browser");
			break;
		}
		default:
			System.out.println("Default Chrome selected");
			break;
		
		}
		
		
		
				

	}

}
