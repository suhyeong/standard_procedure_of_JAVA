package Chapter4;

public class Exercise4_13 {
	//�־��� ���ڿ��� �������� �Ǻ��ϴ� ���α׷�
	public static void main(String args[]) {
		String value = "12o34";
		char ch = ' ';
		boolean isNumber = true;
		
		//�ݺ����� charAt(int i)�� �̿��ؼ� ���ڿ��� ���ڸ� �ϳ��� �о� �˻��Ѵ�
		for(int i=0;i<value.length();i++) {
			ch = value.charAt(i);
			if(!('0' <= ch && ch <='9')) {
				isNumber = false;
				break;
			}
		}
		
		if (isNumber) {
			System.out.println(value+"�� �����Դϴ�.");
		} else {
			System.out.println(value+"�� ���ڰ� �ƴմϴ�.");
		}
	}
}
