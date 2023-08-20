package ch06;
// 다음 코드의 실행 결과를 예측하여 적으시오.
public class Exercise6_19 {

	public static void change(String str) {
		str += "456";
		
	}
	public static void main(String[] args) {
		
		String str = "ABC123";
		System.out.println(str); // 메인에 str : ABC123
		change(str); // 호출만 함.
		System.out.println("After change:" + str); // 다시 메인에 str: ABC123 

		// => change메서드의 str은 지역변수이기 때문에 !!!! 이름만 같을 뿐 다른 저장 공간.
	}

}
