package CallingGetterSetter;

import GetterSetter.Car;

public class CallingCar {
	
	public static void main(String[] args) {
		
	
	
	Car car= new Car("BMW","Green",12234,9876);
	car.setColor("Yellow");
	
	
System.out.printf("%s %s %s",car.getcolor(), car.getmodel(), car.getfuelLevel());
//System.out.println(car.setColor("Tell Yellow"));




//System.out.print(car.setColor("Yellow"));
}
}