package chapter;

public class ch04 {
	public static void ch4_2() {
		int sum = 0;
		int[] arr = new int[20];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
			if(!(arr[i]%2==0||arr[i]%3==0)) {
				sum += arr[i];
			}
		}
		System.out.println(sum); // 73
		
	}
	// 1+2+3+4+5+....+10의 결과를 계산하시오
	public static void ch4_3_1() {
		int sum = 0;
		for(int i=1; i<=10; i++) {
			sum += i;
		}
		System.out.println(sum);
		// 주의 : 시작이 sum = sum + i; 이 되야지
		//            1     0   +  1
		// 누적 합계
	}
	//1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)의 결과를 계산하시오.
	public static void ch4_3() {
		int sum = 0; 
		int total = 0; // 이거 몰랐음... 원장님이 설명해준 그림 다시 그려보기.
		// int sum; 이 왜 안될까? 여기는 메소드 안이지? 지역변수 이기 때문에 필수로 초기화까지 해줘야 한다.
		for(int i=1; i<=10; i++) { // i가 1부터 시작되야 하는 걸 잊지말자
			sum += i;
			total += sum;
		}
		System.out.println(total);
		
	}
	// 1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이
	// 100이상이 되는지 구하시오.
	public static void ch4_4() {
		int sum = 0;
		int i = 1;
		for(;; i++) {
			if(i%2==1) {
				sum += i; // 1 
//				System.out.println(i);
			}
			else {
				sum = sum -i; // 1 3 5 7 
//				System.out.println(-i);
			}
			if(sum>=100) {
				break;
			}		
		}
//		System.out.println(sum);
		System.out.printf("%d \t %d%n", i, sum);
		
	}
	//1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이
	//100이상이 되는지 구하시오.
	public static void ch4_4_1() {
		int sum = 0, i = 1;
		
		for(;;i++) {
			if(i%2==0) {
				sum += -i;
			}
			else {
				sum += i;
			}
			
			if(sum>=100) {
				break;
			}
			System.out.printf("%d \t %d%n", i, sum);
		}
		
		
	}
	public static void ch4_5() {
		int i=0, j=0;
		while(i<=10) { // true
			while(j<=i) { 
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
			}
	}
	// 두개의 주사위를 던졌을 떄, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램을 작성하시오
	public static void ch4_6() {
		for(int i=1, j=5; i<=5; i++) {
			System.out.printf("%d + %d = %d%n", i, 6-i, i+(6-i));
		}
	}
	public static void ch4_5_1() {
		for(int i=0; i<=10; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	// 두 개의 
	public static void ch4_9() {
		String str = "12345";
		int sum = 0;
		for(int i=0; i < str.length(); i++) {
//			sum = charAt(str[i]);
		}
		System.out.println("sum="+sum);
	}
	public static void ch4_12() {
		for (int i=1; i<=3; i++) {
			for (int j=2;j<=9; j++) {
				if(i==i) {
					System.out.print(j + "*" + i + "=" + (j * i) + "\t");
				}
				System.out.print(j + "*" + i + "=" + (j * i) + "\t");
			}
			System.out.println();
		}
		System.out.println(1+2);
	}

	public static void main(String[] args) {
		ch4_12();
	}

}
