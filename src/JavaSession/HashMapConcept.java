package JavaSession;

import java.util.HashMap;
import java.util.Map;

public class HashMapConcept {

	public static void main(String[] args) {
		
		// hashmap <k,v>:
		
		HashMap<Integer, String> map= new HashMap<Integer, String>();
		
		map.put(1, "java");
		map.put(2, "ruby");
		map.put(3, "python");
		System.out.println(map.get(1));
		System.out.println(map.get(4));
		
		// for iterating the entries of hashmap:
		
		for(Map.Entry<Integer, String>entry:map.entrySet()) {
			System.out.println("key="+entry.getKey() +" " +"and"+" "+ "value="+entry.getValue());
		
		}
			System.out.println("------------");
		map.forEach((k,v) -> System.out.println("key="+ k + "value="+ v));	
			
		

	}

}
