package Chapter7;

public class CastingTest1 {
	public static void main(String args[]) {
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = fe; //car = (Car)fe; 에서 형변환이 생략된 형태이다. 조상타입 <- 자손타입 :: 형변환 생략 가능
		//car.water(); < error ! Car타입의 참조변수로는 water()를 호출할 수 없다.
		fe2 = (FireEngine)car; //자손타입 <- 조상타입 :: 형변환 생략 불가능
		fe2.water();
	}
}

class Car {
	String color;
	int door;
	
	void drvie() { //운전하는 기능
		System.out.println("drive, Brrr~");
	}
	
	void stop() { //멈추는 기능
		System.out.println("stop!!!");
	}
}

class FireEngine extends Car { //소방차, Car의 자손 클래스
	void water() { //물을 뿌리는 기능
		System.out.println("water!!!");
	}
}