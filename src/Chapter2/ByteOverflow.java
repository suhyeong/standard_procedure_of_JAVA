package Chapter2;

public class ByteOverflow {
	public static void main(String[] args) {
		byte b = 0; //byte형 변수 b 선언 후 0으로 초기화
		int i = 0;
		
		//반복문을 이요해서 b의 값을 1씩, 0부터 270까지 증가
		for(int x = 0; x<= 270; x++) {
			System.out.print(b++); //print는 출력 후 줄바꿈 X
			System.out.println('\t'); //tab 출력
			System.out.println(i++);
		}
	}
	
	//byte의 최대값인 127을 넘어서 overflow가 발생한다 ! (-128 -> 0까지 간다)
	//b의 값은 0 ~ -1, i의 값은 0~255(256개)
	//b의 값은 다시 0부터 시작해서 0 ~ -1까지 반복
	
	//byte(2진수)
	// + : 1 ~ 127개 -> 이후에는 overflow 발생
	// - : -128 ~ -1 -> 이후에 0부터 반복
}
