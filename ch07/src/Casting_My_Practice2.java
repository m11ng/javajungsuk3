class Car222 {
	int door = 2;
	String color = "yellow";
}

class Fire22 extends Car222 {
	
	void water() {
		System.out.println("불끄자");
	}
}
public class Casting_My_Practice2 {
	public static void main(String[] args) {

		Car222 cc = new Car222();
		Fire22 ff = null;
		
		ff = (Fire22)cc; 
		// 형변환 오류
		// 왜? 참조변수가 다룰수있는 멤버의 개수가 더 많은데 인스턴스는 적어서.
		
		ff.water();
		System.out.println(cc);
		System.out.println(ff);
	}

}
