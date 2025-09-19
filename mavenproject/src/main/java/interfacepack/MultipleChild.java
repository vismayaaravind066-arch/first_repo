package interfacepack;

public class MultipleChild implements MultipleParent1,MultipleParent2 {

	public static void main(String[] args) {
		MultipleChild obj2=new MultipleChild();
		obj2.display();
		obj2.sum();
		// TODO Auto-generated method stub

	}

	@Override
	public void display() {
		System.out.println("hi");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sum() {
		int a=7;
		int b=9;
		int c=a+b;
		System.out.println(c);
		// TODO Auto-generated method stub
		
	}

}
