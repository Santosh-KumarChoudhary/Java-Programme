
public class StaticVarExam {
	
	private  String name;
	
	
	
	public static void main(String[] args) {

		StaticVarExam ver=new StaticVarExam("FirstVar");
		
		StaticVarExam ver2= new StaticVarExam("SecondVer");
		
		StaticVarExam ver3= new StaticVarExam("ThirdVer");

		
		ver.printName();
		ver2.printName();
		ver3.printName();
		
	}

	StaticVarExam(String name)
	
	{
		this.name=name;
	}
	
	public void printName()
	
	{
		System.out.println("name = "+name);
	}
	
	
	
}
