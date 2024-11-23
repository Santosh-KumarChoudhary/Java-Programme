package randomproglearning;

public class OnlineTest extends Thread {
	
	
	public static void main(String [] args) 
    {
		OnlineTest t = new OnlineTest(); /* Line 5 */
        t.run();  /* Line 6 */
    }

    public void run() 
    {
        for(int i=1; i < 3; ++i) 
        {
            System.out.print(i + "..");
        }
    }
}
