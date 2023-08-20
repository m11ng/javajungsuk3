package ch05;

public class Array {
	
	public static void ex() {
		// 기본
		for(int i=1; i<=9; i++) {
				System.out.printf("%d %d%n", i, i);
		}
	}
	public static void ex1() {
		for(int i=0; i<=9; i++) {
			System.out.printf("%d %d%n", i+1, i);
		}
	}
	public static void ex2() {
		for(int i=1; i<=9; i++) {
			System.out.printf("%d %d%n", i, i*2);
		}
	}
	public static void ex3() {
		for(int i=0; i<=9; i++) {
			System.out.printf("%d %d%n", i+1, i*2);
		}
	}
	public static void ex4() { // 홀수출력 1 3 5 7 9 ...
//		for(int i=0; i<=9; i++) {
//			if(i==0) {
//				System.out.printf("%d %d%n", i+1, i+1);
//			}
//			else {
//				System.out.printf("%d %d%n", i, (i*2)+1);
//			}
//		}
		
		for(int i=1; i<=9; i++) {
			System.out.printf("%d %d%n", i, (i*2)-1);
		}
	}
	public static void ex5() {
		for(int i=1; i<10; i++) {
			System.out.printf("%d %d%n", i, i*i);
		}
	}
	public static void ex6() { // 9 8 7 6 5 4...
		for(int i=1; i<=9; i++) {
			System.out.printf("%d %d%n", i, (10)-i);
		}
	}
	public static void ex7() {
		for(int i=1; i<=9; i++) {
			System.out.printf("%d %d%n", i, (i+2)/3);
		}
	}
	public static void ex8() {
		for(int i=1; i<=9; i++) {
			if(i%3==0) {
				System.out.printf("%d %d%n", i, (i%3)+3);
			}
			else {
				System.out.printf("%d %d%n", i, (i%3));
			}
		}
	}
	public static void exPractice() {
		for(int i=1; i<=9; i++) {
			System.out.printf("%d %d%n", i, (i*2)-1);
		}
	}
	public static void main(String[] args) {

		ex6();
	}

}
