package ch04;

public class Baseball2 {
	// 문제를 이해하는데 오래 걸렸음.
	// 정답을 보고도 해당 코드가 어떻게 돌아가는지 해석하는데도 오래 걸렸음.

	public static void main(String[] args) {
		/*
		 	야구게임 중복없는 3자리 숫자가 담긴 두 배열을 비교해서, 
		 	값이 같고 위치가 같으면 strike 
		 	값이 같고 위치가 다르면 ball 
		 	strike와 ball에 갯수를 세어 출력하시오.
		 */
		
		int[] a = {1,2,3};
		int[] b = {1,3,2};
		
		// 문제에서 변수 선언이 필요하다는 걸 잘 인지하기.
		int strike = 0;
		int ball = 0;
		
		/*
			문제를 쪼개 보자.
			코드가 간결한게 우선 순위가 아니다.
			코드가 길더라도, 풀어서 일단 써보기.
		 
		
			1. 값이 같을 때를 식으로 세워보자.
				a[i] == b[i]
			2. 위치가 같을 때를 식으로 세워보자.
				i == i
		
		 */
		
		
		/*
		
		if(a[0]==b[0]) strike++;
		if(a[0]==b[1]) ball++;
		if(a[0]==b[2]) ball++;
		
		if(a[1]==b[0]) ball++;
		if(a[1]==b[1]) strike++;
		if(a[1]==b[2]) ball++;
		
		if(a[2]==b[0]) ball++;
		if(a[2]==b[1]) ball++;
		if(a[2]==b[2]) strike++;

		*/
		
		// 쉽게 짠 후 반복문을 이용해서 코드 줄여보기 연습.
		// 먼저 반복문을 쓴다고 좋은게 아님.
		// 패턴을 찾고 패턴을 만들어 내는 연습
		
		for(int i=0; i<=2; i++) {
			for(int j=0; j<=2; j++) {
				if(a[i]==b[j]) { 
					if(i==j) { // 같거나
						strike++;
					}
					else { // 다른 경우.
						ball++;
					}
				}
			}
		}
		
		System.out.println(strike);
		System.out.println(ball);
		
	}
}


