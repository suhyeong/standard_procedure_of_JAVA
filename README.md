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
