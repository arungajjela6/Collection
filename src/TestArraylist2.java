import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TestArraylist2 {

	public static void main(String[] args) {
		
		ArrayList<String> list = test();
		
		Iterator itr = list.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println("Array  "+itr.next());
			
		}
		System.out.println("------------------------------------------");
//		-----------------------------------------------------------
		
		TestArrayLsit list2 = new TestArrayLsit();
		
		ArrayList<String>listfromarray1 = list2.arraylist();
		
		
		Iterator itr1 =listfromarray1.iterator();
		
		while(itr1.hasNext()) {
			
			System.out.println("List from array 1  " +itr1.next());
			
		}
		
		System.out.println("------------------------------------------");
//		------------------------------------------------------------------------
		
		ArrayList<String>listadd_1and2 ;
		
		list.addAll(listfromarray1);
		
		Iterator itr2 =list.iterator();
		System.out.println("After adding list one and two");
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		System.out.println("------------------------------------------");
//		--------------------------------------------------------------------------
		
		System.out.println("Does the list contain kumar  "+list.contains("kumar"));
		System.out.println("Does the list contain arun   "+list.contains("arun"));
		
		System.out.println("First element of the arraylist    "+list.get(0));
		System.out.println("fourth elemant of the arraylist   "+list.get(3));
		
		System.out.println("Index of the Arun       "+list.indexOf("Arun"));
		System.out.println("Index of the vikranth   "+list.indexOf("vikranth"));
		System.out.println("Index of the Vikranth   "+list.indexOf("Vikranth"));
		
		System.out.println("Last Index of the ArrayList  "+list.lastIndexOf("Arun"));
		System.out.println("Last Index of the ArrayList  "+list.lastIndexOf("venu"));
		
		System.out.println("Removing Arun    "+list.remove(0));
		System.out.println("Removing arun    "+list.remove(5));
		
	}

	public static ArrayList<String> test() {
		
		ArrayList<String> b = new ArrayList<String>();
		
		b.add("Arun");
		b.add("Arun");
		b.add("Arun");
		b.add("Arun");
		b.add("Arun");
		b.add("Arun");
		
		return b;
	}
	
}
