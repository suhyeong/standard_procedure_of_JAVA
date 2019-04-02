package Chapter7;

public class BindingTest3 {
	public static void main(String args[]) {
		Parent3 p = new Child3();
		Child3 c = new Child3();
		
		System.out.println("p.x= " + p.x);
		p.method();
		
		System.out.println("c.x= " + c.x);
		c.method();
		
		//Child클래스에는 아무런 멤버도 정의되어 있지 않고 단순히 조상으로부터 멤버들을 상속받는다.
		//그렇기 때문에 참조변수의 타입에 관계없이 조상의 멤버들을 사용하게 된다.
	}
}

class Parent3 {
	int x = 100;
	
	void method() {
		System.out.println("Parent Method");
	}
}

class Child3 extends Parent3 {
	int x = 200;
	
	void method() {
		System.out.println("x=" + x); //this.x와 같다.
		System.out.println("super.x=" + super.x); //조상클래스인 Parent에 선언된 인스턴스 변수 x
		System.out.println("this.x=" + this.x); //Child클래스의 인스턴스 변수 x
	}
}

