package inheritance;

import Utils.ChildClass;

public class CallingClass {
	public static void main(String[] args) {
		
	
	
	ParentClass cs= new ParentClass();
	 cs.driving();
	 System.out.println(cs.numberOfWheels);
	 
	 ChildClass cc= new ChildClass();
	 
	 cc.driving();
	 System.out.println(cc.numberOfWheels);
	 cc.riding();
	 cc.setNumberOfMirrors(3);
	
	

}
}