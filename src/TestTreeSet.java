import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;


public class TestTreeSet {

	public static void main(String[] args) {
		
		TreeMap<String,Integer> inputs = input();
		
		Set set = inputs.entrySet();
		
		Iterator itr = set.iterator();
		
		while(itr.hasNext()) {
			System.out.println("TreeMap Sort by key      "+itr.next());
		}
		System.out.println();
		List<Entry<String,Integer>> list = new LinkedList<Entry<String,Integer>>(set);
		
		Collections.sort(list, new Comparator<Entry<String,Integer>>() {

			@Override
			public int compare(Entry<String, Integer> arg0, Entry<String, Integer> arg1) {
				
				return arg0.getValue().compareTo(arg1.getValue());
			}
			
		});
		
		for (Entry<String, Integer> sorting : list) {
			System.out.println("TreeMap Sort by value    "+sorting);
		}
	}
	
	public static TreeMap<String,Integer> input() {
		
		TreeMap<String,Integer> inputs = new TreeMap<String, Integer>();
		
		inputs.put("arun", 0);
		inputs.put("manas", 4);
		inputs.put("ajay", 2);
		inputs.put("lakhan", 1);
		inputs.put("venu", 6);
		inputs.put("rohan", 5);
		inputs.put("sai", 3);
		
		return inputs;
	}
}
