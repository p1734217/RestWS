package serialization;

abstract class TestAbstraction1 {
	
	abstract void draw();
}

// In real scenario, implementation is provided by others i.e. unknown by end
// user
class Rectangle extends TestAbstraction1 {

	public void draw() {
		System.out.println("drawing rectangle");
	}
}

class Circle1 extends TestAbstraction1 {
	public void draw() {
		System.out.println("drawing circle");
	}
}

// In real scenario, method is called by programmer or user
class Shap {
	public static void main(String args[]) {
		TestAbstraction1 s = new Circle1();// In real scenario, object is provided through
								// method e.g. getShape() method
		s.draw();
	}
}
