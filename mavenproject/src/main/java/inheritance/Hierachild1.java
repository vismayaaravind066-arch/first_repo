package inheritance;

public class Hierachild1 extends  HieraParent{
	public void sum(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
		
	}

	public static void main(String[] args) {
		Hierachild1 obj= new Hierachild1();
		obj.sum(5, 5);
		obj.diff(8, 8);
		System.out.println(obj.u);
		
		// TODO Auto-generated method stub

	}

}
