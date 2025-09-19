package interfacepack;

public class InterfaceChild2 implements Interfaceparent1{

	public static void main(String[] args) {
		Interfaceparent1 obj1=new InterfaceChild2();
		obj1.sum();
		// TODO Auto-generated method stub

	}

	@Override
	public void sum() {
		int a=8;
		int b=9;
		int c=a+b;
		System.out.println(c);
		// TODO Auto-generated method stub
		
	}

}
