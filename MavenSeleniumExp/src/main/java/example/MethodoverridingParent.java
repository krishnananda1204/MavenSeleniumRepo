package example;

public class MethodoverridingParent {
  public void display(int a,int b)
  {
	  int c=a+b;
	  System.out.println(c);
  }
  public void display(int a,float b)
  {
	  float c=a+b;
	  System.out.println(c);
  }
}
