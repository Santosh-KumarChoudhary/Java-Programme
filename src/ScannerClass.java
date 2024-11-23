import java.util.Scanner;

public class ScannerClass {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		
		System.out.print("Please enter your name :");
	String name=	sc.nextLine();
	
	System.out.println("Godd morning "+name);
	
	System.out.print(name + " Also provide your age :");
int age=	sc.nextInt();
System.out.println("Age is : "+age);


System.out.println("***********************");

System.out.print(name +" , Need your address as well : ");
String address=  sc.nextLine();
System.out.println("Address is "+address);
	


System.out.print("Enter your name :");
String name2=sc.nextLine();

System.out.println("Welcome to my learning "+name2 +"Of the java");


System.out.println("Welcome to my calculator");

System.out.print("Please enter first number : ");

int fnum=sc.nextInt();

System.out.print("Now enter second number : ");

int snum=sc.nextInt();
System.out.print(" Sum is : "+(fnum+snum));
	
	
		
		
		
		
	}

}
