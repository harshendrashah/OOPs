package Lab3;

public class TriangleTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle t1 = new Triangle();
		Triangle t2 = null;
		Triangle t3 = new Triangle();
		t2 = new Triangle(3, 4, 5);
		t3.resize(40, 30, 50);
		//test area and perimeter
		System.out.println("Area of t1: " + t1.area());
		System.out.println("Perimeter of t1: " + t1.perimeter());
		System.out.println("Area of t2: " + t2.area());
		System.out.println("Perimeter of t2: " + t2.perimeter());
		System.out.println("Area of t3: " + t3.area());
		System.out.println("Perimeter of t3: " + t3.perimeter());
		
	}

}
