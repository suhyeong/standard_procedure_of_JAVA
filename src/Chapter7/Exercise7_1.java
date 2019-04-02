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
		if(index < 0 || index >= CARD_NUM) //index�� ��ȿ�� �˻�
			return null;
		return cards[index]; //�迭 cards�� ������ ��ġ�� SutdaCard ��ȯ
	}
	
	SutdaCard pick() { //�迭 cards���� ������ ��ġ�� SutdaCard�� ��ȯ�Ѵ�.
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
	
	//info() ��� ObjectŬ������ toString()�� �������̵��ߴ�.
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
