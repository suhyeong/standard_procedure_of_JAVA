package Chapter7;

public class CastingTest2 {
	public static void main(String args[]) {
		//Car car = new Car();
		Car car = new FireEngine(); //이와 같이 변경하면 에러가 발생하지 않는다.
		Car car2 = null;
		FireEngine fe = null;
		
		car.drvie();
		//fe = (FireEngine)car; //< error ! 참조변수 car가 참조하고 있는 인스턴스가 Car타입의 인스턴스인 것이 문제.
		//조상타입의 인스턴스를 자손타입의 참조변수로 참조하는 것은 허용되지 않는다.
		//fe.drvie();
		car2 = fe; //조상타입 <- 자손타입 :: 형변환 생략 가능
		//car2.drvie(); <여기서는 왜 에러가 나는거지 ,, ,,?
	}
}
