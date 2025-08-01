package aggregation;

public class Student {
	String name ;
	int rollno;
	Address obj; //line to join both the classes
	
	public Student(String name, int rollno, Address obj) {
		this.name = name;
		this.rollno = rollno;
		this.obj=obj;
	}
	
	public void display() {
		System.out.println(name);
		System.out.println(rollno);
		System.out.println(obj.pincode);
		System.out.println(obj.state);
	}

	public static void main(String[] args) {
		Address a = new Address("Kerala", 686503);
		Student s = new Student("Kevin", 21, a);
	    s.display();

	}

}
