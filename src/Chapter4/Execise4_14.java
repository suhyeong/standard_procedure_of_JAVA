package Chapter4;

import java.util.*;

public class Execise4_14 {
	//���ڸ��߱� ����
	public static void main(String args[]) {
		//1~100 ������ ������ ���� ��� answer�� ����
		int answer = (int)(Math.random()*100)+1;
		int input = 0; //����� �Է��� ������ ����
		int count = 0; //�õ� Ƚ��
		
		Scanner s = new Scanner(System.in);
		
		do {
			count++;
			System.out.print("1�� 100 ������ ���� �Է��ϼ��� : ");
			input = s.nextInt(); //�Է¹��� ���� ���� input�� ����
			
			if(answer > input)
				System.out.println("�� ū ���� �Է��ϼ���.");
			else if(answer == input) {
				System.out.println("������ϴ�.");
				System.out.println("�õ�Ƚ���� "+count+"���Դϴ�.");
				break;
			}
			else if(answer < input)
				System.out.println("�� ���� ���� �Է��ϼ���.");
		} while(true); //���� �ݺ���
	}
}
