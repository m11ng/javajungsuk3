package ch06;

class ch6_2 {

	public static void main(String args[]) {
		SutdaCard card1 = new SutdaCard(3, false);
		SutdaCard card2 = new SutdaCard();
		System.out.println(card1.info());
		System.out.println(card2.info());
	}
}

class SutdaCard {

	int num;
	boolean iskwang;

	SutdaCard(int num, boolean iskwang) {
		this.num = num;
		this.iskwang = iskwang;
		
	}

	SutdaCard() {
		this(1, true);
	}

	String info() {
//		if (num <= 0 || num > 10)
//			return;
		if(iskwang==true) {
			return num+"K";
			
		}
		else {
			return num + "";
		}
	}

}
