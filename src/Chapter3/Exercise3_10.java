package Chapter3;

//�빮�ڸ� �ҹ��ڷ� �����ϴ� �ڵ�
//���� ch�� ����� ���ڰ� �빮���� ��쿡�� �ҹ��ڷ� ����
//�����ڵ�� �ҹ��ڰ� �빮�ں��� 32��ŭ �� ũ��
//'A'�� �ڵ�� 65�̰� 'a'�� �ڵ�� 97
public class Exercise3_10 {
	public static void main(String args[]) {
		char ch = 'A';
		
		char lowerCase = ('A' <= ch && ch <= 'Z') ? (char)(ch + 32) : ch;
		
		System.out.println("ch:"+ch);
		System.out.println("ch to lowerCase:"+lowerCase);
	}
}
