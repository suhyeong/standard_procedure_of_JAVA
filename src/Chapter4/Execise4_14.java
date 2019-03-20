package Chapter4;

import java.util.*;

public class Execise4_14 {
	//숫자맞추기 게임
	public static void main(String args[]) {
		//1~100 사이의 임의의 값을 얻어 answer에 저장
		int answer = (int)(Math.random()*100)+1;
		int input = 0; //사용자 입력을 저장할 공간
		int count = 0; //시도 횟수
		
		Scanner s = new Scanner(System.in);
		
		do {
			count++;
			System.out.print("1과 100 사이의 값을 입력하세요 : ");
			input = s.nextInt(); //입력받은 값을 변수 input에 넣음
			
			if(answer > input)
				System.out.println("더 큰 수를 입력하세요.");
			else if(answer == input) {
				System.out.println("맞췄습니다.");
				System.out.println("시도횟수는 "+count+"번입니다.");
				break;
			}
			else if(answer < input)
				System.out.println("더 작은 수를 입력하세요.");
		} while(true); //무한 반복문
	}
}
