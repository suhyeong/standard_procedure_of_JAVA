package Chapter4;

public class Exercise4_7 {
	//Math.random()을 사용하여 1부터 6사이의 임의의 정수를 변수 value에 저장하는 코드를 완성
	//Math.random()은 0.0과 1.0 사이의 범위에 속하는 하나의 double 값을 반환한다!
	public static void main(String args[]) {
		int value = (int)(Math.random()*6)+1;
		System.out.println("value:"+value);
	}
}
