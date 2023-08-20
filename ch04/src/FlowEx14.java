class FlowEx14 {
	public static void main(String[] args) { 
		for(int i=1,j=10;i<=10;i++,j--)
			System.out.printf("%d \t %d%n", i, j);
		
		System.out.println();
		
		for(int i=1,j=10; j>=1; i++, j--) {
			System.out.printf("%d \t %d%n", i, j);
		}
		
		System.out.println();
		
		// 하나의 변수만으로도 같은 결과를 얻을 수 있다.
		//for문에 사용되는 변수의 수가 적은 것이 더 효율적이고 간단하다.
		for(int i=1; i<=10; i++) {
			System.out.printf("%d \t %d%n", i, 11-i);
		}
	}
}
