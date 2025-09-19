package superkeyword;

public class SuperChild extends SuperParent {
	String s="yellow";
	public void display()
	{
		System.out.println(super.s);
		
	}
	
	
	

	public static void main(String[] args) 
		// TODO Auto-generated method stub
	{
		SuperChild obj = new SuperChild();
		System.out.println(obj.s);
		obj.display();
     
	}

}
