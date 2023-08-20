package ch06;

public class Exercise6_20 {

	static int[] shuffle (int[] arr) {
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*9)+1;
		}
		return arr;
	}
	
	static int[] shuffle2 (int[] arr) {
		for(int i=0; i<arr.length-1; i++) {
			int tmp;
			tmp = arr[i];
			arr[i] = arr[i+1];
			arr[i+1] = tmp;
		}
		return arr;
	}
	public static void main(String[] args) {
		int[] original = {1,2,3,4,5,6,7,8,9};
		
		System.out.println(java.util.Arrays.toString(original));
		
//		int[] result = shuffle(original);
//		System.out.println(java.util.Arrays.toString(result));

		
		System.out.println(java.util.Arrays.toString(original));
		int[] result2 = shuffle2(original);
		System.out.println(java.util.Arrays.toString(result2));
	
	}

}
