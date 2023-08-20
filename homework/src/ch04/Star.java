package ch04;

//문제풀이 전략
//1. 문제를 나눈다.
//2. 문제를 쉽게 만든다.

public class Star {
	
	// i와 j의 위치, 증가값 알기
	public static void ex0() {
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if(true) {
					System.out.print("[" + i + "," + j + "]"); // [i,j]
				}
			}
			System.out.println();
		}
	}

	
	public static void ex1() { // 별찍기 1
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//  System.out.println("*****"); 이 코드도 반복이 들어있으니까 코드 줄여보기.
	}
	
	public static void ex2() { // 슬래시 모양 //  별찍기 2
		
		// 첫번째 줄에 1번째, 두번째 줄에 2번째, 3번째 줄에 3번째를 출력되게 하면 된다. => 규칙을 찾기.
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if(i==j) { 
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void ex3() { // 나누기모양 // 별찍기 3
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if(i+j==6) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void ex4() { // 엑스모양 // 별찍기 4  // 2번 문제와 3번 문제를 합친 것 ( 합집합 : ||, 교집합 : && )
	
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if(i+j==6 || i==j) { 
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
			
		}
	// 처음에 합집합을 쓰지 않고, else if를 사용했는데, 합집합을 사용하니 코드가 더 간결해졌음	
	}
	
	
	public static void ex5() { // 별찍기 5

		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if(i>=j) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	
	
	public static void ex6() {
		
		for(int i=1; i<=5; i++) { 
			for(int j=1; j<=5; j++) {
				if(i+j>=6) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}
	
	public static void ex6_1() { // 별찍기 5

		
		for(int i=1; i<=5; i++) { 
			for(int j=1; j<=5; j++) {
				if(i<=j) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}
	
	public static void ex7() {  // 시작점이 5부터 1씩 증가
			
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i+4; j++) { // 왜 i+4일까? 를 좀더 생각해보기. 총 j의 길이가 9. 9-i=4
				if(true) { 
					System.out.print("*");
				}
			}
			System.out.println();
		}
	
		
		
	}
		
	public static void ex8() { // 피라미드
	
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i+4; j++) {
				if(i+j>=6) {
						System.out.print("*");
					}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}
	
	public static void ex9() { // 나비모양 코드1

		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if((i>=j || i+j>=6) && (i<=j || i+j<=6)) {//10번에 !을 붙이고, = 기호 빼면 똑같은 값이 나왔음. (i>=j && i+j>=6) || (i<=j && i+j<=6)
						System.out.print("*");
					}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void ex9_1() { // 모레시계모양 코드2

		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if(!((i>j || i+j>6) && (i<j || i+j<6))) {
						System.out.print("*");
					}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void ex10() { // 모래시계모양
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if((i>=j && i+j>=6) || (i<=j && i+j<=6)) {
						System.out.print("*");
					}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}
	
	public static void ex11() { // 마름모 모양 

		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if( (i==3||j==3)||(i==j)||(i+j==6) ) {
						System.out.print("*");
					}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void ex12() { // 마름모 반쪽
		       
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=3; j++) {
				if((i>=j || i+j>=6) && (i<=j || i+j<=6)) {
						System.out.print("*");
					}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		
	}
	
	public static void main(String[] args) {
		ex2();
	}

}
