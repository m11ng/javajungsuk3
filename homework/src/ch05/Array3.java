package ch05;

import java.util.Arrays;

public class Array3 {

	// 1차원 배열의 arr 값들을 2차원 배열의 4행 3열 arr2에 복사하여 출력하시오
	
	
	public static void main(String[] args) {
		int[] arr = new int[12];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
		}
		System.out.println(Arrays.toString(arr));
		// ---------------------------------------------------
		
		// arr[i/3][i%3]
		// 복사는 어떻게 하는거지 ?
		int[][] arr2 = new int[4][3];
	
		for(int i=0; i<arr2.length; i++) { // 행4
			for(int j=0; j<arr2[i].length; j++) { //열3
//				if(arr2[i]) {
					
					arr2[i][j] = arr[arr[i]++];
//				}
				System.out.print(arr2[i][j] + "");
				
			}
			System.out.println();
		}
	
	
	
	
	

	}
}
