package Chapter7;

public class BindingTest {
	public static void main(String args[]) {
		Parent1 p = new Child1();
		Child1 c = new Child1();
		
		System.out.println("p.x= " + p.x);
		p.method();
		
		System.out.println("c.x= " + c.x);
		c.method();
		
		//메서드인 method()의 경우 참조변수의 타입에 관계없이 항상 실제 인스턴스의 타입인
		//Child클래스에 정의된 메서드가 호출되지만, 인스턴스 변수인 x는 참조변수의 타입에 따라서 달라진다.
	}
}

class Parent1 {
	int x = 100;
	
	void method() {
		System.out.println("Parent Method");
	}
}

class Child1 extends Parent1 {
	int x = 200;
	
	void method() {
		System.out.println("Child Method");
	}
}