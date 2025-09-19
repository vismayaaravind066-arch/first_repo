package accessspecifier;

public class Access1 extends AccessModifier {

	public static void main(String[] args) {
		Access1 obj=new Access1();
		obj.prmethod();
		obj.pubmethod();
		//private method cannot be accessed from outside the class obj.primethod();
		obj.demethod();
		// TODO Auto-generated method stub

	}

}
