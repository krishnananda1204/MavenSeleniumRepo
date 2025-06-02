package example;

public class Instancevarthis {
	   public void display()
	   {
		   this.read();
		   System.out.println("hai");
		   
	   }
	   public void read()
	   {
		  
		   System.out.println("helllo");
		   this.print();
	   }
	   public void print()
	   {
		   System.out.println("gd morning");
	   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instancevarthis obj=new Instancevarthis();
		obj.display();
	}

}
