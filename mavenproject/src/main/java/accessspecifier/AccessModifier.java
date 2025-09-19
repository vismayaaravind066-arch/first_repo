package accessspecifier;

public class AccessModifier {
	public void pubmethod()
	{
		System.out.println("hi");
		
	
	}
	private void primethod()
	{
		System.out.println("he");
		
	}
	void demethod()
	{
		System.out.println("she");
	}
     protected void prmethod()
     {
    	 System.out.println("war");
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessModifier obj=new AccessModifier();
		obj.pubmethod();
		obj.primethod();
		obj.demethod();
		obj.prmethod();
	

		

	}

}
