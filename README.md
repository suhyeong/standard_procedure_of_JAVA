# standard_procedure_of_JAVA
Practice of book 'JAVA의 정석(남궁성 저자)'
JAVA의 정석 책에 수록되어 있는 예제문제 혹은 연습문제 풀이입니다.





내용 정리
-

Chapter 6. 객체지향 프로그래밍 1  


**<클래스메서드(static메서드)와 인스턴스메서드>**

static이 붙어 있으면 클래스메서드, 붙어있지 않으면 인스턴스메서드

클래스메서드는 객체를 생성하지 않고도 클래스이름.메서드이름(매게변수)와 같은 식으로 호출이 가능하지만,
인스턴스 메서드는 반드시 객체를 생성해야만 호출할 수 있다.


인스턴스메서드 = 인스턴스 변수와 관련된 작업을 하는, 즉 메서드의 작업을 수행하는데 인스턴스 변수를 필요로 하는 메서드


1. 클래스를 설계할 때, 멤버변수 중 모든 인스턴스에 공통적으로 사용해야하는 것에 static을 붙인다.

: 모든 인스턴스에서 같은 값이 유지되어야 하는 변수는 static을 붙여서 클래스 변수로 정의해야한다

2. 클래스변수(static 변수)는 인스턴스를 생성하지 않아도 사용할 수 있다.

: static이 붙은 변수(클래스변수)는 클래스가 메모리에 올라갈 때 이미 자동적으로 생성되기 때문이다

3. 클래스메서드(static메서드)는 인스턴스변수를 사용할 수 없다.

: 인스턴스 변수는 인스턴스가 반드시 존재해야만 사용할 수 있는데, 클래스메서드는 인스턴스 생성 없이 호출 가능하므로 클래스메서드가 호출되었을 때 인스턴스가 존재할 수도 있고 존재하지 않을 수도 있다.

그래서 클래스메서드에서 인스턴스 변수의 사용을 금지한다.

그러나 인스턴스 변수나 인스턴스메서드에서는 static이 붙은 멤버들을 사용하는 것이

언제나 가능하다. 인스턴스변수가 존재한다는 것은 static이 붙은 변수가 이미 메모리에 존재한다는 것을 의미하기 때문이다.


4. 메서드 내에서 인스턴스 변수를 사용하지 않는다면, static을 붙이는 것을 고려한다.

: 메서드의 작업내용 중 인스턴스변수를 필요로 한다면, static을 붙일 수 없다.

반대로 인스턴스변수를 필요로 하지 않는다면 static을 붙이자 ! 메서드 호출시간이 짧아지기 때문에 효율이 높아진다.

static을 안붙인 메서드(인스턴스메서드)는 실행 시 호출되어야 할 메서드를 찾는 과정이 추가적으로 필요하기 때문에 시간이 더 걸린다.







**<메서드 오버로딩(method overloading)>**

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




**<생성자>**

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



**<상속>**

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




**<오버라이딩 (Overriding)>**

-> 자손 클래스에서 오버라이딩하는 메서드는 조상 클래스의 메서드와 이름, 매개변수, 리턴타입이 같아야한다. (메서드의 내용만을 새로 작성하는 것)

-> 접근 제어자는 조상 클래스의 메서드보다 좁은 범위로 변경할 수 없다. (접근 제어자의 접근범위 public > protected > default > private)

-> 조상 클래스의 메서드보다 많은 수의 예외를 선언할 수 없다.

-> 인스턴스메서드를 static메서드로 또는 그 반대로 변경할 수 없다.



***<오버로딩(new) vs 오버라이딩(change, modify)>***
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




**<제어자 (modifier)>**

: 클래스나 멤버변수와 메서드에서 주로 사용되며, 하나의 대상에 대해서 여러 제어자를 조합하여 사용하는 것이 가능하다.

-> 접근 제어자 : public, protected, default, private

-> 그         외 :  static, final, abstract, native, transient, synchronized, volatile, strictfp



(1) static - 클래스의, 공통적인

-> static이 붙은 멤버변수와 메서드, 그리고 초기화 블럭은 인스턴스가 아닌 클래스에 관계된 것이기 때문에 인스턴스를 생성하지 않고도 사용할 수 있다.

-> 사용될 수 있는 곳 : 멤버변수, 메서드, 초기화 블럭



(2) final - 마지막의, 변경될 수 없는

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


(3) abstract - 추상의, 미완성의

-> 메서드의 선언부만 작성하고 실제 수행내용은 구현하지 않은 추상메서드를 선언하는데 사용된다.

-> 사용될 수 있는 곳 : 클래스, 메서드

-> 추상메서드가 없는 클래스도 abstract를 붙여서 추상클래스로 선언하는 것이 가능하지만 그렇게 해야 할 이유는 없다.

```
abstract class AbstractTest { //추상클래스 (추상메서드를 포함한 클래스)
       abstract void move(); //추상메서드 (구현부가 없는 메서드)
}
```


(4) 접근 제어자 (access modifier)

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



(5) 제어자의 조합

-> 메서드에서 static과 abstract를 함께 사용할 수 없다.

: static 메서드는 몸통이 있는 메서드에만 사용될 수 있기 때문이다.

-> 클래스에 abstract와 final을 동시에 사용할 수 없다.

: 클래스에 사용되는  final은 클래스를 확장할 수 없다는 의미이고 abstract는 상속을 통해서 완성되어야 한다는 의미이므로 서로 모순되기 때문이다.

-> abstract 메서드의 접근 제어자가 private일 수 없다.

: abstract 메서드는 자손클래스에서 구현해주어야하는데 접근 제어자가 private이면 자손 클래스에서 접근할 수 없기 때문이다.

-> 메서드에 private과 final을 같이 사용할 필요는 없다.

: 접근 제어자가 private인 메서드는 오버라이딩될 수 없기 때문이다. 이 둘 중 하나만 사용해도 의미가 충분하다.




**<다형성 (polymorphism)>**

: 여러 가지 형태를 가질 수 있는 능력. (조상 클래스) 참조 변수= new (자손 클래스);
```
CaptionTv c = new CaptionTv();
Tv t = new CaptionTv();
```
-> 참조 변수 t로는 CaptionTv 인스턴스의 모든 멤버를 사용할 수 없다.

    Tv타입의 참조변수로는 CaptionTv인스턴스 중에서 Tv클래스의 멤버들(상속받은 멤버포함)만 사용할 수 있다.



(1) 참조변수의 형변환
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



**<추상클래스(abstract class)>**

-> 추상 클래스 사용시 상속을 통해 구현해주어야한다는 것을 abstract를 통해 알 수 있다.

-> 메서드를 사용하는 쪽에서는 메서드가 실제로 어떻게 구현되어있는지 몰라도 메서드의 이름과 매개변수, 리턴타입만 알고 있으면 되므로 코드를 작성하는 것이 가능하다.

-> 실제로는 자손 클래스에 구현된 완성된 메서드가 호출되도록 할 수 있다.

-> 추상클래스도 생성자가 있어야 한다.

-> abstract 리턴타입 메서드이름();




**<인터페이스 (interface)>**
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
