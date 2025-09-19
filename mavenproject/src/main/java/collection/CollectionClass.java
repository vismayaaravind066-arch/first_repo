package collection;

import java.util.ArrayList;
import java.util.List;

public class CollectionClass {

	public static void main(String[] args) {
		List <String>l=new ArrayList<String>();
		// TODO Auto-generated method stub
		System.out.println(l);
		//add method
		l.add("red");
		l.add("white");
		l.add("yellow");
		l.add("red");
		System.out.println(l);
		// set method-to set new element in the collection
		l.set(1, "yellow");
		System.out.println(l);
		
		//size
		System.out.println(l.size());
		
		for (int i=0;i<4;i++)
		{
			System.out.println(l.get(i));
			
		}
		
		for(String a:l )
		{
			System.out.println(a);
		
		}
		
	}
}
		

	


