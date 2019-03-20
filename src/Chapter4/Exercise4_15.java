package Chapter4;

public class Exercise4_15 {
	//회문수를 구하는 프로그램
	//회문수란 숫자를 거꾸로 읽어도 앞으로 읽는 것과 같은수
	//ex. 12321, 13531
	public static void main(String args[]) {
		int number = 12321;
		int tmp = number;
		
		int result = 0;
		
		while(tmp != 0) {
			//tmp%10 = number%10 = 12321%10 = 1
			result = result*10 + tmp%10;
			tmp = tmp/10;
			//첫번째 result = 0 + 1, tmp = 1232
			//두번째 result = 1*10 + 2, tmp = 123
			//세번재 result = 12*10 + 3, tmp = 12
			//네번째 result = 123*10 + 2, tmp = 1
			//다섯번째 result = 1232*10 + 1 tmp = 0
		}
		
		if(number == result)
			System.out.println(number+"는 회문수 입니다.");
		else
			System.out.println(number+"는 회문수가 아닙니다.");
	}
}
