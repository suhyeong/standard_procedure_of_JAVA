package Chapter2;

public class ByteOverflow {
	public static void main(String[] args) {
		byte b = 0; //byte�� ���� b ���� �� 0���� �ʱ�ȭ
		int i = 0;
		
		//�ݺ����� �̿��ؼ� b�� ���� 1��, 0���� 270���� ����
		for(int x = 0; x<= 270; x++) {
			System.out.print(b++); //print�� ��� �� �ٹٲ� X
			System.out.println('\t'); //tab ���
			System.out.println(i++);
		}
	}
	
	//byte�� �ִ밪�� 127�� �Ѿ overflow�� �߻��Ѵ� ! (-128 -> 0���� ����)
	//b�� ���� 0 ~ -1, i�� ���� 0~255(256��)
	//b�� ���� �ٽ� 0���� �����ؼ� 0 ~ -1���� �ݺ�
	
	//byte(2����)
	// + : 1 ~ 127�� -> ���Ŀ��� overflow �߻�
	// - : -128 ~ -1 -> ���Ŀ� 0���� �ݺ�
}
