package ch04;

import java.util.Arrays;


// 문제풀이 전략
// 1. 문제를 나눈다.
// 2. 문제를 쉽게 만든다.


public class Bingo1 {
	// 길이가 1~25가 뒤섞여 저장된 랜덤 2차원 배열 빙고를 출력하시오.
	// 문제를 쪼갤 때로 쪼개 보기!!!! 
	// 쪼개서 푼 코드에 문제가 있는지 없는지를 확인하는 과정을 길들이기
	
	public static void main(String[] args) {

		// 1. 1차원 배열 생성
		int[] arr = new int[25];
		
		// 2. 1차원 배열 초기화
		for(int i=0; i<arr.length; i++) { // 0~24
			arr[i] = i+1; // 1~25
		}
		System.out.println(Arrays.toString(arr)); // 위 코드 내가 모르는 거니까. 다시 복습하기

		// 3. 1차원 배열 섞기
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)((Math.random()*25)+1); // 더하기 1 해야되는거 아닌가?
		}
		// 4. 2차원 배열 생성
		int[][] bingo = new int[5][5];
		
		
		// 5. 1차원 배열 -> 2차원 배열 채우기
		for(int i=0; i<bingo.length; i++) {
			for(int j=0; j<bingo[i].length; j++) {
				
			}
			arr[i] = i+1;
		}
		
		
		
		int tmp = 0;
		for(int j=0; j<arr.length; j++) {
			System.out.println(arr[j]);
			
		}
		
		
		
		// 2차원 배열 (5x5)생성해서 1차원 배열의 내용으로 채운다.
		
		// 복습
		/*
		int x = 1;
		int y = 3;
		int tmp2 = 0;
		
		tmp = x;
		x = y;
		y = tmp2;
		System.out.println(x);
		System.out.println(y);
		*/

	}

}
