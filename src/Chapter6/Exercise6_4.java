package Chapter6;

public class Exercise6_4 {
	public static void main(String args[]) {
		Student1 s = new Student1();
		s.name = "ȫ�浿";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		
		System.out.println("�̸�:"+s.name);
		System.out.println("����:"+s.getTotal());
		System.out.println("���:"+s.getAverage());
	}
}


class Student1 {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
  
  int getTotal() {
	  return kor + eng + math;
	  }
  
  float getAverage() {
	  return (int)(getTotal()/3f * 10 + 0.5f) / 10f;
	  }
}
 