package Utils;

public  abstract class Vehicles2 implements Transport {
	
	int numberofTires;
	
	 Vehicles2(int numberofTires )
	
	{
		this.numberofTires=numberofTires;
	}
	
	public int  getNumberOfTires()
	
	{
		return numberofTires;
	}
	
	public void setNumberOfTires(int numberofTires)
	
	{
		this.numberofTires=numberofTires;
	}
	
	public void coomute()
	
	{
		System.out.println("Going...........");
	}

	
	public abstract int TopSpeed(int topSpeed);
	
	
	public void commuting()
	
	{
		System.out.println("commuting by Trains");
	}
	
}
