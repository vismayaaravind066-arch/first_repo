package inheritance;

public class SingleChild extends Parent {
	public void difference(int a,int c)
	{
		int b=a-c;
		System.out.println(b);
	}
	
	  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        SingleChild obj = new SingleChild();
        obj.difference(9, 6);
        obj.sum(7, 9);
        obj.multi(7, 7);
        
        Parent obj1= new Parent();
        obj1.sum(8, 1);
        obj1.multi(7, 8);
        
	}
	
	

}
