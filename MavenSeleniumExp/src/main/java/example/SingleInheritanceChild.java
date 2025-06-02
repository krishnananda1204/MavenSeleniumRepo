package example;

public class SingleInheritanceChild extends  SingleInheritanceParent {
    public void read()
    {
    	System.out.println("hello");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleInheritanceChild obj=new SingleInheritanceChild();
		obj.display();
		obj.read();
	}

}
