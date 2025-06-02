package example;

public class ConstructorExp {
     public ConstructorExp(int a,int b)
     {
    	 int c=a+b;
    	 System.out.println(c);
     }
     public ConstructorExp(int a,float b)
     {
    	 float z=a-b;
    	 System.out.println(z);
     }
     public ConstructorExp()
     {
    	 System.out.println("default constructor");
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorExp obj=new ConstructorExp(5,5);
		ConstructorExp obj1=new ConstructorExp(2,1.0f);
		ConstructorExp obj2=new ConstructorExp();
	}

}
