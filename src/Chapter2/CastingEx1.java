package Chapter2;

public class CastingEx1 {
	public static void main(String[] args) {
		double d = 100.0;
		int i = 100;
		int result = i + (int)d; //형변환
		
		System.out.println("d=" + d);
		System.out.println("i=" + i);
		System.out.println("result=" + result);
	}
	
	//형변환 이후에도 피연산자에는 아무런 변화가 없다!
}
