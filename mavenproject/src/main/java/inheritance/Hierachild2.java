package inheritance;

public class Hierachild2 extends  HieraParent {
	public void display()
	{
		System.out.println("vismaya");
	}

	public static void main(String[] args) {
		Hierachild2 obj = new Hierachild2();
		obj.display();
		obj.diff(7, 7);
		// TODO Auto-generated method stub

	}

}
