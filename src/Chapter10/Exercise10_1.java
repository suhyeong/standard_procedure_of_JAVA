package Chapter10;

class Outer10_1 {
	class Inner {
		int iv = 100;
	}
}

public class Exercise10_1 {
	public static void main(String args[]) {
		Outer10_1 outer = new Outer10_1();
		Outer10_1.Inner inner = outer.new Inner();
		System.out.println(inner.iv);
	}
}
