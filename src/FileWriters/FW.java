package FileWriters;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;


public class FW {

	public static void main(String[] args) {
		FileWriter writer;

		
		String fileName="santosh.txt";
		fileName.toUpperCase();
		
		try (FileWriter write = new FileWriter(fileName))
		{
		 writer= new FileWriter(fileName);
		writer.write("Hey Santosh");
		
		for(int i =0;i<100;i++)
			
		{
			writer.write("*");
		}
		writer.flush();
		System.out.println("File written successfully");
		
		
		
		}
		
		catch(IOException ex)
		{
			
			System.out.println("Exception occured");
			System.out.println(ex.getMessage());
		}
		finally {
		

}
}}