
public class GenericClassExample <T> {
	
	T s;
	
	public GenericClassExample(T s)
	
	{
		this.s=s;
		
	}
	
	
	public void show()
	{
		System.out.println(s);
	}

}
   class gen <T>{
	  
	  
	  T name;
	  
	  public gen( T name)
	  
	  {
		  this.name=name;
	  }
	  public void show()
	  
	  {
		  System.out.println(name);
	  }
  }