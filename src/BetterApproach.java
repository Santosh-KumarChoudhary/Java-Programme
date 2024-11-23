
public class BetterApproach {
	
	String name;
	int price;
	String model;
	
	public void show()
	
	{
		System.out.println("Brand name "+name +" Price : "+price + " model is "+model);
		
	}
	
	public static void main(String[] args) {
		
		BetterApproach b= new BetterApproach();
		b.name="Apple";
		b.price=20;
		b.model="Ultra 23";
		b.show();

		
	}
	
	
	

}
