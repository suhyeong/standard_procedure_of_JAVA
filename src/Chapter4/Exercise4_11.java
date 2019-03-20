package Chapter4;

public class Exercise4_11 {
	//피보나치 수열은 앞을 두 수를 더해서 다음 수를 만들어 나가는 수열이다.
	//1,1,2,3,5,8,13,21,...
	//1과 1부터 시작하는 피보나치수열의 10번째 수는 무엇인지 계산하는 프로그램
	public static void main(String args[]) {
		int num1 = 1; //첫번째 값
		int num2 = 1; //두번째 값
		int num3 = 0; //세번째 값
		System.out.print(num1+","+num2);
		
		for(int i=0;i<8;i++) {
			num3 = num1+num2; //세번째 값 = 첫번째 값 + 두번째 값
			System.out.print(","+num3);
			
			num1 = num2;
			num2 = num3;
		}
	}
}
