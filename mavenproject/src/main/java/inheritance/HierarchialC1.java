package inheritance;

public class HierarchialC1 extends HierarchialP  {
	public void name() {
		System.out.println("Car name is Swift");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HierarchialC1 obj = new HierarchialC1();
		obj.name();
		obj.Car();
	}

}
