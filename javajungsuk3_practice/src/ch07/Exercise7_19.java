package ch07;

public class Exercise7_19 {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Tv());
		b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		
		b.summary();
	}
}
class Buyer {
	int money = 1000;
	Product[] cart = new Product[3];
	int i=0;
	
	void buy(Product p) {
		/*
		 	1.1가진 돈과 물건의 가격을 비교해서 가진 돈이 적으면 메서드를 종료한다.
		 	1.2가진 돈이 충분하면, 제품의 가격을 가진 돈에서 뺴고
		 	1.3장바구니에 구입한물건을 담는다 (add메서드 호출)
		 	
		 */
		if(money<p.price) {
			System.out.println("잔액이 부족하여 "+ p + "를 살 수 없습니다.");
			return;
		}
		money-=p.price;
		add(p);
	}
	
	void add(Product p) {
		/*
		 	1.1 i의 값이 장바구니의 크기보다 같거나 크면
		 	1.1.1 기존의 장바구니보다 2배 큰 새로운 배열을 생성한다.
		 	1.1.2 기존의 장바구니의 내용을 새로운 배열에 복사한다.
		 	
		 	1.1.3 새로운 장바구니와 기존의 장바구니를 바꾼다.
		 	
		 	1.2 물건을 장바구니(cart)에 저장한다. 그리고 i의 값을  1증가 시킨다.
		 */
		if(i>=cart.length) {
			Product[] cart2 = new Product[cart.length*2];
			for(int i=0; i<cart.length; i++) {
				cart2[i] = cart[i];
			}
			cart = cart2;
		}
		cart[i++] = p;
	}
	
	void summary() {
		// 1.1 장바구니에 담긴 물건들의 목록을 만들어 출력한다.
		
		// 1.2. 장바구니에 담긴 물건들의 가격을 모두 더해서 출력한다.
		
		// 물건을 사고 남은 금액(money)를 출력한다.
		String list = "";
		int cost = 0;
		for(int i=0; i<cart.length; i++) {
			if(cart[i]==null) {
				return;
			}
			list += cart[i]+", ";
			cost += cart[i].price;
		}
		System.out.println("구입한 물건 "+ list);
		System.out.println("사용한 금액 " +cost);
		System.out.println("현재 잔액은 "+ money+" 입니다.");
		
	}
	
}
class Product {
	int price;
	
	Product(int price) {
		this.price = price;
	}
}

class Tv extends Product {
	Tv() {super(100);}
	
	public String toString() {return "Tv";}
}

class Computer extends Product {
	Computer() {super(200);}
	public String toString( ) {return "Computer";}
}

class Audio extends Product {
	Audio() {super(50);}
	public String toString() {return "Audio";}
}





















