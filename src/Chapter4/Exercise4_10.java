package Chapter4;

public class Exercise4_10 {
	//int 타입 변수 num이 있을때, 각 자리의 합을 더한 결과를 출력하는  코드
	public static void main(String args[]) {
		int num = 12345;
		int sum = 0;
		
		while(num > 0) {
			sum += num%10;
			num = num/10;
		}
		System.out.println("sum="+sum);
	}
}
