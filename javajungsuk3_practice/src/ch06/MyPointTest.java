package ch06;

public class MyPointTest {

	public static void main(String[] args) {
		MyPoint p = new MyPoint(1,1);
		System.out.println(p.getDistance(2,2));
	}
}
class MyPoint {
	int x;
	int y;
	
	MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	// "인스턴스 메서드" getDistance 메서드를 작성하시오
		double getDistance(int x, int y) {
			double xx = (this.x-x);
			double yy = (this.y-y);
			return Math.sqrt((xx*xx)+(yy*yy));
		}
}
