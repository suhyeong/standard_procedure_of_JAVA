package Chapter10;


//내부 클래스와 외부 클래스에 선언된 변수의 이름이 같을 때
//변수 앞에 'this' 또는 '외부 클래스명.this'를 붙여서 서로 구별할 수 있다.
class Outer2 {
	int value = 10;
	
	class Inner {
		int value = 20;
		void method1() {
			int value = 30;
			System.out.println("           value : " + value);
			System.out.println("      this.value : " + this.value);
			System.out.println("Outer.this.value : " + Outer2.this.value);
		}
	} // end of Inner class
} // end of Outer class

public class InnerEx5 {
	public static void main(String args[]) {
		Outer2 outer = new Outer2();
		Outer2.Inner inner = outer.new Inner();
		inner.method1();
	}
}
