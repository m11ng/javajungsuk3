package ch06;

class Exercise6_23 {
	
	int max(int[] arr) {
		for(int i=0; i<arr.length-1; i++) {
			int tmp = 0;
			if(arr[i]>arr[i+1]) {
				tmp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = tmp;
			}
		}
		return arr[4];
		
	}

	public static void main(String[] args) {
		int[] data = {3,2,9,4,7};
		
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("최대값:"+max(data));
		System.out.println("최대값:"+max(null));
		System.out.println("최대값:"+max(new int[] {} )); // 크기가 0인 배열
	}

}
