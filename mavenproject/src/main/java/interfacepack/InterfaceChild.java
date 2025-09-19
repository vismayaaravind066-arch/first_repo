package interfacepack;

public class InterfaceChild implements InterParent {

	public static void main(String[] args) {
		InterfaceChild obj=new InterfaceChild();
		obj.sum();
		obj.show();
		InterParent.display();
		// TODO Auto-generated method stub
		

	}

	@Override
	public void sum() {
		// TODO Auto-generated method stub
		
		int c=a+b;
		System.out.println(c);
		
	}

}
