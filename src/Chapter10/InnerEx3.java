package Chapter10;

public class InnerEx3 {
	private int outerIv = 0;
	static int outerCv = 0;
	
	class InstanceInner {
		int iiv = outerIv; //�ܺ� Ŭ������ private����� ������ �����ϴ�
		int iiv2 = outerCv;
	}
	
	static class StaticInner {
		//static Ŭ������ �ܺ� Ŭ������ �ν��Ͻ������ ������ �� ����
		//int siv = outerIv;
		static int scv = outerCv;
	}
	
	void myMethod() {
		int iv = 0;
		final int LV = 0;
		
		class LocalInner {
			int liv = outerIv;
			int liv2 = outerCv;
			//�ܺ� Ŭ������ ���������� final�� ���� ����(���)�� ���ٰ���
			//int liv3 = lv; //����!
			int liv4 = LV; // OK
		}
	}
}
