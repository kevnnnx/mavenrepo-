package accessspecifier;

public class AccessSpecifier1 {

	public static void main(String[] args) {
		AccessSpecifier1 obj1 = new AccessSpecifier1();
		obj1.display1();
		obj1.display2();
		obj1.display2();
		obj1.display3();
		

	}
	public void display1() {
		System.out.println("Display Public");
	}
	private void display2() {
	System.out.println("Display Private");	
	}
	protected void display3() {
		System.out.println("Display Protected");
	}
	void display() {
		System.out.println("Display Default");
	}
	

}
