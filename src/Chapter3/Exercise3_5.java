package Chapter3;

//���� num�� �� �߿��� ���� �ڸ��� 1�� �ٲٴ� �ڵ�
//���� num�� ���� 33�̶�� 331, 777�̶�� 771
public class Exercise3_5 {
	public static void main(String args[]) {
		int num = 333;
		System.out.println(num - (num%10) + 1);
		System.out.println(num/10*10 + 1); //��
	}
}
