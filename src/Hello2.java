
public class Hello2 {
	
	    public static void main(String[] args) {
	        String str = "222222222222222222122222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222221111112222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222";
	        int index = 1;
	        char c = str.charAt(index);
	        System.out.println("The character at index " + index + " is: " + c);
	        
	        
	        String name="Santosh";
	     
	        
	    //  char c1=  name.charAt(5);
	      
	      ///System.out.println(c1);
	  for(int j=0;//2
			  
			  
			  j<=name.length()-1;//3
			  
			  
			  j++) 
	  {
		  
		  
		  System.out.println(name.charAt(j));
	  }
	  System.out.println("My method will be called here");
	  
	  
	add(1,8);
	Hello2 obj = new Hello2();
	
	obj.sub(8,1);
	
	Hello2 obj1 = new Hello2();
	
	obj1.mul(8,2);
	
	Hello2 obj2 = new Hello2();
	obj2.div(16, 2);

	  
	        
	       
	    }
	    
	    
	    
	  //  int a=5;int b=8;
		  
		  
		  public static void add(int a,int b)
		  {
			  
			  System.out.println(a+b);
		  }
		  
		  public void sub(int a,int b) 
		  {
			  
			  System.out.println(a-b);
		  }
		  public void mul(int a, int b) 
		  
		  {
			  System.out.println(a*b);
			  
		  }
		  
		  public void div(int a, int b) 
		  {
			  System.out.println(a/b);
		  }
		  
	}
	


