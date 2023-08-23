package ch07;
/*
 	Shape 클래스를 조상으로하는 Circle클래스와 Ractangle클래스를 작성하시오
 	생성자도 각 클래스에 맞게 적절히 추가해야 한다.
 */
class Circle extends Shape {
	double r;
	
	@Override
	double calcArea() {
		return (r*r)*(PI);
	}
	
}

abstract class Shape {
	Point p;// 포함
	
	Shape() {
		this(new Point(0,0));
	}
	
	Shape(Point p) {
		this.p = p;
	}
	
	abstract double calcArea(); // 도형의 면적을 계산하여 반환하는 메서드
	
	Point getPosition() {
		return p;
	}
	
	void setPosition(Point p) {
		this.p=p;
	}
}

class Point{
	int x, y;
	
	Point() {
		this(0,0);
	}
	
	Point(int x, int y){
		this.x=x;
		this.y=y;
	}
	public String toString() {
		return "["+x+","+y+"]";
	}
}



public class Exercise7_22 {
	public static void main(String[] args) {

	}

}
