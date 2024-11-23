import java.util.Scanner;

public class CountWords {
	public static void main(String[] args) {
	
		
	String s=	"  sa";
	
	int count =1;
	
	for(int i=0;i<s.length();i++)
	{
		if((s.charAt(i)==' ') && (s.charAt(i+1)!=' '))
		
		{
			count++;
		}
	}
	
	
	System.out.println("Count is "+count);
	
		
	}

}
