package inheritance;

public class MutlilevelC extends MultilevelP1 {
	public void run() {
		System.out.println("Child running");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MutlilevelC obj = new MutlilevelC();
	    obj.run();
	    obj.Draw();
	    obj.Singing();
	}

}
