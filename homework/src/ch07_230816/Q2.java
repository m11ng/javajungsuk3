package ch07_230816;

public class Q2 {
//Q2. 5x5 ũ���� 2���� �迭�� �޾Ƽ� ������ ������ ��� ��ȯ�ϴ� �޼��� bingoCount()�� �ۼ��ϰ� �׽�Ʈ �Ͻÿ�
//		int bingoCount(int[][] arr) {
//			int bingoCnt = 0;
//			return bingoCnt;
//		}
	static int bingoCount(int[][] arr) {
		int bingoCnt=0;

		int cross1 = 0; // \
		int cross2 = 0; // /
		int garo = 0;
		int sero = 0;

		// ����
		for(int i=0; i<arr.length; i++) {
			int sum=0;
			for(int j=0; j<arr[i].length; j++) {
				sum+=arr[i][j];
				if(sum==5) {
					garo++;
				}
			}
		}

		// ����
		for(int i=0; i<arr.length; i++) {
			int sum = 0;
			for(int j=0; j<arr[i].length; j++) {
				sum += arr[j][i]; 
				if(sum==5) {
					sero++;
				}
			}
		}

		// �밢��1
		for(int i=0; i<arr.length; i++) {
			int sum = 0;
			for(int j=0; j<arr[i].length; j++) {
				if(i==j && arr[i][j]==1) { 
						cross1++;
				}
			}
		}
		// �밢��\
//		for(int i=0; i<arr.length; i++) {
//			int sum = 0;
//			for(int j=0; j<arr[i].length; j++) {
//				if(i==j) { 
//					sum +=arr[i][j]; 
//					if(sum==5) {
//						cross1++;
//					}
//				}
//			}
//		}
		
		System.out.println("����: "+garo);
		System.out.println("����: "+sero);
		System.out.println("�밢��'\\: "+cross1);
		System.out.println("�밢��/: "+cross2);
		System.out.println("�� ����: " + bingoCnt);
		
	
		return bingoCnt;
	}

	public static void main(String[] args) {
		// Q2
		int[][] arr = { { 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1 }

		};
		System.out.println(bingoCount(arr));

	}

}
