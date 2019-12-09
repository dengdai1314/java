package collections;

import java.util.*;

public class PrintingCollections {
	static Collection fill(Collection<String> collection) {
		collection.add("rat");
		collection.add("cat");
		collection.add("dog");
		collection.add("dog");
		return collection;
	}
	
	static Map fill(Map<String,String> map){
		map.put("rat","abc");
		map.put("cat","def");
		map.put("dog","test1");
		map.put("dog", "test2");
		return map;
	}
	
	public static void main(String[] args) {
		System.out.println(fill(new ArrayList<>()));
	    System.out.println(fill(new LinkedList<>()));
	    System.out.println(fill(new HashSet<>()));
	    System.out.println(fill(new TreeSet<>()));
	    System.out.println(fill(new LinkedHashSet<>()));
	    System.out.println(fill(new HashMap<>()));
	    System.out.println(fill(new TreeMap<>()));
	    System.out.println(fill(new LinkedHashMap<>()));
	}
}
