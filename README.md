# standard_procedure_of_JAVA
Practice of book 'JAVA의 정석(남궁성 저자)'
JAVA의 정석 책에 수록되어 있는 예제문제 혹은 연습문제 풀이입니다.


## Chapter 6. 객체지향 프로그래밍 1 
 


> <클래스메서드(static메서드)와 인스턴스메서드>

static이 붙어 있으면 클래스메서드, 붙어있지 않으면 인스턴스메서드

클래스메서드는 객체를 생성하지 않고도 클래스이름.메서드이름(매게변수)와 같은 식으로 호출이 가능하지만,
인스턴스 메서드는 반드시 객체를 생성해야만 호출할 수 있다.


인스턴스메서드 = 인스턴스 변수와 관련된 작업을 하는, 즉 메서드의 작업을 수행하는데 인스턴스 변수를 필요로 하는 메서드


* 클래스를 설계할 때, 멤버변수 중 모든 인스턴스에 공통적으로 사용해야하는 것에 static을 붙인다.

: 모든 인스턴스에서 같은 값이 유지되어야 하는 변수는 static을 붙여서 클래스 변수로 정의해야한다

* 클래스변수(static 변수)는 인스턴스를 생성하지 않아도 사용할 수 있다.

: static이 붙은 변수(클래스변수)는 클래스가 메모리에 올라갈 때 이미 자동적으로 생성되기 때문이다

* 클래스메서드(static메서드)는 인스턴스변수를 사용할 수 없다.

: 인스턴스 변수는 인스턴스가 반드시 존재해야만 사용할 수 있는데, 클래스메서드는 인스턴스 생성 없이 호출 가능하므로 클래스메서드가 호출되었을 때 인스턴스가 존재할 수도 있고 존재하지 않을 수도 있다.

그래서 클래스메서드에서 인스턴스 변수의 사용을 금지한다.

그러나 인스턴스 변수나 인스턴스메서드에서는 static이 붙은 멤버들을 사용하는 것이

언제나 가능하다. 인스턴스변수가 존재한다는 것은 static이 붙은 변수가 이미 메모리에 존재한다는 것을 의미하기 때문이다.


* 메서드 내에서 인스턴스 변수를 사용하지 않는다면, static을 붙이는 것을 고려한다.

: 메서드의 작업내용 중 인스턴스변수를 필요로 한다면, static을 붙일 수 없다.

반대로 인스턴스변수를 필요로 하지 않는다면 static을 붙이자 ! 메서드 호출시간이 짧아지기 때문에 효율이 높아진다.

static을 안붙인 메서드(인스턴스메서드)는 실행 시 호출되어야 할 메서드를 찾는 과정이 추가적으로 필요하기 때문에 시간이 더 걸린다.







> <메서드 오버로딩(method overloading)>

(= overloading)

: 한 클래스 내에 같은 이름의 메서드를 여러 개 정의하는 것. 하나의 메서드 이름으로 여러 기능을 구현한다.


-> 메서드 이름이 같아야 한다.

-> 매개변수의 개수 또는 타입이 달라야 한다.

-> 매개변수는 같고 리턴타입이 다른 경우에는 오버로딩이 성립되지 않는다. (리턴타입은 오버로딩을 구현하는데 아무런 영향을 주지 못한다.)

-> 오버로딩된 메서드들은 매개변수에 의해서만 구별될 수 있다.

-> 메서드의 이름을 절약할 수 있다는 것 ! 하나의 이름으로 여러 개의 메서드를 정의 할 수 있으니 메서드의 이름을 짓는데 고민을 덜 수 잇는 동시에 사용되었어야 할 메서드 이름을 다른 메서드의 이름으로 사용할 수 있다.

-> 기억하기 쉽고 이름도 짧게 할 수 있어서 오류의 가능성을 많이 줄일 수 있으며 메서드의 이름만 보고 같은 기능을 하겠구나. 라고 쉽게 예측이 가능하다.


ex)

```
int add(int a, int b) { return a+b; }

long add(long a, long b) { return x+y;}

int add(int[] a) {

      int result = 0;
      
      for(int i=0 ; i<a.length ; i++)
      
           result += a[i];
           
      return result;
      
}
```




> <생성자>

:인스턴스가 생성될 때 호출되는 '인스턴스 초기화 메서드

인스턴스 변수의 초기화 작업에 주로 사용되며, 인스턴스 생성 시에 실행되어야 할 작업을 위해서도 사용

인스턴스 초기화 = 인스턴스 변수들을 초기화하는 것을 뜻한다.

-> 생성자의 이름은 클래스의 이름과 같아야 한다.

-> 생성자는 리턴값이 없다.

-> 생성자도 오버로딩이 가능하므로 하나의 클래스에 여러 개의 생성자가 있을 수 있다.

-> 생성자도 메서드이기 때문에 리턴값이 없다는 의미의 void를 적어야 하지만, 모든 생성자가 리턴값이 없으므로 void를 생략하도록 한 것이라고 이해하기


생성자에서 다른 생성자 호출하기 - this(), this

-> 생성자의 이름으로 클래스 이름 대신 this를 사용한다.

-> 한 생성자에서 다른 생성자를 호출할 때는 반드시 첫줄에서만 호출이 가능하다.

this : 인스턴스 자신을 가리키는 참조변수. 인스턴스의 주소가 저장되어 있다. 모든 인스턴스메서드에 지역번수로 숨겨진 채로 존재한다.

this(), this(매개변수) : 생성자, 같은 클래스의 다른 생성자를 호출할 때 사용한다.



## Chapter 7. 객체지향 프로그래밍 2



> <상속>

: 기존의 클래스를 재사용하여 새로운 클래스를 작성하는 것. 코드의 추가 및 변경이 매우 용이하며 코드의 재사용성을 높이고 코드의 중복을 제거하여 프로그램의 생산성과 유지보수에 크게 기여한다.

```
class Child extends Parent {
     // ...
}
```

-> 조상 클래스 - 부모(parent)클래스, 상위(super)클래스, 기반(base)클래스

-> 자손 클래스 - 자식(child)클래스, 하위(sub)클래스, 파생된(derived)클래스

-> 조상 클래스가 변경되면 자손 클래스는 자동적으로 영향을 받게 되지만, 자손 클래스가 변경되는 것은 조상 클래스에 아무런 영향을 주지 못한다.

-> 자손 클래스의 멤버 개수는 조상 클래스보다 항상 같거나 많다. 즉 상속에 상속을 거듭할수록 상속받는 클래스의 멤버 개수는 점점 늘어나게 되고, 상속을 받는다는 것은 조상 클래스를 확장(extend)한다는 의미이기도 하다.

-> private 또는 default가 사용된 멤버들은 상속되지 않는다기보다는 상속은 받지만 자손클래스로부터의 접근이 제한되는 것이다.




> <오버라이딩 (Overriding)>

-> 자손 클래스에서 오버라이딩하는 메서드는 조상 클래스의 메서드와 이름, 매개변수, 리턴타입이 같아야한다. (메서드의 내용만을 새로 작성하는 것)

-> 접근 제어자는 조상 클래스의 메서드보다 좁은 범위로 변경할 수 없다. (접근 제어자의 접근범위 public > protected > default > private)

-> 조상 클래스의 메서드보다 많은 수의 예외를 선언할 수 없다.

-> 인스턴스메서드를 static메서드로 또는 그 반대로 변경할 수 없다.



> <오버로딩(new) vs 오버라이딩(change, modify)>


```
class Parent {
      void parentMethod() { }
}

class Child extends Parent {
     void parentMethod() { } //오버라이딩
     void parentMethod(int i) { } //오버로딩

     void childMethod() { }
     void childMethod(int i) { } //오버로딩
}
```



> <제어자 (modifier)>

: 클래스나 멤버변수와 메서드에서 주로 사용되며, 하나의 대상에 대해서 여러 제어자를 조합하여 사용하는 것이 가능하다.

-> 접근 제어자 : public, protected, default, private

-> 그         외 :  static, final, abstract, native, transient, synchronized, volatile, strictfp



* static - 클래스의, 공통적인

-> static이 붙은 멤버변수와 메서드, 그리고 초기화 블럭은 인스턴스가 아닌 클래스에 관계된 것이기 때문에 인스턴스를 생성하지 않고도 사용할 수 있다.

-> 사용될 수 있는 곳 : 멤버변수, 메서드, 초기화 블럭



* final - 마지막의, 변경될 수 없는

-> 변수에 사용되면 값을 변경할 수 없는 상수가 된다.

-> 메서드에 사용되면 오버라이딩을 할수 없게 된다.

-> 클래스에 사용되면 자신을 확장하는 자손클래스를 정의하지 못하게 된다.

-> 사용될 수 있는 곳 : 클래스, 메서드, 멤버변수, 지역변수

```
final class FinalTest { //조상이 될 수 없는 클래스
     final int MAX_SIZE = 10; //값을 변경할 수 없는 멤버변수(상수)

     final void getMaxSize() { //오버라이딩을 할 수 없는 메서드
           final int LV = MAX_SIZE; //값을 변경할 수 없는 지역변수(상수)
           return MAX_SIZE;
      }
}
```

-> 생성자를 이용한 final 멤버변수 초기화

```
class Card {
     final int NUMBER; //상수지만 선언과 함께 초기화하지 않는다. (선언과 함께 초기화하게 되면 값이 변할 수 없게 된다.)
     final String KIND; //생성자에서 단 한번만 초기화할 수 있다.
     static int width = 100;
     static int height = 250;

     Card(String kind, int num) { //매개변수로 넘겨받은 값으로 KIND와 NUMBER를 초기화한다.
           KIND = kind;
           NUMBER = num;
     }

     Card() {
           this("HEART", 1);
     }

     public String toString() {
             return KIND + " " + NUMBER;
      }
}

class FinalCardTest {
      public static void main(String args[]) {
              Card c = new Card("HEART", 10);
              //c.NUMBER = 5;  < error !! final로 선언된 값은 직접 값을 변경할 수 없다.
              System.out.println(c.KIND);
              System.out.println(c.NUMBER);
      }
}
```


* abstract - 추상의, 미완성의

-> 메서드의 선언부만 작성하고 실제 수행내용은 구현하지 않은 추상메서드를 선언하는데 사용된다.

-> 사용될 수 있는 곳 : 클래스, 메서드

-> 추상메서드가 없는 클래스도 abstract를 붙여서 추상클래스로 선언하는 것이 가능하지만 그렇게 해야 할 이유는 없다.

```
abstract class AbstractTest { //추상클래스 (추상메서드를 포함한 클래스)
       abstract void move(); //추상메서드 (구현부가 없는 메서드)
}
```


* 접근 제어자 (access modifier)

-> 멤버 또는 클래스에 사용되며, 해당하는 멤버 또는 클래스를 외부에서 접근하지 못하도록 제한하는 역할을 한다.

-> default는 생략 가능 및 표시하지 않는다.

-> 접근 범위 : public > protected > default > private

    (private : 같은 클래스 내에서만 접근이 가능하다.
    
     default : 같은 패키지 내에서만 접근이 가능하다.
     
     protected : 같은 패키지 내에서, 그리고 다른 패키지의 자손클래스에서 접근이 가능하다.
     
     public : 접근 제한이 전혀 없다. )
     
-> 접근 제어자를 사용하는 이유 : 외부로부터 데이터를 보호하기 위해서 & 외부에는 불필요한, 내부적으로만 사용되는, 부분을 감추기 위해서

```
public class TimeTest {
      public static void main(String[] args)
      {
          Time t = new Time(12, 35, 30); //메서드를 통한 접근만이 허용된다.
          System.out.println(t);
          //t.hour = 13; < error !! 변수 hour의 접근 제어자가 private이므로 접근할 수 없다.
          t.setHour(t.getHour()+1);
          System.out.println(t); // = System.out.println(t.toString());
      }
}

class Time {
      private int hour;
      private int minute;
      private int second;

      Time(int hour, int minute, int second) {
             setHour(hour);
             setMinute(minute);
             setSecond(second);
      }

      public int getHour() {          return hour; }
      public void setHour(int hour) {
             if (hour < 0 | | hour > 23)  return;
             this.hour = hour;
      }
      public int getMinute() {          return minute; }
      public void setMinute(int minute) {
             if (minute < 0 | | minute > 59)  return;
             this.minute = minute;
      }
      public int getSecond() {          return second; }
      public void setSecond(int second) {
             if (second < 0 | | second > 59)  return;
             this.second = second;
      }
      public String toString() {
            return hour + ":" + minute + ":" + second;
      }
}
```



* 제어자의 조합

-> 메서드에서 static과 abstract를 함께 사용할 수 없다.

: static 메서드는 몸통이 있는 메서드에만 사용될 수 있기 때문이다.

-> 클래스에 abstract와 final을 동시에 사용할 수 없다.

: 클래스에 사용되는  final은 클래스를 확장할 수 없다는 의미이고 abstract는 상속을 통해서 완성되어야 한다는 의미이므로 서로 모순되기 때문이다.

-> abstract 메서드의 접근 제어자가 private일 수 없다.

: abstract 메서드는 자손클래스에서 구현해주어야하는데 접근 제어자가 private이면 자손 클래스에서 접근할 수 없기 때문이다.

-> 메서드에 private과 final을 같이 사용할 필요는 없다.

: 접근 제어자가 private인 메서드는 오버라이딩될 수 없기 때문이다. 이 둘 중 하나만 사용해도 의미가 충분하다.




> <다형성 (polymorphism)>

: 여러 가지 형태를 가질 수 있는 능력. (조상 클래스) 참조 변수= new (자손 클래스);
```
CaptionTv c = new CaptionTv();
Tv t = new CaptionTv();
```
-> 참조 변수 t로는 CaptionTv 인스턴스의 모든 멤버를 사용할 수 없다.

    Tv타입의 참조변수로는 CaptionTv인스턴스 중에서 Tv클래스의 멤버들(상속받은 멤버포함)만 사용할 수 있다.



* 참조변수의 형변환
```
public class CastingTest1 {
	public static void main(String args[]) {
		Car car = null; //Car타입의 참조변수 car를 선언하고 null로 초기화한다.
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = fe; //car = (Car)fe; 에서 형변환이 생략된 형태이다. 조상타입 <- 자손타입 :: 형변환 생략 가능
		//car.water(); < error ! Car타입의 참조변수로는 water()를 호출할 수 없다.
		fe2 = (FireEngine)car; //자손타입 <- 조상타입 :: 형변환 생략 불가능
		fe2.water();
	}
}

class Car {
	String color;
	int door;
	
	void drvie() { //운전하는 기능
		System.out.println("drive, Brrr~");
	}
	
	void stop() { //멈추는 기능
		System.out.println("stop!!!");
	}
}

class FireEngine extends Car { //소방차, Car의 자손 클래스
	void water() { //물을 뿌리는 기능
		System.out.println("water!!!");
	}
}
```



> <추상클래스(abstract class)>

-> 추상 클래스 사용시 상속을 통해 구현해주어야한다는 것을 abstract를 통해 알 수 있다.

-> 메서드를 사용하는 쪽에서는 메서드가 실제로 어떻게 구현되어있는지 몰라도 메서드의 이름과 매개변수, 리턴타입만 알고 있으면 되므로 코드를 작성하는 것이 가능하다.

-> 실제로는 자손 클래스에 구현된 완성된 메서드가 호출되도록 할 수 있다.

-> 추상클래스도 생성자가 있어야 한다.

-> abstract 리턴타입 메서드이름();




> <인터페이스 (interface)>
```
interface 인터페이스이름 {
     public static final 타입 상수이름 = 값;
     public abstract 메서드이름(매개변수 목록);
}
```

->추상클래스보다 추상화 정도가 높아서 추상클래스와 달리 몸통을 갖춘 일반 메서드 또는 멤버변수를 구성원으로 가질 수 없다.

-> 오직 추상메서드와 상수만을 멤버로 가질 수 있으며 그 외의 다른 어떠한 요소도 허용하지 않는다.

-> 모든 멤버변수는 [public static final]이어야 하며, 이를 생략할 수 있다.

-> 모든 메서드는 [public abstract]이어야 하며, 이를 생략할 수 있다.

-> 인터페이스는 인터페이스로부터만 상속받을 수 있으며, 클래스와는 달리 다중상속(여러 개의 인터페이스로부터 상속 받는것)이 가능하다. (Object 클래스와 같은 최고 조상은 없다.)

-> 개발시간 단축 & 표준화 가능 & 서로 관계없는 클래스들에게 관계 맺기 가능 & 독립적인 프로그래밍이 가능

-> 클래스를 사용하는 쪽(User)과 클래스를 제공하는 쪽(Provider)이 있다.

-> 메서드를 사용(호출)하는 쪽(User)에서는 사용하려는 메서드(Provider)의 선언부만 알면 된다. (내용은 몰라도 된다.)


```
class 클래스이름 implements 인터페이스이름 {
         //인터페이스에 정의된 추상메서드를 구현해야한다.
}

class Fighter implements Fightable {  //Fighter 클래스는 Fightable 인터페이스를 구현한다.
      public vid move(int x, int y) { /* 내용 생략 */}
      public void attack(Unit u) { /* 내용 생략 */ }
}
```

-> 구현하는 인터페이스의 메서드 중 일부만 구현한다면, 추상클래스로 선언되어야 한다.

-> 상속과 구현을 동시에 할 수도 있다.

```
class Fighter extends Unit implements Fightable {
      public vid move(int x, int y) { /* 내용 생략 */}
      public void attack(Unit u) { /* 내용 생략 */ }
}
```


## Chapter 8 . 예외처리



> <예외처리>

-> 에러(error) : 프로그램 코드에 의해서 수습될 수 없는 심각한 오류 (ex. 메모리 부족, 스택오버플로우)

-> 예외 (exception) : 프로그램 코드에 의해서 수습될 수 있는 다소 미약한 오류 (발생하더라도 수습될 수 있는 비교적 덜 심각한 문제)

-> 예외처리 (exception handling) : 프로그램 실행 시 발생할 수 있는 예외의 발생에 대비한 코드를 작성하는 것

    └ 프로그램의 비정상 종료를 막고, 정상적인 실행상태를 유지하는 것

-> 모든 예외의 최고 조상은 Exception클래스 이며, RuntimeException 클래스와 그 자손 클래스들, Exception 클래스와 그 자손 클래스들로 나눠질 수 있다.

① RuntimeException 클래스 : 주로 프로그래머의 실수에 의해서 발생될 수 있는 예외들. 자바의 프로그래밍 요소들과 관계가 깊다. (ex. 배열의 범위를 벗어남, 값이 null인 참조변수의 멤버를 호출, 클래스간 잘못된 형변환, 정수를 0으로 나눔 등)

② Exception 클래스 : 사용자의 실수와 같은 외적인 요인에 의해 발생하는 예외, 주로 외부의 영향으로 발생할 수 있는 것들 (ex. 존재하지 않는 파일의 이름을 입력, 클래스의 이름을 잘못 작성, 입력한 데이터 형식이 잘못된 경우 등)


* try - catch

```
try {
      //예외가 발생할 가능성이 있는 문장들을 넣는다.
} catch (Exception e1) {
     // Exception1이 발생했을 경우, 이를 처리하기 위한 문장을 적는다.
} catch (Exception e2) {
     // Exception2가 발생했을 경우, 이를 처리하기 위한 문장을 적는다.
...
} catch (Exception eN) {
     // ExceptionN이 발생했을 경우, 이를 처리하기 위한 문장을 적는다.
}
```

-> 발생한 예외의 종류와 일치하는 catch 블럭이 없으면 예외는 처리되지 않는다.

-> if문처럼 포함된 문장이 하나라고 해서 괄호({ })를 생략할 수는 없다.


-> try 블럭 내에서 예외가 발생한 경우

① 발생한 예외와 일치하는 catch 블럭이 있는지 확인한다.

② 일치하는 catch 블럭을 찾게 되면, 그 catch 블록 내의 문장들을 수행하고 전체 try-catch문을 빠져나가서 그 다음 문장을 계속해서 수행한다. 만약 일치하는 catch 블럭을 찾지 못하면, 예외는 처리되지 못한다.
    
-> try 블럭 내에서 예외가 발생하지 않은 경우

① catch 블럭을 거치지 않고 전체 try-catch문을 빠져나가서 수행을 계속한다.



* 예외 발생시키기

① 연산자 new를 이용해서 발생시키려는 예외 클래스의 객체를 만든다. (Exception e = new Exception("고의로 발생시켰음");

② 키워드 throw를 이용해서 예외를 발생시킨다. (throw e);


-> printStackTrace() : 예외발생 당시의 호출스택(Call Stack)에 있었던 메서드의 정보와 예외 메시지를 화면에 출력한다.

-> getMessage() : 발생한 예외클래스의 인스턴스에 저장된 메시지를 얻을 수 있다.

-> printStackTrace(PrintStream s) 또는 printStackTrace(PrintWriter s) : 발생한 예외에 대한 정보를 파일에 저장 할 수 있다.

-> System.out, System.err : System 클래스의 static 멤버로서 프로그램의 어디에서나 사용할 수 있다.


* finally 블럭
```
try {
      //예외가 발생할 가능성이 있는 문장들을 넣는다.
} catch (Exception e1) {
      // Exception1이 발생했을 경우, 이를 처리하기 위한 문장을 적는다.
} finally {
      // 예외의 발생여부에 관계없이 항상 수행되어야하는 문장들을 넣는다.
      // finally 블럭은 try-catch문의 맨 마지막에 위치해야 한다.
```

-> 예외가 발생한 경우 try -> catch -> finally 순으로 실행되고, 예외가 발생하지 않은 경우 try -> finally 순으로 실행된다.


(4) 메서드에 예외 선언하기 : 메서드의 선언부에 키워드 throws를 사용해서 메서드 내에서 발생할 수 있는 예외를 적어준다.





## Chapter 10 . 내부 클래스


> <내부 클래스>


-> 내부 클래스 : 클래스 내에 선언된 클래스 (두 클래스가 서로 긴밀한 관계에 있기 때문이다.)

-> 내부 클래스의 장점

① 내부 클래스에서 외부 클래스의 멤버들을 쉽게 접근할 수 있다.

② 코드의 복잡성을 줄일수 있다. (캡슐화)

-> 내부 클래스는 외부 클래스를 제외하고 다른 클래스에서 잘 사용되지 않는 것이여야 한다.



```
class A {
	// . . .
}

class B {
	// . . .
}
```
->
```
class A { //외부 클래스
	// . . .
	class B { //내부 클래스
		// . . .
	}
	// . . .
}
```


* 내부 클래스의 종류와 특징

	* 인스턴스 클래스 (instance class) : 외부 클래스의 멤버변수 선언위치에 선언. 외부 클래스의 인스턴스멤버처럼 다루어진다.

	* 스태틱 클래스 (static class) : 외부 클래스의 멤버 변수 선언위치에 선언. 외부 클래스의 static멤버처럼 다루어진다.

	* 지역 클래스 (local class) : 외부 클래스의 메서드나 초기화블럭 안에 선언. 선언된 영역 내부에서만 사용될 수 있다.

	* 익명 클래스 (anonymous class) : 클래스의 선언과 객체의 생성을 동시에 하는 이름없는 클래스 (일회용)

-> 내부 클래스도 클래스이기 때문에 abstract나 final과 같은 제어자를 사용할 수 있을 뿐만 아니라 멤버변수들처럼 private, protected와 접근제어자도 사용이 가능하다.

-> 내부 클래스 중 static 클래스만이 static멤버를 가질 수 있다. 다만 final과 static이 동시에 붙은 변수는 상수(constant)이므로 모든 내부 클래스에서 정의가 가능하다.


* 익명 클래스

-> 다른 내부 클래스와 달리 이름이 없고 클래스의 선언과 객체의 생성을 동시에 하기 때문에 단한번만 사용될 수 있고 오직 하나의 객체만을 생성할 수 있는 일회용 클래스.

```
new 조상클래스이름() {
	//멤버 선언
}

```
```
new 구현인터페이스이름() {
	//멤버 선언
}
```


① 이름이 없기 때문에 생성자도 가질 수 없다.

② 조상클래스의 이름이나 구현하고자 하는 인터페이스의 이름을 사용해서 정의하기 때문에 하나의 클래스로 상속받는 동시에 인터페이스를 구현하거나 둘 이상의 인터페이스를 구현할 수 없다.

=> 오로지 단 하나의 클래스를 상속받거나 단 하나의 인터페이스만을 구현 할 수 있다.


## Chapter 11. 컬렉션 프레임워크와 유용한 클래스

> 1. 컬렉션 프레임워크(Collection Framework)
: 데이터 군을 저장하는 Vector와 같은 클래스들을 표준화한 설계
-> 컬렉션(다수의 데이터)을 다루는 데에 필요한 다양하고 풍부한 클래스들을 제공하기 때문에 프로그래머의 짐을 상당히 덜어줌
-> 인터페이스의 다형성을 이용한 객체 지향적 설계를 통해 표준화되어 있기 때문에 사용법을 익히기에도 편리하고 재사용성이 높은 코드를 작성할 수 있다는 장점

* List, Set, Map

	* 인터페이스 특징
	List : 순서가 있는 데이터의 집합. 데이터의 중복을 허용 O (ArrayList, LinkedList, Stack, Vector)
	Set : 순서를 유지하지 않는 데이터의 집합. 데이터의 중복 허용 X (HashSet, TreeSet)
	Map : 키와 값의 쌍으로 이루어진 데이터의 집합. 순서는 유지되지 않으며 키는 중복을 허용하지 않고 값은 중복을 허용 (HashMap, TreeMap, Hashtable, Properties)


* 동기화(Synchronization)
```
List list = Collections.snchronizedList(new ArrayList(...));
```


* Vector, ArrayList
-> 공통점
① List인터페이스를 구현. 저장순서가 유지되고 중복을 허용
② 데이터의 저장 공간으로 배열을 사용
-> 차이점
① Vector는 멀티쓰레드에 대한 동기화가 되어있으나 ArrayList는 그렇지 않다.


* LinkedList
-> 배열의 장점
① 구조가 간단하며 사용하기 쉽고 데이터를 읽어오는데 걸리는 시간이 가장 빠르다
-> 배열의 단점
① 크기를 변경할 수 없다. (새로운 배열을 생성해서 데이터를 복사하는 작업이 필요)
② 비순차적인 데이터의 추가 또는 삭제에 시간이 많이 걸린다.
-> 배열의 단점을 보완하기 위해 LinkedList를 사용
: LinkedList의 각 요소(node)들은 자신과 연결된 다음 요소에 대한 참조(주소값)와 데이터로 구성
```
class Node {
	Node next; //다음 요소의 주소를 저장
	object ojb; //데이터를 저장
}
```
-> LinkedList는 이동방향이 단방향이기 때문에 다음 요소에 대한 접근은 쉽지만 이전 요소에 대한 접근은 어려움 => 이 점을 보완하여 Doubly Linked List(이중 연결리스트)를 사용

```
class Node {
	Node next; //다음 요소의 주소를 저장
	Node previous; //이전 요소의 주소를 저장
	Object obj; //데이터를 저장
}
```

-> ArrayList와 LinkedList 비교
① 순차적으로 추가/삭제하는 경우에는 ArrayList가 더 빠르다

② 중간 데이터를 추가/삭제하는 경우에는 LinkedList가 더 빠르다


-> 두 클래스를 혼합해서 사용하는 방법
```
ArrayList al = new ArrayList(100000);
for (int i=0;i<100000;i++)
	al.add(i+“”);
LinkedList ll = new LinkedList(al);
for(int i=0;i<1000;i++)
	ll.add(500, “X”);
```


* Enumeration Iterator, ListIterator
	* Iterator
: 컬렉션에 저장된 각 요소에 접근하는 기능을 가진 인터페이스
```
List list = new ArrayList();
Iterator it = list.iterator();
while(it.hasNext()) {
	System.out.println(it.next());
}
```
-> Iterator를 이용해서 컬렉션의 요소를 읽어오는 방법을 표준화했기 때문에 코드의 재사용성을 높이는 것이 가능
```
Map map = new HashMap();
. . .
Iterator it = map.keySet().iterator();

Set eSet = map.entrySet();
Iterator list = eSet.iterator();
//= Iterator list = map.entrySet().iterator();
```
-> Map인터페이스는 Key와 Value를 쌍으로 저장하고 있기 때문에 iterator()를 직접 호출할 수 없고, 그 대신 keySet()이나 entrySet()과 같은 메서드를 통해서 키와 값을 각각 따로 Set의 형태로 얻어 온 후에 다시 iterator()를 호출해야 Iterator를 얻을 수 있다.

* Enumeration, ListIterator
	● Enumeration : Iterator의 구 버전, Enumeration 대신 Iterator를 사용하자.
	● ListIterator : Iterator를 상속받아서 기능을 추가한 것으로, Iterator는 단방향으로만 이동할 수 있는 데 반해 ListIterator는 양방향으로의 이동이 가능하다.


* HashSet
: Set인터페이스를 구현한 가장 대표적인 컬렉션, Set인터페이스의 특징대로 HashSet은 중복된 요소를 저장하지 않는다 => 중복된 요소들을 쉽게 제거 가능
-> HashSet은 저장순서를 유지하지 않으므로 저장순서를 유지하고자 한다면 LinkedHashSet을 사용해야한다.


* TreeSet
: 이진검색트리(binary search tree)라는 자료구조의 형태로 데이터를 저장하는 컬렉션 클래스. TreeSet은 이진검색 트리의 성능을 향상시킨 ‘레드-블랙 트리(Red-Black tree)로 구현되어 있다. 
-> Set인터페이스를 구현했으므로 중복된 데이터의 저장을 허용하지 않으며 정렬된 위치에 저장하므로 저장순서를 유지하지도 않는다.

```
class TreeNode {
	TreeNode left; //왼쪽 자식노드
	Object element; //객체를 저장하기 위한 참조변수
	TreeNode right; //오른쪽 자식노드
}
```

● 이진검색트리(binary search tree)

① 모든 노드는 최대 두 개의 자식노드를 가질 수 있다.

② 왼쪽 자식노드의 값은 부모노드의 값보다 작고 오른쪽 자식 노드의 값은 부모노드의 값보다 커야한다.

③ 노드의 추가 삭제에 시간이 걸린다 (순차적 저장 X)

④ 검색과 정렬에 유리


* Comparator, Comparable: 객체들을 정렬 또는 이진검색트리를 구성하는데 필요한 메서드를 정의하고 있는 인터페이스.
	● Comparable : 기본 정렬기준을 구현하는데 사용 ⊂ java.lang패키치
	-> 같은 타입의 인스턴스끼리 서로 비교할 수 있는 클래스들. (Integer와 같은 wrapper클래스, String, Date, File 등 정렬되도록 구현)
	-> Comparable을 구현하지 않은 클래스의 인스턴스를 TreeSet에 담는다면 정렬기준이 없기 때문에 당연히 알아서 정렬되지 않고 실행 시 에러가 발생한다.
	● Comparator : 기본 정렬기준 외에 다른 기준을 정렬하고자할 때 사용 ⊂ java.util패키지
	-> Comparable은 기본적으로 오름차순으로 정렬되어 있지만, 다른 기준에 의해서 정렬되도록 하고 싶을 때 Comparator를 구현해서 정렬기준을 제공할 수 있다.
```
public interface Comparator {
	int compare(Obejct o1, Object o2);
	boolean equals(Object obj);
}
public interface Comparable {
	public int compareTo(Object o);
}
```

* Hashtable, HashMap
: Hashtable과 HashMap의 관계는 Vector, ArrayList의 관계와 같음. -> HashMap 사용 권고
	● HashMap
	: Map의 특징(key와 value를 묶어서 하나의 데이터로 저장)을 갖고 해싱을 사용하기 때문에 많은 양의 데이터를 검색하는데 있어 뛰어난 성능을 보임.
	-> 키와 값을 각각 Object 타입으로 저장하기 때문에 어떠한 객체도 저장.
