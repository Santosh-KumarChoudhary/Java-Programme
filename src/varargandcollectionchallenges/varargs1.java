package varargandcollectionchallenges;

public class varargs1 {
	
	
	public static void main(String[] args) {
	concatenateString("Hello " ,"San");
	}
	
	public static void concatenateString(String... name)
	
	{
		
		
		StringBuilder sb= new StringBuilder();
		 sb.append(name).append(" ");
		 
		 System.out.println(sb.toString()+name);
		
	/**	for(String s: name)
			
		{
		sb.append(s).append(" ");
		}
		
		return sb.toString();
		return name;
	}
	*/
		 
		// return sb.toString();

}
}