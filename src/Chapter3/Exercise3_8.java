package Chapter3;

public class Exercise3_8 {
	public static void main(String args[]) {
		byte a = 10;
		byte b = 20;
		byte c = (byte)(a+b);
		
		char ch = 'A';
		ch = (char)(ch + 2);
		
		float f = (3f / 2);
		long l = (3000 * 3000 * 3000l);
		//int*int*int = int
		//int 타입의 최대값을 넘어 overflow 발생
		//피연산자 중 적어도 한 값은 long타입이여야 최종결과를 long타입의 값으로 얻기 때문에 접미사를 붙여준다.
		
		float f2 = 0.1f;
		double d = 0.1;
		
		boolean result = (float)d == f2;
		
		System.out.println("c="+c);
		System.out.println("ch="+ch);
		System.out.println("f="+f);
		System.out.println("l="+l);
		System.out.println("result="+result);
	}
}
