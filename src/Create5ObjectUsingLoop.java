
public class Create5ObjectUsingLoop {
	
	
	String name;
	String dob;String classlists; String id;
	
	public static void main(String[] args) {
		
		
	
		
		for(int i=1;i<=5;i++)
			
		{
			Create5ObjectUsingLoop s= new Create5ObjectUsingLoop("san"+i,
			switch(i){
			
			
			case 1 -> "San";
			},	
			
			"20/08/1995", "Santosh","SAn123");
			
			s.printmethod();

		}
		
		//Create5ObjectUsingLoop obj =new Create5ObjectUsingLoop("sa","jhgf","jgh","ouyg");
		
	}
	
	
	Create5ObjectUsingLoop(String id, String dob,String classlists, String name)
	
	{
	this.name=name;
	
	this.dob=dob;
	this.classlists=classlists;
	this.id=id;
	}
	
	public void printmethod()
	
	{
		System.out.println("Name is "+name+" dob : "+dob+" classlists :"+classlists +" and Id :"+id);
	}

}
