import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReadSpecificString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	      String logFilePath = "/Users/macos/Desktop/untitled folder/CVIP_APP_LOG_26102023_031728.txt"; // Replace with the path to your log file

	        // Define a regular expression pattern to capture the string and its value
	        String pattern = "StringName=(Free memory)\\s+Value=(200 MB)";

	        try (BufferedReader br = new BufferedReader(new FileReader(logFilePath)) ) {
	            String line;
	            Pattern regex = Pattern.compile(pattern);
	            while ((line = br.readLine()) != null) {
	                Matcher matcher = regex.matcher(line);
	                while (matcher.find()) {
	                    String stringName = matcher.group(1);
	                    String value = matcher.group(2);
	                    System.out.println("String Name: " + stringName);
	                    System.out.println("Value: " + value);
	                }
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	}

}
