
public class GetterAndSetterCalling {
	
	public static void main(String[] args) {
		
		GetterAndSetter redcolor=new GetterAndSetter("Red");
		System.out.println(redcolor.getColor());
		
		
		//System.out.println("anothercolor "+anothercolor);
		
	//	GetterAndSetter redcolor2=new GetterAndSetter("PINK");
		
		

		GetterAndSetter anothercolor= redcolor;
		
		anothercolor.setColor("Green");
		
		//System.out.println("anothercolor"+anothercolor);

		System.out.println(anothercolor.getColor());
		
		System.out.println(redcolor.getColor());
		
		
		
		
		
		
		
	}

}
