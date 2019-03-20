package Chapter4;

public class Exercise4_9 {
	//숫자로 이루어진 문자열 str이 있을 때,
	//각 자리의 합을 더한 결과를 출력하는 코드
	//문자열이 "12345"라면 1+2+3+4+5의 결과인 15를 출력
	public static void main(String args[]) {
		String str = "12345";
		int sum = 0;
		
		for(int i=0;i<str.length();i++) {
			sum = sum + str.charAt(i) - '0';
		}
		System.out.println("sum="+sum);
	}
	
	//charAt(int i) 메소드는 문자열에서 i번째 문자를 반환한다.
	//문자'3'을 숫자'3'으로 바꾸는 방법은 문자'3'에서 문자'0'을 빼주면 된다!
	//문자 '0' = 문자코드 48
}
