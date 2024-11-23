
public class MethodoverloadinEx {
	
	public static void m1()
	{
		System.out.println("First method ");
	}
	
	public void m1(int a)
	
	{
		System.out.println("Second m1 int");
	}
	
	public static char m1(char a)
	
	{
		return a;
	}
	
	public int m1(int a,int b)
	
	
	{
		return(a+b);
	}
	public void m1(int a1,int b1,char s)
	{
		
	}
	
	public static void main(String[] args) {
		
		m1();
		MethodoverloadinEx obj=new MethodoverloadinEx();
		
		obj.m1(10);
	System.out.println(m1('z'));
	
		int sum=	obj.m1(10, 10);
		System.out.println("Toatl sum "+sum);
		
	}

}
