package GetterSetter;

public class Car {
	
	private String color;
	
	private String model;
	
	private double fuelLevel;
	private long price;
	
	
	
	public String getcolor()
	
	{
		return color;
	}
	
	public String getmodel()
	{
		return model;
		
	}
	
	public double getfuelLevel()
	
	{
		return fuelLevel;
	}
	
	public Car(String color, String model , double fuelLevel, long price)
	
	{
		this.color=color;
		this.model=model;
		
		this.fuelLevel=fuelLevel;
		this.price=price;
		
		
	}
	
	public void setColor(String color)
	
	{
		this.color=color;
	}
	
	
	

}
