import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class TestHashMap {

	public static void main(String[] args) {
		
		HashMap<String,String> UserPass = hashmap();
		
		Scanner scanner = new Scanner(System.in);
		
		String Uname = scanner.next();
		
		System.out.println(UserPass.containsKey(Uname));
		
		Set set = UserPass.entrySet();
		
		Iterator itr = set.iterator();
		
		System.out.println(set);
		
		while(itr.hasNext()) {
			Map.Entry entry = (Map.Entry)itr.next();
			System.out.println("key    "+entry.getKey());
			System.out.println("value  "+entry.getValue());
		}
		
	}
	
	public static HashMap<String,String> hashmap() {
		
		HashMap<String,String> hashmap = new HashMap<>();
		
		hashmap.put("arun", "arun123");
		hashmap.put("vikranth", "vikranth123");
		hashmap.put("sai", "sai123");
		hashmap.put("arun", "arun123");
		hashmap.put("rohan", "rohan123");
		
		return(hashmap);
		
	}

}
