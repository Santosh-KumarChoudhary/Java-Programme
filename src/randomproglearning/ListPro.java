package randomproglearning;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListPro {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		
		List<Integer> list= new ArrayList<>();
		
//		
//		
//		list.add(10);
//		
//		list.add(20);
//		list.add(30);
//		list.add(40);
//		
//		list.add(0,1234);
//		
//		list.remove(2);
//		list.add(2,890);
//System.out.println(list);

for(int i=0;i<5;i++)
	
{
	list.add(sc.nextInt());
	System.out.println(list.get(i));

}

System.out.println(list);
	}

}
