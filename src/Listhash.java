import java.util.*;
	public class Listhash {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			LinkedHashSet<Object>al=new LinkedHashSet<Object>();
			al.add("arun");
			al.add("you");
			al.add("are");
			al.add("how");
			al.add("how");
			System.out.println("List of items"+al);
				
			Iterator itr=al.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
}
}