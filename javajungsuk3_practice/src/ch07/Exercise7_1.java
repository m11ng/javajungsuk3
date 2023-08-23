package ch07;

import java.util.Arrays;

class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	
	// �迭 ����ī�带 ������ �ʱ�ȭ�Ͻÿ�
	// �ڵ��� �ߺ��� �ٿ��� �ٽ� �غ���.
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
	// �迭 cards�� ��� ī���� ��ġ�� �ڼ��´�.(Math.random()���)
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
	
	//info��� ObjectŬ������ toString()�� �������̵� ����
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

