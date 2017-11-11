package Lab3;

public class RectangleTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle(100,200);
		System.out.println("r1: " + r1.toString());
		System.out.println("r2: " + r2);
		r2.resize(300,500);
		System.out.println("r2: " + r2);
		//rename name of toString method to getString() and then run following code
		//System.out.println("r1: " + r1.getString());
		//System.out.println("r2: " + r2);
	}

}
