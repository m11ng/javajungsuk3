class ArrayEx10_2 { // 인덱스 자리 바꾸기
	public static void main(String[] args) {
		
		// 배열을 하나 만들어줘
		int[] numArr = new int[10];

		//배열에 0~9 난수를 채워준다.
		for (int i=0; i < numArr.length ; i++ ) {
			System.out.print(numArr[i] = (int)(Math.random() * 10));
		}
		//줄바꿈
		System.out.println();

		// 배열에 채운 난수를 섞어줄거야. 나랑 내 옆자리를 비교해서 섞어주는 거지.
		// 섞는 게 완성된걸 확인하기 위해서 변수를 하나 만들어 줄거야
		// 섞는게 완성 됐다면 true
		for (int i=0; i < numArr.length-1 ; i++ ) {
			boolean changed = false;	// 자리바꿈이 발생했는지를 체크한다.

			for (int j=0; j < numArr.length-1-i ;j++) {
				if(numArr[j] > numArr[j+1]) { // 옆의 값이 작으면 서로 바꾼다.
					int temp = numArr[j];
					numArr[j] = numArr[j+1];
					numArr[j+1] = temp;
					changed = true;	// 자리바꿈이 발생했으니 changed를 true로.
				}
			} // end for j

			//만약 다 섞였으면, 멈춰. 반복문을 멈추라는건가? 뭐징.... 반복문이 끝나면 알아서 멈추지 않나?
			if (!changed) break;	// 자리바꿈이 없으면 반복문을 벗어난다.

			// 정렬된 결과가 잘 섞였는지 출력해보자.
			for(int k=0; k<numArr.length;k++)
				System.out.print(numArr[k]); // 정렬된 결과를 출력한다.
			System.out.println();
		} // end for i
	} // main의 끝
}
