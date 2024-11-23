package startpattern;

public class Print5into5EvenNumbers {
	
	public static void main(String[] args) {
		
		
		  int number = 2; // Start with the first even number
	        int rowCount = 5;
	        int colCount = 5;
	        
	        for (int i = 0; i < rowCount; i++) {
	            for (int j = 0; j < colCount; j++) {
	                System.out.print(" "+number ); // Print the number followed by a tab for formatting
	                number =number+ 2; // 6Move to the next even number
	            }
	            System.out.println(); // Move to the next line after each row
	        }
	}

}
