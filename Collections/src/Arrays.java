import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;


public class Arrays {

	public static void main(String[] args) {
		
		// Array
		
		int[] ages = new int[100];
		
		for(int i=0; i<100; i++){
			ages[i] = i;
		}
		
		
		for(int i=0; i<100; i++){
			System.out.println(ages[i]);
		}
		
		// List
		
		List l = new LinkedList();
		l.add("monday");
		l.add(10);
		l.add("wednesday");
		l.add("thursday");
		
		for(int i=0; i<l.size(); i++){
			System.out.println(l.get(i));
		}
		
		// List flexible
		
		List<String> ll = new ArrayList<>();
		ll.add("monday");
		ll.add("tuesday");
		ll.add("wednesday");
		ll.add("thursday");
		for(String element : ll){
			System.out.println(element);
		}
		
		// Map
		
		Map<String,Integer> ages2 = new HashMap<>();
		
		ages2.put("vasya", 22);
		ages2.put("Masha", 25);
		
		for(String name : ages2.keySet()){
			System.out.println(ages2.get(name));
		}
		
	}

}
