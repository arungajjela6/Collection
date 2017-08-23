import java.util.*;
public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Object>al=new ArrayList<Object>();
		al.add("arun");
		al.add("How");
		al.add("Are");
		al.add("you");
		System.out.println("List of items"+al);
		
		
		ArrayList<Object>a2=new ArrayList<Object>();
		a2.add("Rohan");
		a2.add("How");
		a2.add("Are");
		a2.add("You ?");
		System.out.println("List of items in Array2"+a2);
		System.out.println("........................................");
		
		
		al.addAll(a2);
		System.out.println("After adding Array2"+al);
		System.out.println("........................................");
		
		
		// It will come try once again
		for(Object o:al) {
			System.out.println(o);
				
			
		Iterator Itr=al.iterator();
		while(Itr.hasNext()) {
		System.out.println(Itr.next());
		}
		System.out.println("........................................");
			
		
		al.removeAll(a2);
		System.out.println("After removing Array2"+al);
		System.out.println("........................................");
			
		al.retainAll(a2);
		System.out.println("After retaining Array2"+al);
		System.out.println("........................................");
			
		}
	}

}
