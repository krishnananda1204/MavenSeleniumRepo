package example;

public class AggreeChild{
     int age;
     String course;
     AggreeParent ref;
	public AggreeChild(int age, String course,AggreeParent ref) {
		this.age=age;
		this.course=course;
		this.ref=ref;
		
		// TODO Auto-generated constructor stub
	}
		public void display()
		{
			System.out.println(age);
			System.out.println(course);
			System.out.println(ref.num);
			System.out.println(ref.name);
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AggreeParent obj=new AggreeParent(15,"cs");
		AggreeChild obj1=new AggreeChild(1,"krishna",obj);
		obj1.display();
	}

}
