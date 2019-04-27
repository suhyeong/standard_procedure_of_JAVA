package Chapter9;

public class Exercise9_5 {
	public static int count(String src, String target) {
		int count = 0; //ã�� Ƚ��
		int pos = 0; //ã�� ������ ��ġ
		
		while(true) {
			pos = src.indexOf(target, pos);
			if(pos != -1) {
				count++;
				pos += target.length();
			} else
				break;
		}
		return count;
	}
	/*
	 * while( (pos = src.indexOf(target, pos) ) != -1) {
	 * count++;
	 * pos += target.length();
	 * }
	 */
	
	public static void main(String[] args) {
		System.out.println(count("12345AB12AB345AB", "AB"));
		System.out.println(count("12345","AB"));
	}
}
