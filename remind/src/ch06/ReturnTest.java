package ch06;
class ReturnTest {
	public static void main(String[] args) {
		ReturnTest r = new ReturnTest();

		int result = r.add(3,5);
		System.out.println(result); // 8

		int[] result2 = {0,1}; // 배열을 생성하고 result2[0]의 값을 0으로 초기화
		r.add(3,5,result2);  // 배열을 add메서드의 매개변수로 전달
		System.out.println("반환타입이 있는 메소드의 값 :" + result2[0] + "," + result2[1]);

		r.add2(3,5,result2);  // 배열을 add메서드의 매개변수로 전달
		System.out.println("반환타입이 없는 메소드의 값 :" + result2[0] + "," + result2[1]);
	
	}//main

	int add(int a, int b) {
		return a + b;
	}
	
	void add2(int a, int b, int[] result) {
		for(int i=0; i<result.length; i++)
			result[i] =a+b;
	}
	// 위에 메소드를 반환값이 없는 메소드로 만들어 보기.
	
	void add(int a, int b, int[] result) {
		result[0] = a + b;  // 매개변수로 넘겨받은 배열에 연산결과를 저장
		result[1] = a + b;  // 매개변수로 넘겨받은 배열에 연산결과를 저장
	}
}
