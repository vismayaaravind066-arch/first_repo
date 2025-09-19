package collection;

import java.util.HashSet;
import java.util.Set;

public class SetOperations {
	

	public static void main(String[] args) {
		Set <String> s=new HashSet<String>();
		s.add("red");
		s.add("white");
		s.add("orange");
		s.add("black");
		System.out.println(s);
		
		Set<String> p=new HashSet<String>();
		p.add("berry");
		p.add("mango");
		p.add("lemon");
		System.out.println(p);
		
		System.out.println(s.addAll(p));
		System.out.println("white");
		
		System.out.println(s.containsAll(p));
		System.out.println("black");
		
		System.out.println(s.isEmpty());
		s.remove("orange");
		System.out.println(s);
		
		s.clear();
		System.out.println(s);
		System.out.println(s.isEmpty());
		
		// TODO Auto-generated method stub

	}

}
