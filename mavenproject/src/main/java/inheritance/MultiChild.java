package inheritance;

public class MultiChild extends MultiInter {
	
	public void division(int q, int p)
	{
		int w=q/p;
		System.out.println(w);
	}

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		MultiChild obj=new MultiChild();
		obj.sum(7, 7);
		obj.diff(9, 8);
		obj.division(5, 5);

	}

}
