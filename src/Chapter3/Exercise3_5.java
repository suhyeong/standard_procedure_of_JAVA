package Chapter3;

//변수 num의 값 중에서 일의 자리를 1로 바꾸는 코드
//만약 num의 값이 33이라면 331, 777이라면 771
public class Exercise3_5 {
	public static void main(String args[]) {
		int num = 333;
		System.out.println(num - (num%10) + 1);
		System.out.println(num/10*10 + 1); //답
	}
}
