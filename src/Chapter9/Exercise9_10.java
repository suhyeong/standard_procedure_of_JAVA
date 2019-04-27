package Chapter9;

public class Exercise9_10 {
	static String format(String str, int length, int alignment) {
		int diff = length - str.length();
		if(diff < 0)
			return str.substring(0, length);
		
		char[] source = str.toCharArray();
		char[] chararr = new char[length];
		for(int i=0;i<chararr.length;i++)
			chararr[i] = ' ';
		
		switch(alignment) {
			case 0:
			default :
				System.arraycopy(source, 0, chararr, 0, source.length);
				break;
			case 1:
				System.arraycopy(source, 0, chararr, diff/2, source.length);
				break;
			case 2:
				System.arraycopy(source, 0, chararr, diff, source.length);
				break;
		}
		return new String(chararr);
	}
	
	public static void main(String[] args) {
		String str = "������";
		System.out.println(format(str,7,0)); //���� ����
		System.out.println(format(str,7,1)); //��� ����
		System.out.println(format(str,7,2)); //������ ����
	}
}
