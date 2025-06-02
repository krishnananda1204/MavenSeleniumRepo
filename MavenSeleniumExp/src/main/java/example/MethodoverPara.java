package example;

public class MethodoverPara {
      public static void addition(int a,int b)
   {
	   int z=a-b;
	   System.out.println(z);
   }
   public static void addition(int a,float b)
   {
	   float z=a*b;
	   System.out.println(z);
   }
   
   public static void  addition(int a,int b,int k)
   {
	   int s=a+b+k;
	   System.out.println(s);
   }
   public static void addition(String v)
   {
	   System.out.println(v);
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//addition();
		addition(0,2,1);
		addition(5,2);
		addition("krishna");
		addition(5,2.0f);
	}

}
