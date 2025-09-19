package superkeyword;

public class MethodChild extends MethodParent {
	
	public void sum(int a, int b)
	{
		this.show();
		super.display();
		int c=a+b;
	    System.out.println(c);
	    System.out.println(super.diff(8, 8));
	}
	public void show()
	{

		System.out.println("hi");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub7
		MethodChild obj= new MethodChild();
		//obj.display();
		obj.sum(5, 7);
		
		

	}

}
