package Chapter7;

class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	
	SutdaDeck() {
		for(int i=0;i<cards.length;i++) {
			int num = i%10+1;
			boolean isKwang = (i<10) && (num==1||num==3||num==8);
			
			cards[i] = new SutdaCard(num,isKwang);
		}
	}
	
	//7-2
	void shuffle( ) {
		for(int i=0;i<cards.length;i++) {
			int j = (int)(Math.random()*cards.length);
			SutdaCard tmp = cards[i];
			cards[i] = cards[j];
			cards[j] = tmp;
		}
	}
	
	SutdaCard pick(int index) {
		if(index < 0 || index >= CARD_NUM) //index의 유효성 검사
			return null;
		return cards[index]; //배열 cards에 지정된 위치의 SutdaCard 반환
	}
	
	SutdaCard pick() { //배열 cards에서 임의의 위치의 SutdaCard를 반환한다.
		int index = (int)Math.random()*cards.length;
		return pick(index);
	}
}

class SutdaCard {
	int num;
	boolean isKwang;
	
	SutdaCard() {
		this(1, true);
	}
	
	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	
	//info() 대신 Object클래스의 toString()을 오버라이딩했다.
	public String toString() {
		return num + ( isKwang ? "K" : "");
	}
}

public class Exercise7_1 {
	public static void main(String args[]) {
		SutdaDeck deck = new SutdaDeck();
		
		//7-1
		for(int i=0;i<deck.cards.length;i++)
			System.out.print(deck.cards[i]+",");
		System.out.println();
		
		//7-2
		System.out.println(deck.pick(0));
		System.out.println(deck.pick());
		deck.shuffle();
		
		for(int l=0;l<deck.cards.length;l++) {
			System.out.print(deck.cards[l]+",");
		}
		
		System.out.println();
		System.out.println(deck.pick(0));
	}
}
