package ch07_230816;

public class Q2_1 {
//Q2. 5x5 크기의 2차원 배열을 받아서 빙고의 갯수를 세어서 반환하는 메서드 bingoCount()를 작성하고 테스트 하시오
//		int bingoCount(int[][] arr) {
//			int bingoCnt = 0;
//			return bingoCnt;
//		}
	static int bingoCount(int[][] arr) {
		int cross1 = 0; // \
		int cross2 = 0; // /
		int garo = 0;
		int sero = 0;
		int bingoCnt= garo+sero+cross1+cross2;

		// 가로
		for(int i=0; i<arr.length; i++) {
			int sum=0;
			for(int j=0; j<arr[i].length; j++) {
				sum+= arr[i][j];
				if(sum==5) {
					garo++;
				}
			}
		}

		// 세로
		for(int i=0; i<arr.length; i++) {
			int sum=0;
			for(int j=0; j<arr[i].length; j++) {
				sum+= arr[j][i]; 
				if(sum==5) {
					sero++;
				}
			}
		}

		// 대각선1 \
		int sum1=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i][i]==1) {
				sum1+=arr[i][i];
			}
			if(sum1==5) {
				cross1++;
			}
			
		}
		// 대각선2 \
		int sum2=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i][4-i]==1) {
				sum2+=arr[i][4-i];
			}
			if(sum2==5) {
				cross2++;
			}
		}
		
		System.out.println("가로: "+garo);
		System.out.println("세로: "+sero);
		System.out.println("대각선 \\: "+cross1);
		System.out.println("대각선/: "+cross2);
		// ????????
		bingoCnt = garo+sero+cross1+cross2;
		
	
		return bingoCnt;
	}

	public static void main(String[] args) {
		//Q2
		int[][] arr = {
				{1,1,1,1,1},
				{1,1,1,1,1},
				{1,1,1,1,1},
				{1,1,1,1,1},
				{1,1,1,1,1}

				};
		System.out.println("총 빙고: "+bingoCount(arr));

	}

}
