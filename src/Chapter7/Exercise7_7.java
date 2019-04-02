package Chapter7;

class Parent_ {
	int x=100;
	
	Parent_() {
		this(200); //Parent_(int x) ȣ��
	}
	
	Parent_(int x) {
		//super(); -> Obejct() ȣ��
		this.x = x;
	}
	
	int getX() {
		return x;
	}
}

class Child_ extends Parent_ {
	int x = 3000;
	
	Child_() {
		this(1000); //Child_(int x) ȣ��
	}
	
	Child_(int x) {
		//super(); -> Parent_() ȣ��
		this.x = x;
	}
}

public class Exercise7_7 {
	public static void main(String args[]) {
		Child_ c = new Child_();
		
		System.out.println("x="+c.getX());
		
		//Child_() -> Child_(int x) -> Parent_() -> Parent_(int x) -> Object()
	}
}
