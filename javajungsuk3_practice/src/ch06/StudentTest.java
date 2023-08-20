package ch06;

class StudentTest {
	public static void main(String[] args) {
		Student s = new Student();
		s.name="홍길동";
		s.ban=1;
		s.no=1;
		s.kor=100;
		s.eng=60;
		s.math=76;
		System.out.println("이름:"+s.name);
		System.out.println(s.getTotal());
		System.out.println(s.getAverage());
		
		Student s2 = new Student("홍길동",1,1,100,60,76);
		System.out.println(s.info());

		System.out.println(Student.getDistance(1,1,2,2));
		
	}
}

class Student {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	Student() {	}
	Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	int getTotal() {
		return kor + eng + math;
		}
	float getAverage() {
		int total = kor + eng + math;
		float avg = (Math.round((total/(float)3)*10))/10f;
		return avg;
	}
	String info() {
		return ""+name+","+ban+","+no+","+kor+","+eng+","+math+","+getTotal()+","+getAverage();
	} 
 
	// 두 점의 거리를 계산하는 getDistance()를 완성하시오.
	static double getDistance(int x, int y, int x1, int y1) {
		double xx = (x1-x);
		double yy = (y1-y);
		return Math.sqrt((xx*xx)+(yy*yy));
	}
}