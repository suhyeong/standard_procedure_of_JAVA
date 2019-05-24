package Chapter10;

public class InnerEx1 {
	 class InstanceInner { //�ν��Ͻ� Ŭ����
		 int iv = 100;
		 //static int cv = 100; // ����! static������ ������ �� ����.
		 final static int CONST = 100 ; //final static�� ����̹Ƿ� ����Ѵ�.
	 }
	 
	 static class StaticInner { //static Ŭ����
		 int iv = 200;
		 static int cv = 200; //static Ŭ������ static ����� ������ �� �ִ�.
	 }
	 
	 void myMethod() {
		 class LocalInner { //���� Ŭ����
			 int iv = 300;
			 //static int cv = 300; // ���� !
			 final static int CONST = 300; // ���� X
		 }
	 }
	 
	 public static void main(String args[]) {
		 System.out.println(InstanceInner.CONST);
		 System.out.println(StaticInner.cv);
	 }
}
