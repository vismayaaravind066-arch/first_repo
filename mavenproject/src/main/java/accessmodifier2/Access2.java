package accessmodifier2;

import accessspecifier.AccessModifier;

public class Access2 extends AccessModifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Access2 obj=new Access2();
		obj.prmethod();
		obj.pubmethod();

		AccessModifier obj1 =new AccessModifier();
		obj1.pubmethod();
		
	}

}
