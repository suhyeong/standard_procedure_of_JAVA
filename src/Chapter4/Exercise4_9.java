package Chapter4;

public class Exercise4_9 {
	//���ڷ� �̷���� ���ڿ� str�� ���� ��,
	//�� �ڸ��� ���� ���� ����� ����ϴ� �ڵ�
	//���ڿ��� "12345"��� 1+2+3+4+5�� ����� 15�� ���
	public static void main(String args[]) {
		String str = "12345";
		int sum = 0;
		
		for(int i=0;i<str.length();i++) {
			sum = sum + str.charAt(i) - '0';
		}
		System.out.println("sum="+sum);
	}
	
	//charAt(int i) �޼ҵ�� ���ڿ����� i��° ���ڸ� ��ȯ�Ѵ�.
	//����'3'�� ����'3'���� �ٲٴ� ����� ����'3'���� ����'0'�� ���ָ� �ȴ�!
	//���� '0' = �����ڵ� 48
}
