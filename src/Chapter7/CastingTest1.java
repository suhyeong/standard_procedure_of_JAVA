package Chapter7;

public class CastingTest1 {
	public static void main(String args[]) {
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = fe; //car = (Car)fe; ���� ����ȯ�� ������ �����̴�. ����Ÿ�� <- �ڼ�Ÿ�� :: ����ȯ ���� ����
		//car.water(); < error ! CarŸ���� ���������δ� water()�� ȣ���� �� ����.
		fe2 = (FireEngine)car; //�ڼ�Ÿ�� <- ����Ÿ�� :: ����ȯ ���� �Ұ���
		fe2.water();
	}
}

class Car {
	String color;
	int door;
	
	void drvie() { //�����ϴ� ���
		System.out.println("drive, Brrr~");
	}
	
	void stop() { //���ߴ� ���
		System.out.println("stop!!!");
	}
}

class FireEngine extends Car { //�ҹ���, Car�� �ڼ� Ŭ����
	void water() { //���� �Ѹ��� ���
		System.out.println("water!!!");
	}
}