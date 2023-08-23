package ch07;
/*
 	Shape Ŭ������ ���������ϴ� CircleŬ������ RactangleŬ������ �ۼ��Ͻÿ�
 	�����ڵ� �� Ŭ������ �°� ������ �߰��ؾ� �Ѵ�.
 */
class Circle extends Shape {
	double r;
	
	@Override
	double calcArea() {
		return (r*r)*(PI);
	}
	
}

abstract class Shape {
	Point p;// ����
	
	Shape() {
		this(new Point(0,0));
	}
	
	Shape(Point p) {
		this.p = p;
	}
	
	abstract double calcArea(); // ������ ������ ����Ͽ� ��ȯ�ϴ� �޼���
	
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
