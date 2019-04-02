package Chapter7;

public class BindingTest3 {
	public static void main(String args[]) {
		Parent3 p = new Child3();
		Child3 c = new Child3();
		
		System.out.println("p.x= " + p.x);
		p.method();
		
		System.out.println("c.x= " + c.x);
		c.method();
		
		//ChildŬ�������� �ƹ��� ����� ���ǵǾ� ���� �ʰ� �ܼ��� �������κ��� ������� ��ӹ޴´�.
		//�׷��� ������ ���������� Ÿ�Կ� ������� ������ ������� ����ϰ� �ȴ�.
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
		System.out.println("x=" + x); //this.x�� ����.
		System.out.println("super.x=" + super.x); //����Ŭ������ Parent�� ����� �ν��Ͻ� ���� x
		System.out.println("this.x=" + this.x); //ChildŬ������ �ν��Ͻ� ���� x
	}
}

