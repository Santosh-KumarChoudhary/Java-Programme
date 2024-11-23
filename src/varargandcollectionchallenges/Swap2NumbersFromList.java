package varargandcollectionchallenges;

import java.util.Arrays;
import java.util.List;

public class Swap2NumbersFromList {
	
	public static void main(String[] args) {
		
		List<Integer> ls= Arrays.asList(2,10,15,16,19);
		
		System.out.println("Before Swap "+ls);
		swap(ls,0,1);
		
		System.out.println(ls);
		
	}
	
	public static void swap(List<Integer> list, int a, int b)
	
	{
		int swap= list.get(a);// takes index //2
		
		
		
		System.out.println(" first Swap number "+swap);
		
		
		list.set(a, list.get(b));
		System.out.println("A is "+a);
		
		list.set(b,swap);
		
		System.out.println("B is "+b);
	}

}
