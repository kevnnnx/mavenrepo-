package inheritance;

public class HierarchialC2 extends HierarchialP {
	public void speed() {
		System.out.println("Car speed is 100kmh");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HierarchialC2 obj = new HierarchialC2 ();
		obj.Car();
		obj.speed();
		
	}

}
