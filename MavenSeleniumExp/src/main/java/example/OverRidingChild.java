package example;

public class OverRidingChild extends OverRidingParent{
   public void display(int a,int b)
   {
	   int c=a-b;
	   System.out.println(c);
	   super.display(4, 4);
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		OverRidingChild obj=new OverRidingChild();
		obj.display(5, 2);
	}

}
