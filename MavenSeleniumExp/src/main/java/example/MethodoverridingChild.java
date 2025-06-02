package example;

public class MethodoverridingChild extends MethodoverridingParent{
   public void calc(int a,int b,int c)
   {
	   super.display(1, 2.0f);
	   int z=a+b+c;
	   System.out.println(z);
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodoverridingChild obj=new MethodoverridingChild();
		//obj.display(5, 2);
		obj.calc(1, 2, 3);
	}

}
