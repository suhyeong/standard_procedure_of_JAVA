package Chapter4;

//�ΰ��� �ֻ����� ������ ��, ���� ���� 6�� �Ǵ� ��� ����� ���� ����ϴ� ���α׷�
public class exercise4_6 {
	public static void main(String args[]) {
		int i, j; //i+j=6
		
		for(i=1;i<=6;i++) {
			for(j=1;j<=6;j++) {
				if((i+j) == 6)
					System.out.println(i+", "+j);
			}
		}
	}
}
