
public class FinalKeyword {
	public final int num=100;

public static void main(String[] args) {
	
	
	FinalKeyword fk = new FinalKeyword();
	
	System.out.println(fk.num);;
	fk.fmethod(12);
	//System.out.println(fk.a);
	
	
}

public final void  fmethod(int a1)

{
	int a=190;
	
	System.out.println(a);
}



}
