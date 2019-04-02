package Chapter7;

class SutdaCard_ {
	final int num;
	final boolean isKwang;
	
	SutdaCard_() {
		this(1, true);
	}
	
	SutdaCard_(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
		//final 변수 - 생성자에서 단 한번의 초기화만 가능 !
	}
	
	//info() 대신 Object클래스의 toString()을 오버라이딩했다.
	public String toString() {
		return num + ( isKwang ? "K" : "");
	}
}

public class Exercise7_14 {
	public static void main(String args[]) {
		SutdaCard_ card = new SutdaCard_(1, true);
	}
}
