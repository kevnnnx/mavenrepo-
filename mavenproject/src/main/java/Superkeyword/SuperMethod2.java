package Superkeyword;

public class SuperMethod2 extends SuperMethod {
	public void childdisplay() {
		System.out.println("Child Class");
		super.display();
	}
	public static void main(String[] args) {
		SuperMethod2 obj = new SuperMethod2();
		obj.childdisplay();

	}

}
