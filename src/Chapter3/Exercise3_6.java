package Chapter3;


//���� num�� ������ ũ�鼭�� ���� ����� 10�� ������� ���� num�� ���� �� �������� ���ϴ� �ڵ�
//24�� ũ�鼭�� ���� ����� 10�� ����� 30
//19�� ��� 20, 81�� ��� 90
//30���� 24�� �� �������� 6�̱� ������ ���� num�� ���� 24��� 6�� ����� ���� �Ѵ� ..?

public class Exercise3_6 {
	public static void main(String[] args) {
		int num = 24;
		System.out.println(((num/10)+1)*10 - num);
		System.out.println(10 - num%10); //��
	}
}
