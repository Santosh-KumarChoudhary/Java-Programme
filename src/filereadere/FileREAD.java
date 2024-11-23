package filereadere;

import java.io.FileReader;
import java.io.IOException;

public class FileREAD {
	
	public static void main(String[] args) {
		
		
		try(FileReader reader= new FileReader("santosh.txt"))
		
		{
			int read=0;
			do
			
			{
				read=reader.read();
				
				System.out.print((char)read);
			}
			while(read!=-1);
			
		}
		
		catch(IOException e)
		{
			System.out.println("Exception occured "+e.getMessage());
		}
	}

}
