package Chapter2;

class CharToCode {
	public static void main(String[] args) {
		char ch = 'A'; // char ch = '\u0041';로 바꿔서도 같다.
		int code = (int)ch;
		
		System.out.println(ch);
		System.out.println(code);
		
		int code2 = 65;
		char ch2 = (char)code;
		
		System.out.println(code2);
		System.out.println(ch2);
	}
	
	//문자 A = (10진수) 65
}