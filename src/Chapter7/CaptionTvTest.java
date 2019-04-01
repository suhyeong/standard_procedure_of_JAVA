package Chapter7;

class Tv {
	boolean power; //��������
	int channel; //ä��
	
	void power() { power = !power; }
	void channelUp() { ++channel; }
	void channelDown() { --channel; }
}

class CaptionTv extends Tv {
	boolean caption; //ĸ�ǻ���
	void displayCaption(String text) {
		if (caption) { //ĸ�� ���°� on(true)�� ���� text�� �����ش�
			System.out.println(text);
		}
	}
}

public class CaptionTvTest {
	public static void main(String args[]) {
		CaptionTv ctv = new CaptionTv();
		ctv.channel = 10; //����Ŭ�����κ��� ��ӹ��� ���
		ctv.channelUp(); //����Ŭ�����κ��� ��ӹ��� ���
		System.out.println(ctv.channel);
		ctv.displayCaption("Hello, World");
		ctv.caption = true; //ĸ�Ǳ�� �ѱ�
		ctv.displayCaption("Hello, World"); //ĸ���� ȭ�鿡 ���� �ش�.
	}
}
