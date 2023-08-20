package ch05;

public class Array2 {
	//Q1 두 배열 arr, arr2가 같은지 확인해서 같으면 "같습니다", 다르면 "다릅니다" 를 출력하시오
	// 같다는건 뭐지 ? = 모든 요소의 값이 같은 거.
	public static void ex1_1(){
		int[] arr = {1,2,1};
		int[] arr2 = {1,3,1};
		boolean eq =true;
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i] != arr2[i]) {
				eq=false; 
				break; //가장 가까운 반복문의 브레이크
			}
		}
		
		if(eq==true){
			System.out.println("같습니다");
		}
		else {
			System.out.println("다릅니다.");
		}
	}
	
	public static void ex1_2(){
		int[] arr = {1,2,3};
		int[] arr2 = {4,2,3};
	
		int cnt = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==arr2[i]) cnt++;
		}
		if(cnt==3) {
			System.out.println("같습니다");
		}
		else {
			System.out.println("다릅니다");
		}
		
	}
	
	public static void ex1_3(){
		int[] arr = {1,2,3};
		int[] arr2 = {4,1,2};
	
		int s = 0;
		int b = 0;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr2.length; j++) {
				if(arr[i]==arr2[j]) { // 위치와 값을 비교할 때
					if(i==j) s++; // 위치도 같고 값이 같으면 s
					else b++; // 위치는 다른데 값이 같으면 b
				}
			}
		}
		System.out.println(s + "s" + b + "b");
	}
	
	//Q2 두 배열의 값을 비교해서 같은 값의 개수(b)를 출력하시오
	// 단 값의 위치도(인덱스) 같으면 그 개수를 출력하시오
	public static void ex2(){
		int[] arr = {1,2,3};
		int[] arr2 = {3,2,1}; // 321 1s2b 412 2b
		
		int strike = 0; // 값과 위치가 일치하는 경우 // 값: arr[i] => 위치 : arr[i]의 i
		int ball = 0; // 값이 같고 위치가 다른경우
		
		// 값이 일치하는 경우
		// arr[i] == arr2[j]
		// 위치가 일치하는 경우
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr2.length; j++) {//행
				if(arr[i]==arr2[j]) { //열 // 값
					if(i==j) {
						strike++;
					}
					else {
						ball++;
					}
				}
			}
		}
		System.out.println(strike + "S" + ball + "B");
		
	}
	//Q3 배열 arr이 이와 같을 때 
	//1.중복제거 => 1,2,3,4,5,7 // 2.정렬 => 1 1 2 2 2 3 3 4 4 5 의 결과를 출력하시오
	//배열 1개와 for문 1개만 사용해서 하기.
	public static void ex3(){
		int[] arr = {4,2,2,4,1,7,3,2,5,1,3}; // 11
		
		// 빈 배열 하나 만들어야 해.
		int[] cnt = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			cnt[arr[i]]++;
		}

		for(int i=0; i<cnt.length; i++) {
			System.out.printf("cnt[%d]=%d%n", i, cnt[i]);
		}
			
//			if(arr[i]==counter[i]) {
//				System.out.println();
//			}
//			else {
//				
//			}
		/*
		int[] numArr = new int[10];
		int[] counter = new int[10];
		
		for(int i=0; i < numArr.length; i++) {
			numArr[i] = (int)(Math.random() * 10);
			System.out.print(numArr[i]);
		}
		System.out.println();
		
		for(int i=0; i < numArr.length; i++) {
			counter[numArr[i]]++; // 0, 1 , 2 .....
		}
 		
		for(int i=0; i < numArr.length; i++) {
			System.out.println(i + "의 개수" + counter[i]);
		}
		*/
	}

	public static void main(String[] args) {
		ex3();
	}

}
