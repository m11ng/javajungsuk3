package ch07_230816;

public class Q123 {
	// Q1. 세 개의 정수 x,y,z를 받아서 중간 크기의 값을 반환하는 mid라는 메서드 작성하시오. 
	static int mid2(int x, int y, int z) {
		// 정렬 쓰지 말고 해보기 !
		if(x>y) {
			if(z>x) {
				return x;
			}
			else if(y>z) {
				return y;
			}
			else {
				return z;
			}
		}
		else { // x<=y
				if(z<x) {
					return x;
				}
				else if(y<z) {
					return y;
				}
				else { return z; }
		}
	}
	static int mid(int x, int y, int z) {
		int[] tmp = {x, y, z};
		for(int i=0; i<tmp.length-1; i++) {
			for(int j=0; j<tmp.length-1-i; j++) { // -i : 버블 정렬
				if(tmp[i]>tmp[i+1]) {
					int tt = tmp[i];
					tmp[i] = tmp[i+1];
					tmp[i+1] = tt;
				}
			}
		}
//		System.out.println(Arrays.toString(tmp));
		return tmp[1];
	}
	//Q2. 5x5 크기의 2차원 배열을 받아서 빙고의 갯수를 세어서 반환하는 메서드 bingoCount()를 작성하고 테스트 하시오
	// 일단 2차원 배열 하나 만들고
	// 가로 세로 대각선 빙고 개수 세고 다 더하는 코드를 써보자.
	// 가로 세로 대각선을 for문 안에 조건식 3개로 쪼개 넣어서 변수에 담나..
//	int bingoCount(int[][] arr) {
//		int bingoCnt = 0;
//		return bingoCnt;
//	}
	static int bingoCount(int[][] arr) {
		int bingoCnt=0;
		
		int cross1 = 0; // \
		int cross2 = 0; // /
		int garo = 0;
		int sero = 0;

		// 가로
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				if(arr[i][j]==1) {
//					if()
					cross1++; // i와 j의 규칙을 찾아서. 뭐하면 여기에 뭘 넣는지를.
				}
			}
			System.out.println();
		}
		System.out.println(cross1);

		// 세로
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
	
			}
			System.out.println();
		}

		
		// 대각선
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				if(i==j) { cross1++; }
				else if(i+j==4) {cross2++;}
//				else if(bing[i])
			}
			System.out.println();
		}
		System.out.println(cross1);
		System.out.println(cross2);
	
		return bingoCnt;
		
	}
	//Q3 5장의 카드를 배열로 받아서 등급을 문자열로 반환하는 rank check 메서드를 작성하시오
	// 등급 예시
	// 1. "NO RANK"
	// 2. "1 PAIR" 같은 숫자 한쌍
	// 3. "2 PAIR" 같은 숫자 두쌍
	// 4. " THREE CARD" 같은 카드 3장
	// 5. "STRAIGTH" 연속 숫자 5장(2,3,4,5,,6)
	// 6. "FLUSH
	static void rankCheck() {
		
	}
	public static void main(String[] args) {
		//mid2
		System.out.println(mid2(5, 1, 4));
		
		//mid
		System.out.println(mid(2, 1, 4));
		
		//Q2
		int[][] arr = {
				{1,1,1,1,1},
				{1,1,1,1,1},
				{1,1,1,1,1},
				{1,1,1,1,1},
				{1,1,1,1,1}

				};
		System.out.println(bingoCount(arr));
	
	}

}
