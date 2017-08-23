import java.util.ArrayList;
import java.util.Iterator;

public class TestArrayLsit {

	public static void main(String[] args) {
		
		ArrayList<String> a= arraylist();
		
		Iterator itr = a.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println("ArrayList  "+itr.next());
		}

	}

	public static ArrayList<String> arraylist() {
		
		ArrayList <String>a= new ArrayList<String>();
		a.add("arun");
		a.add("venu");
		a.add("vikranth");
		a.add("lakhan");
		a.add("rohan");
		
		return a;
	}
}
