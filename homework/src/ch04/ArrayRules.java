package ch04;

public class ArrayRules {
	
	public static void ex01() {
		for(int i=1; i<=9; i++) {
			System.out.printf("%d, %d%n", i, (2*i)+1);
		}
	}
	
	public static void ex02() {
		for(int i=1; i<=9; i++) {
			System.out.printf("%d, %d%n", i, (i*i));
		}
	}
	
	public static void ex03() {
		for(int i=1; i<=9; i++) {
			System.out.printf("%d, %d%n", i, (i+2)/3);
		}
	}
	
	public static void ex04() {
		for(int i=1; i<=9; i++) {
				System.out.printf("%d, %d%n", i, (i%3));
		}
	}
	
	public static void ex05() {
		for(int i=1; i<=9; i++) {
			if(i%3 == 0) {
				System.out.printf("%d, %d%n", i, 3);
				
			}
			else {
				System.out.printf("%d, %d%n", i, (i%3));
			}
				
		}
		
	}


	public static void main(String[] args) {
		ex01();
	}

}
