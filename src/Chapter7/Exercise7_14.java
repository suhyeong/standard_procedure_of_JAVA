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
		//final ���� - �����ڿ��� �� �ѹ��� �ʱ�ȭ�� ���� !
	}
	
	//info() ��� ObjectŬ������ toString()�� �������̵��ߴ�.
	public String toString() {
		return num + ( isKwang ? "K" : "");
	}
}

public class Exercise7_14 {
	public static void main(String args[]) {
		SutdaCard_ card = new SutdaCard_(1, true);
	}
}
