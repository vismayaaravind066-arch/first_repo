package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList <String>q=new ArrayList();
		q.add("white");
		q.add("yellow");
		q.add("black");
		System.out.println(q);
		
		ArrayList<String>n=new ArrayList<String>();
		n.add("orange");
		n.add("apple");
		n.add("mango");
		System.out.println(n);
		
		//add all -to add one collection to another
		
		System.out.println(q.addAll(n));
		System.out.println(q);
		System.out.println(n);
		
		//contains all-to check whether one collection is present in another
		
		System.out.println(q.containsAll(n));
		System.out.println(n.containsAll(q));
		Iterator<String> l=n.iterator();
		while(l.hasNext())
		{
			System.out.println(l.next());
		}
		l.remove();
		System.out.println(n);
		

		
		

	 

		
	
		
				// TODO Auto-generated method stub

	}

}
