import java.util.ArrayList;
import java.util.List;

public class GenericClassExampleCall {
	
	public static void main(String[] args) {
		
	
	
		GenericClassExample <String> gen= new GenericClassExample<>("san");
		gen.show();

GenericClassExample <Integer> gen2= new GenericClassExample<>(12);

gen2.show();
genMethod("Hey yo !!!!" ,"SAN");

genMethod(1234 ,"ASBFS");
genMethod('a',"Ration");

List<Integer> intList=new ArrayList<>();

intList.add(3);

printList(intList);

List<CatClass> cat= new ArrayList<>();
cat.add(new CatClass());

printList(cat);



}
	
public static  <T,V>  void genMethod( T name , V name2)

{
	System.out.println(name+" "+  "!!!"+name2);
}


public static void printList(List<?> mylist)

{
	System.out.println();
}

}