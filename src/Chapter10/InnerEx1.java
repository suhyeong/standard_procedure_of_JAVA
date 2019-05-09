package Chapter10;

public class InnerEx1 {
	 class InstanceInner { //인스턴스 클래스
		 int iv = 100;
		 //static int cv = 100; // 에러! static변수를 선언할 수 없다.
		 final static int CONST = 100 ; //final static은 상수이므로 허용한다.
	 }
	 
	 static class StaticInner { //static 클래스
		 int iv = 200;
		 static int cv = 200; //static 클래스만 static 멤버를 정의할 수 있다.
	 }
	 
	 void myMethod() {
		 class LocalInner { //지역 클래스
			 int iv = 300;
			 //static int cv = 300; // 에러 !
			 final static int CONST = 300; // 에러 X
		 }
	 }
	 
	 public static void main(String args[]) {
		 System.out.println(InstanceInner.CONST);
		 System.out.println(StaticInner.cv);
	 }
}
