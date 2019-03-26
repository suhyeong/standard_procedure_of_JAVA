package Chapter5;

public class ArrayEx12 {
	public static void main(String args[]) {
		char[] abc = {'A', 'B', 'C', 'D'};
		char[] number = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		System.out.println(new String(abc));
		System.out.println(new String(number));
		
		//배열 abc와 number를 붙여서 하나의 배열(result)로 만든다.
		char[] result = new char[abc.length+number.length];
		System.arraycopy(abc, 0, result, 0, abc.length);
		//abc[0]에서 result[0]으로 abc 길이만큼 복사 -> result = ABCD
		System.arraycopy(number, 0, result, abc.length, number.length);
		//number[0]에서 result[abc.length]로 number 길이만큼 복사 -> result = ABCD0123456789
		System.out.println(new String(result));
		
		//배열 abc을 배열 number의 첫번째 위치부터 배열 abc의 크기만큼 복사
		System.arraycopy(abc, 0, number, 0, abc.length);
		System.out.println(new String(number));
		//-> number = ABCD456789
		
		//number의 인덱스 6 위치에 3개를 복사
		System.arraycopy(abc, 0, number, 6, 3);
		System.out.println(new String(number));
		//-> number = ABCD45ABC9
	}
}
