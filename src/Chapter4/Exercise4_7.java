package Chapter4;

public class Exercise4_7 {
	//Math.random()�� ����Ͽ� 1���� 6������ ������ ������ ���� value�� �����ϴ� �ڵ带 �ϼ�
	//Math.random()�� 0.0�� 1.0 ������ ������ ���ϴ� �ϳ��� double ���� ��ȯ�Ѵ�!
	public static void main(String args[]) {
		int value = (int)(Math.random()*6)+1;
		System.out.println("value:"+value);
	}
}
