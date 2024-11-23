
public class UseOfModAndDiv {
	
	public static void main(String[] args) {
		
		int num=123;
		int sum =0;
		while(num >0)
			
		{
		
			int lastDigit= num%10;//2//3
			System.out.println("LastDigit "+lastDigit);
			sum =sum+lastDigit;
			
			 num =num/10;//432//43//4
			System.out.println("Dividend is  "+num);
			System.out.println("Summation of the digit  is "+sum);

			
			
		}
		
		System.out.println(9%10);
		
		int num2=10;
		
		num2+=2;
		
		System.out.println("Fianl num2 "+num2);
		
		

		
	}

}
