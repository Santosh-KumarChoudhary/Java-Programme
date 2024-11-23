
public class ToStringUsages {
	
	public ToStringUsages(String name, String rollNumber, String house) {
		this.name = name;
		this.rollNumber = rollNumber;
		this.house = house;
	}
	String name;
	String rollNumber;
	String house;
	
	
public void display()

{
	System.out.println("Name "+name +"Roll Number :"+rollNumber +" House Name :"+house);
}

public String toString(){
	return "Students dertails :name "+ name +"rollNumber ::"+    rollNumber + "house :" +house +"";
			
}

public static void main(String[] args) {
	
	ToStringUsages us= new ToStringUsages("San","1234","Vivekanand");
	us.display();
System.out.println(us.toString());


String fname="San";

String lname="Choudhary";
String full_name=fname+lname;

System.out.println(full_name.toUpperCase());
	
	
}

}
