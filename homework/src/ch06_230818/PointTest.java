package ch06_230818;

class PointTest {
	public static void main(String[] args) {
		Point p1 = new Point();
		Point p2 = new Point(1, 1);
		System.out.println(p1);
		System.out.println(p2);

		System.out.println(Point.getDistance(p1, p2)); // 객체 생성 없이 쓸 수 있는 메소드

		System.out.println(p1.getDistance(p2));

		Point3D p3 = new Point3D();
		System.out.println(p3);
	}
}
class Car {
	
}
class Point {
	
	int x;
	int y;

	Point() {
		this(1, 1);
	}

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "x= " + x + ", y= " + y;
	}

	static double getDistance(Point p1, Point p2) {
		double x = (p1.x - p2.x);
		double y = (p1.y - p2.y);
		double result = Math.sqrt((x * x) + (y * y));
		return result;
	}

	double getDistance(Point p) {
		double x = this.x - p.x;
		double y = this.y - p.y;
		return Math.sqrt((x * x) + (y * y));
	}

	// equals()를 오버라이딩하기
	// 비교하는 객체가 Point 객체가 아니면 false를 반환
	// Point 객체의 x와 y의 값이 같을 때만 true 반환
	public boolean equals(Object obj) { // Point 타입일때, Car일때..
		if (!(obj instanceof Point)) {
			return false; // 리턴을 만나면 지금 리턴값 가지고 바로 메서드 탈출!!!!!!!!!!!!!!!!!!!!!!! 나 호출한데로 리턴값과 함께 돌아가.
		}
		// if가 true일때 메서드가 끝나는 시점!!!
		// true : Point 타입이 아닌데 아래 문장 내려 가봤자 소용 없잖아 
		// 위에 조건문으로 걸러줘야지
		
		Point objectP = (Point)obj;
		boolean result = this.x == objectP.x && this.y == objectP.y;
		return result;

		
	}
}

class Point3D extends Point {
	int z;
	
	Point3D() {
	this(1, 1, 1);
	
	}
	
	Point3D(int x, int y, int z) {
		super(x,y);
		this.z = z;
	}
	
	public String toString() {

		return super.toString() + ", z= " + z;
	}
}








