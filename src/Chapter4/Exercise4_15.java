package Chapter4;

public class Exercise4_15 {
	//ȸ������ ���ϴ� ���α׷�
	//ȸ������ ���ڸ� �Ųٷ� �о ������ �д� �Ͱ� ������
	//ex. 12321, 13531
	public static void main(String args[]) {
		int number = 12321;
		int tmp = number;
		
		int result = 0;
		
		while(tmp != 0) {
			//tmp%10 = number%10 = 12321%10 = 1
			result = result*10 + tmp%10;
			tmp = tmp/10;
			//ù��° result = 0 + 1, tmp = 1232
			//�ι�° result = 1*10 + 2, tmp = 123
			//������ result = 12*10 + 3, tmp = 12
			//�׹�° result = 123*10 + 2, tmp = 1
			//�ټ���° result = 1232*10 + 1 tmp = 0
		}
		
		if(number == result)
			System.out.println(number+"�� ȸ���� �Դϴ�.");
		else
			System.out.println(number+"�� ȸ������ �ƴմϴ�.");
	}
}
