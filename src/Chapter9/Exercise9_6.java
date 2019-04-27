package Chapter9;

import java.util.Arrays;

public class Exercise9_6 {
	public static String fillZero(String src, int length) {
		if(src == null || src.length() == length)
			return src;
		else if(length <= 0)
			return "";
		else if(src.length() > length)
			return src.substring(0, length);
		
		char[] chararr = new char[length];
		Arrays.fill(chararr, '0');
		System.arraycopy(src.toCharArray(), 0, chararr, length-src.length(), src.length());
		return new String(chararr);
		
	}
	
	public static void main(String args[]) {
		String src = "12345";
		System.out.println(fillZero(src, 10));
		System.out.println(fillZero(src, -1));
		System.out.println(fillZero(src, 3));
	}
}
