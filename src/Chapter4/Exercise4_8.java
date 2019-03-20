package Chapter4;

public class Exercise4_8 {
	//방정식 2x+4y=10의 모든 해를 구하시오
	//0<=x<=10, 0<=y<=10
	public static void main(String args[]) {
		int x, y;
		for(x=0;x<=10;x++) {
			for(y=0;y<=10;y++) {
				if((2*x+4*y) == 10)
					System.out.println("x="+x+", y="+y);
			}
		}
	}
}
