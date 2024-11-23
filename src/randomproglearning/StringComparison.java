package randomproglearning;

public class StringComparison {
	
	public static void main(String[] args) {
		
		
		String name="San";
		
		String name2="San";
		
		
		String rev="";
		
		for(int i=name.length()-1;i>=0;i--)
			
		{
			
			char c[]= name.toCharArray();
			rev=rev+c[i];
		}
		
		System.out.println("Reversed String "+rev);
		
		
		System.out.println(name==name2);
		System.out.println(name.equals(name2));
		
		String name3=new String("San");
		
		
		String name4=new String("San");
		
		System.out.println(name3.equals(name));

		
		System.out.println(name3==name4);
	}

}
