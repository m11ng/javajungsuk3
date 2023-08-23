package ch07;

import java.util.Arrays;

class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	
	// 배열 섯다카드를 적절히 초기화하시오
	// 코드의 중복을 줄여서 다시 해보기.
	SutdaDeck() {
		int i=0;
		for(int n=0; n<cards.length; n++) {
			if((n+1)%10==0) {
				cards[i++] = new SutdaCard(10, false);
			}
			else if(n==0|| n==2 || n==7) {
				cards[i++] = new SutdaCard((n+1)%10, true);
			}
			else {
				cards[i++] = new SutdaCard((n+1)%10, false);
			}
	
		}
	}
	// 배열 cards에 담긴 카드의 위치를 뒤섞는다.(Math.random()사용)
	void shuffle() {
		for(int i=0; i<cards.length; i++) {
			int n = (int)(Math.random()*20)+1;
			SutdaCard tmp = cards[i];
			cards[i] = cards[n];
			cards[n] = tmp;
		}
	}
	SutdaCard pick(int index) {
		return cards[index];
	}
	SutdaCard pick() {
		int index = (int)(Math.random()*20+1);
		return pick(index);
	}
	
	
	
	
	
}

class SutdaCard {
	int num;
	boolean iskwang;
	
	SutdaCard() {
		this(1, true);
	}
	
	SutdaCard(int num, boolean iskwang){
		this.num = num;
		this.iskwang = iskwang;
	}
	
	//info대신 Object클래스의 toString()을 오버라이딩 헀다
	public String toString() {
		return num+(iskwang ? "K":"");
	}
}

class Exercise7_1 {
	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();

		for(int i=0; i<deck.cards.length;i++) {
			System.out.println(deck.cards[i]+",");
		}
		
	}
}

