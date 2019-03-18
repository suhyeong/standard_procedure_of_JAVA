package Chapter1;

public class ch1_Hello {
	public static void main(String[] args) {
		System.out.println("Hello, World!");
	}
	
	//Hello2.java
	//public class Hello2 { } -> 가능
	//       class Hello3 { } -> 가능
	//:: public class가 있는 경우 소스파일의 이름과 public class의 이름이 일치해야한다.
	
	
	//Hello2.java
	//class Hello2 { } -> 가능
	//class Hello3 { } -> 가능
	//:: public class가 하나도 없는 경우, 소스파일의 이름은 Hello2.java 또는 Hello3.java 모두 가능하다.
	
	
	//Hello2.java
	//public class Hello2 { } -> 가능
	//public class Hello3 { } -> 불가능
	//:: 하나의 소스파일에 둘 이상의  public class가 존재하면 안된다 !
	//   각 클래스를 별도의 소스파일에 나눠서 저장 또는 둘 중의 한 클래스에 public을 붙이지 않아야 한다.
	
	
	//Hello3.java
	//public class Hello2 { } -> 불가능
	//       class Hello3 { } -> 가능
	//:: 소스파일의 이름이 public class의 이름과 일치하지 않는다! 소스파일의 이름을 Hello2.java로 바꿔주어야한다.
	
	
	//hello2.java
	//public class Hello2 { } -> 가능
	//       class Hello3 { } -> 가능
	//:: 소스파일의 이름과 public class의 이름이 일치하지 않는다.
	//   대소문자도 구분하므로 대소문자까지 일치해줄 것!
	
}