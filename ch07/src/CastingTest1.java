class CastingTest1 {
	public static void main(String args[]) {
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;

		fe.water();
		car = fe;    // car =(Car)fe;에서 형변환이 생략된 형태다.
//		car.water(); // 안됨. 조상의 리모컨에는 없음.
		fe2 = (FireEngine)car; // 자손타입 ← 조상타입
		fe2.water(); // 조상의 참조변수를 다시 형변환 해서 사용 가능
	}
}

class Car {
	String color;
	int door;

	void drive() { 		// 운전하는 기능
		System.out.println("drive, Brrrr~");
	}

	void stop() {		// 멈추는 기능	
		System.out.println("stop!!!");	
	}
}

class FireEngine extends Car {	// 소방차
	void water() {		// 물을 뿌리는 기능
		System.out.println("water!!!");
	}
}
