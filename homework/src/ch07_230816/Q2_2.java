package ch07_230816;

public class Q2_2 {
//Q2. 5x5 ũ���� 2���� �迭�� �޾Ƽ� ������ ������ ��� ��ȯ�ϴ� �޼��� bingoCount()�� �ۼ��ϰ� �׽�Ʈ �Ͻÿ�
//		int bingoCount(int[][] arr) {
//			int bingoCnt = 0;
//			return bingoCnt;
//		}
	static int bingoCount(int[][] arr) {
		int cross1 = 0; // \
		int cross2 = 0; // /
		int garo = 0;
		int sero = 0;
		int bingoCnt= 0;

		// ����
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				garo+= arr[i][j];
				if(garo==5) {
					bingoCnt++;
				}
			}
		}

		// ����
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				sero+= arr[j][i]; 
				if(sero==255) {
					bingoCnt+=5;
				}
			}
		}

		// �밢��1 \
		int sum1=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i][i]==1) {
				sum1+=arr[i][i];
			}
			if(sum1==5) {
				cross1++;
			}
			
		}
		// �밢��2 \
		int sum2=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i][4-i]==1) {
				sum2+=arr[i][4-i];
			}
			if(sum2==5) {
				cross2++;
			}
		}
		
		System.out.println("����: "+garo);
		System.out.println("����: "+sero);
		System.out.println("�밢�� \\: "+cross1);
		System.out.println("�밢��/: "+cross2);
		System.out.println("�� ����: " + bingoCnt);
		
	
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
		System.out.println(bingoCount(arr));

	}

}
