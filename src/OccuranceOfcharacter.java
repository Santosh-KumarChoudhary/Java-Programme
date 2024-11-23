
public class OccuranceOfcharacter {
	
	public static void main(String[] args) {
		
		String name ="java a programming a java language java";
		
		
	int origlength=	name.length()	;	
	
	System.out.println("origlength is "+origlength);
	
	
	
	int removeda=name.replace("java","").length();
	
	System.out.println("removeda "+removeda);
	
	
	
	int occCount=origlength-removeda;
	
	System.out.println("total count of a is "+occCount);
		
	}

}


