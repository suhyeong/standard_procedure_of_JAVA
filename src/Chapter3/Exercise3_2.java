package Chapter3;

//사과를 담는데 필요한 바구니의 수를 구하는 코드이다.
//만일 사과의 수가 123개이고 하나의 바구니에는 10개의 사과를 담을 수 있다면,
//13개의 바구니가 필요할 것이다.

public class Exercise3_2 {
	public static void main(String[] args) {
		int numOfApples = 123; //사과 개수
		int sizeOfBucket = 10; //바구니의 킉
		int numOfBucket = numOfApples/sizeOfBucket + (numOfApples%sizeOfBucket > 0 ? 1 : 0);//모든 사과를 담는데 필요한 바구니의 수
				
		System.out.println("필요한 바구니의 수 : " + numOfBucket);
	}
}
