package Chapter10;

class Outer10_2 {
	static class Inner {
		int iv = 200;
	}
}

public class Exercise10_2 {
	public static void main(String args[]) {
		Outer10_2.Inner inner = new Outer10_2.Inner();
		System.out.println(inner.iv);
	}
}
