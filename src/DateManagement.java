import java.time.Clock;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateManagement {
	
	public static void main(String[] args) {
		
		
		//get the current date and time
	LocalDateTime time= LocalDateTime.now();
	System.out.println("Local time is "+time);
	
	LocalDateTime futureTime=time.plusHours(2);
	LocalDateTime pastTime=time.minusHours(2);
	
	System.out.println("futureTime"+futureTime);
	System.out.println("past time "+pastTime);
	DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");	
	String formattedTime=time.format(formatter);
	System.out.println("formattedTime "+formattedTime);
	// dateTime = LocalDateTime.now(Clock.systemUTC());
	String name= "hello Java";
	
String lowe=	name.toLowerCase();
//System.out.println("lower case "+lowe);
lowe = lowe.replaceAll("\\s+","").toLowerCase();

System.out.println("Lowered case "+lowe);


	}

}
