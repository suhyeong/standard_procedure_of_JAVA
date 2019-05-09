package Chapter10;

class Outer10_3 {
	int value = 10;
	
	class Inner {
		int value = 20;
		void method1() {
			int value = 30;
			
			System.out.println(value);
			System.out.println(this.value);
			System.out.println(Outer10_3.this.value);
		}
	}
}
public class Exercise10_3 {
	public static void main(String args[]) {
		Outer10_3 outer = new Outer10_3();
		Outer10_3.Inner inner = outer.new Inner();
		inner.method1();
	}
}
