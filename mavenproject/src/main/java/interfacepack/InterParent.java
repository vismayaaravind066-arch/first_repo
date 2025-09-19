package interfacepack;

public interface InterParent {
    public static final int a=6;
    int b=9;
    public abstract void sum();
    default void show()
    {
    	System.out.println("hi");
    }
    public static void display()
    {
    	System.out.println("this is static method");
    }
}