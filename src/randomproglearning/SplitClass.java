package randomproglearning;

public class SplitClass {
	
	public static void main(String[] args) {
		
		String name ="xXsanxXToshxXkumarxXChoudharyxX";
	int tram=	name.length();
	System.out.println("Tram "+tram);
	String [] trimmed=	name.split("xX");
	//System.out.print(trimmed[0] +" "+trimmed.length);
	
	System.out.println();
	System.out.println(trimmed[0].length()+"  Index length");
	
for(String c:trimmed)
	
{
	System.out.print(c);
}
	
	
		
	}

}
