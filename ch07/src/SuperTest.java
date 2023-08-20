class SuperTest {
	public static void main(String args[]) {
		Child1 c = new Child1();
		c.method();
	}
}

class Parent1 {
	int x=10;
}

class Child1 extends Parent1 {
	void method() {
		System.out.println("x=" + x);
		System.out.println("this.x=" + this.x);
		System.out.println("super.x="+ super.x);
	}
}
