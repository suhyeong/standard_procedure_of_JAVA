package Chapter2;

class CharToCode {
	public static void main(String[] args) {
		char ch = 'A'; // char ch = '\u0041';�� �ٲ㼭�� ����.
		int code = (int)ch;
		
		System.out.println(ch);
		System.out.println(code);
		
		int code2 = 65;
		char ch2 = (char)code;
		
		System.out.println(code2);
		System.out.println(ch2);
	}
	
	//���� A = (10����) 65
}