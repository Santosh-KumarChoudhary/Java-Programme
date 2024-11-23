import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionSortening {
	
	public static void main(String[] args) {
		
		
		List<Integer> digit= new ArrayList<>();
		
		
		digit.add(10);
		
		digit.add(2);
		digit.add(120);
		digit.add(203);
		digit.add(20);
		digit.add(8);
		digit.add(8);

		
		Collections.sort(digit);
		
		System.out.println(digit);
		
		Collections.reverse(digit);
		
		System.out.println("After reveersed "+digit);
		
		System.out.println(Collections.max(digit));
		
		

		Set<Integer> set = new HashSet<>();
		
		
		
		set.add(12);
		
		set.add(2);
		
		set.add(13);
		
		set.add(4);
		
		//Collections.sort(set);
		
		
	}
	
	

}
