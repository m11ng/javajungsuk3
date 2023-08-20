class Car22 {
	int door = 2;
	String color = "yellow";
}

class Fire extends Car22 {
	
	void water() {
		System.out.println("불끄자");
	}
}
public class Casting_My_Practice {
	public static void main(String[] args) {

		Car22 cc = new Fire();
		Fire ff = new Fire();
		
		ff = (Fire)cc; 
		// .. 형변환에 오류가 있어야 되는거 아닌가?
		// 참조변수가 다룰수있는 멤버의 개수가 더 많으니까.
		
		ff.water();
		System.out.println(cc);
		System.out.println(ff);
	}

}
