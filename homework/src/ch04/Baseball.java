package ch04;

public class Baseball {
	public static void main(String[] args) {
		
		// 두 배열이 같다는 걸 식으로 .
		
		boolean same = false;
		
		int[] a = {1,2,3};
		int[] b = {1,6,3};
		
		// 두 배열이 같은건 어떻게 알지?
		// 값을 비교해야지. => 같은 위치에 있는 값이 같다.
		// 같으면 트루다.
		
		/*
		if(a[0] == b[0]) {
			모든 인덱스가 같아야 함.
			same = true;
		}
		
		
		a[0] == b [0] && a[1] == b[1] && a[2] == b[2]
		
		*/
		
		for(int i=0; i<3; i++) {
			if(a[i] == b[i]) {
				same = true;
				System.out.println("a와 b의 배열은 같습니다.");
			}
			else {
				System.out.println("a와 b의 배열은 다릅니다.");
			}
			
		}
		System.out.println();
		
//		if(a[0] == b [0] && a[1] == b[1] && a[2] == b[2])

	}

}
