package Chapter10;

public class InnerEx6 {
	Object iv = new Object(); //�͸� Ŭ����
	static Object cv = new Object() {
		void method() { }
	}; //�͸� Ŭ����
	
	void myMethod() {
		Object lv = new Object() {
			void method() { }
		}; //�͸� Ŭ����
	}
}
