package stringexample;

public class Stringprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String s="vismaya";
         System.out.println(s);
         String f=new String("hi");
         System.out.println(f);
         
         //length method
         System.out.println(s.length());
         
         //concat method
         System.out.println(s.concat("war"));
         
         //to uppercase()
         System.out.println(s.toUpperCase());
         
         //to lowercase()
         System.out.println(s.toLowerCase());
         
         String h="";
         //isEmpty()
         System.out.println(h.isEmpty());
         
         //contains
         String r="you are beautiful";
         System.out.println(r.contains("it"));
         System.out.println(s.contains("war"));
         
         //equals()
         String w="java";
         String t="java";
         String i="Java";
         String k="selenium";
         System.out.println(w.equals(t));
         System.out.println(i.equals(t));
         System.out.println(w.equals(k));
         
         //equal ignorecase()
         System.out.println(w.equalsIgnoreCase(i));
         
         String v=new String("java");
         System.out.println(w.equals(v));//object is being checked
         System.out.println(w==v);//==variable is being checked not content,reference is checked
	}

}

