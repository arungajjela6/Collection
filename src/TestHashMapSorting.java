import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TestHashMapSorting {

	public static void main(String[] args) {
		
		HashMap<Integer,String> inputs = inputs();
		
		List<Entry<Integer, String>> list = new LinkedList<Entry<Integer,String>>(inputs.entrySet());
		
		Collections.sort(list,new Comparator<Entry<Integer, String>>(){
			
			public int compare(Entry<Integer,String> o1, Entry<Integer,String>o2) {
				
				return o1.getValue().compareTo(o2.getValue());
			}
		});
		
		for (Entry<Integer, String> entry : list) {
			
			System.out.println("Sort by value     "+entry);
		}
		
		Map<Integer,String> sort = new TreeMap<Integer,String>(inputs);
		
		Set set = sort.entrySet();
		
		Iterator itr = set.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println("Sort by key    "+itr.next());
			
		}
	}

	public static HashMap<Integer,String> inputs() {
		
		HashMap<Integer,String> input = new HashMap<Integer,String>();
		
		input.put(0, "arun");
		input.put(4, "manas");
		input.put(1, "venu");
		input.put(5, "viki");
		input.put(2, "sai");
		input.put(6, "rohan");
		input.put(3, "lakhan");
		
		return input;
		
	}
	
}
