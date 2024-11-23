package Utils;

public class TestCallingVehicles {
	
	public static void main(String[] args) {
		
		//Vehicles2 vi= new Vehicles2(4);
	//	System.out.println("Vehicles class speed "+vi.numberofTires);
		
		Vehicles2Calling v= new Vehicles2Calling(5);
		System.out.println(v.speed);
		//v.traiName();
		
		System.out.println("Top speed of the car : "+v.TopSpeed(9));

		System.out.println(v.numberofTires);
		v.coomute();
	}

}
 