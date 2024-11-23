package varargandcollectionchallenges;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FrequencyOfNumbers {
	
	public static void main(String[] args) {
		List<Integer> num= Arrays.asList(12,12,13,4,5,67,18,2,2,2,2);
		freq(num,22);
		
	}
	
	public static void freq(List<Integer> list, int n)
	
	{
		System.out.println(Collections.frequency(list, n));
		//System.out.println(list);
	}

	
}
