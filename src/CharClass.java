
public class CharClass {
	
	
	public static void main(String[] args) {
	
		String name="11234SanTU09S";
	//String lo=name.toLowerCase();
		
		int count =0;
		int count2 =0;
		int count3=0;
		int sValue=0;
		String vowels="";
		String digit="";
		String string="";
		for(int i=0;i<name.length();i++)
			
		{
			char c= name.charAt(i);
			//System.out.print("c "+c);
			
		
			if(Character.isLowerCase(c))
			{
				count++;
			}
			if(Character.isUpperCase(c))
			{
				count2++;
			}
			if(Character.isDigit(c))
			{
				count3++;
			}
			char up=Character.toLowerCase(c);
		
			if(up=='a' || up=='e' || up=='i' || up=='o' || up=='u')
				
			{
				sValue++;
				System.out.println("vowels are "+ up);
				vowels= vowels+up;
				
			}
			if(Character.isDigit(c))
			{
				digit=digit+c;
			}
			else
			{
				string=string+c;
			}
			
			
			
		}
		
		String overall= digit+string;
		System.out.println("Overall string "+overall);

		System.out.println("Total count of lower case "+count);

		System.out.println("Total count of digit is "+count2);

		System.out.println("Total count of digit is "+count3);

		System.out.println("Total count of digit is "+sValue);
		System.out.println("Vowels string  "+vowels);
		
		
		


		}


	}
	
	


