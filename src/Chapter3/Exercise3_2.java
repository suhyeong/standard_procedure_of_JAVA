package Chapter3;

//����� ��µ� �ʿ��� �ٱ����� ���� ���ϴ� �ڵ��̴�.
//���� ����� ���� 123���̰� �ϳ��� �ٱ��Ͽ��� 10���� ����� ���� �� �ִٸ�,
//13���� �ٱ��ϰ� �ʿ��� ���̴�.

public class Exercise3_2 {
	public static void main(String[] args) {
		int numOfApples = 123; //��� ����
		int sizeOfBucket = 10; //�ٱ����� ��
		int numOfBucket = numOfApples/sizeOfBucket + (numOfApples%sizeOfBucket > 0 ? 1 : 0);//��� ����� ��µ� �ʿ��� �ٱ����� ��
				
		System.out.println("�ʿ��� �ٱ����� �� : " + numOfBucket);
	}
}
