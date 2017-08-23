import java.util.*;
	public class Listiterator {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			ArrayList<Object>al=new ArrayList<Object>();
			al.add("arun");
			al.add("How");
			al.add("Are");
			al.add("you");
			System.out.println("List of items"+al);
			
			
			System.out.println("Forward Direction");
			ListIterator<Object> litr= al.listIterator();
			while(litr.hasNext()) {
				System.out.println(litr.next());
			}
			
			
			System.out.println("Reverse Direction");
			while(litr.hasPrevious()) {
				System.out.println(litr.previous());
			}
				
}
}