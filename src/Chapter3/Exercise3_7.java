package Chapter3;


//화씨를 섭씨로 변환하는 코드
//C = 5/9 X (F - 32)
//변환 결과값은 소수점 셋째자리에서 반올림

public class Exercise3_7 {
	public static void main(String args[]) {
	int fahrenheit = 100; //화씨
	float celcius = (int) (5/9f*(fahrenheit-32)*100+0.5)/100f; //섭씨
	
	//5/9는정수로 0이기 때문에 float 또는 double의 형태로 바꿔줘야함
	
	System.out.println("Fahrenheit:"+fahrenheit);
	System.out.println("Celcius:"+celcius);
	}
}