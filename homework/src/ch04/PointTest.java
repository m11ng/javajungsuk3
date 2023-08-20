package ch04;

// 한 소스파일에? public 클래스는 1개 여야함.
class Point {
	
	int x;
	int y;
	
	public String toString() {
		return "x = " + x + ", y = " + y;
	}
	
	//Q1-4 매개변수가 있는 생성자
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//Q1-4 기본 생성자
	Point(){
		this(1, 1);
	}
	
	// Q1-5
	static double getDistance(Point p1, Point p2) { // 객체생성없이!!!! 하라고 static을 쓰라고하셨던거.
		
		double xx = p1.x - p2.x; 
		double yy = p1.y - p2.y; 
		
		return Math.sqrt((xx * xx) + (yy * yy)); 
	}
	
	
	// Q1-6
	// 제일 어려웠던 부분
	double getDistance(Point p) {
		
		double xx = this.x - p.x; 
		double yy = this.y - p.y; 
			
		return Math.sqrt((xx * xx) + (yy * yy)); 
		
	}
	
	// Q1-7 
	/*
	 	Point 클래스의 equals()를 다음과 같은 조건으로 오버라이딩 하고 테스트 하시오
	 	- 비교하는 객체가 Point객체가 아니면 false를 반환
	 	- Point 객체의 x와 y의 값이 같을 때만 true를 반환
	 */
	
		@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Point)) { //true 로 조건문에 걸리게 설정
			return false;
		}
			Point resultObj = (Point)obj;
			return (this.x == resultObj.x) && (this.y == resultObj.y);
	}
	
	
	
	
}

class Point3D extends Point {
	int z;
	
	Point3D(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	Point3D(){
		this(1, 1, 1);
	}
	
	public String toString() {
		return "x = " + x + ", y = " + y + ", z = " + z;
	}
}


public class PointTest {

	public static void main(String[] args) {

		Point p1 = new Point(3,5);
		System.out.println(p1);
		
		Point p2 = new Point(0,0);
		System.out.println(p2);
		
		
		// 거리 계산
		// 처음 내코드
//		double dist = p1.getDistance(new Point(3,5), new Point(1,1)); // static이 있으니, new 할 필요가 없음.
		
		double dist = Point.getDistance(p1, p2);
		
		// 처음에는 0,0,0,0으로 값을 넣어서 거리를 확인해보자.
		// 그럼 답이 0.0이 나와야함. 아님 0,0,0,1하면 1.0 나와야겠지. 
		// 이렇게 내가 알기 쉬운 값을 먼저 넣어서. 제대로된 코드가 맞는지 확인해가기.
		System.out.println(dist);
		
		
		
		Point p3 = new Point(0,0);
		
//		System.out.println(p3.getDistance(p3));
		double dist3 = p2.getDistance(p3);
		System.out.println(dist3);
		
		
		// Q1-7번 형변환 문제
		System.out.println(p1.equals(p3));
		System.out.println(p1.equals(p2));
		System.out.println(p2.equals(p3));
		
		
	}

}
