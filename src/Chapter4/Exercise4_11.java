package Chapter4;

public class Exercise4_11 {
	//�Ǻ���ġ ������ ���� �� ���� ���ؼ� ���� ���� ����� ������ �����̴�.
	//1,1,2,3,5,8,13,21,...
	//1�� 1���� �����ϴ� �Ǻ���ġ������ 10��° ���� �������� ����ϴ� ���α׷�
	public static void main(String args[]) {
		int num1 = 1; //ù��° ��
		int num2 = 1; //�ι�° ��
		int num3 = 0; //����° ��
		System.out.print(num1+","+num2);
		
		for(int i=0;i<8;i++) {
			num3 = num1+num2; //����° �� = ù��° �� + �ι�° ��
			System.out.print(","+num3);
			
			num1 = num2;
			num2 = num3;
		}
	}
}
