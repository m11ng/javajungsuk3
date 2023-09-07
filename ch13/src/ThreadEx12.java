 class ThreadEx12 {
	public static void main(String args[]) {
		ThreadEx12_1 th1 = new ThreadEx12_1();
		ThreadEx12_2 th2 = new ThreadEx12_2();

		th1.start();
		th2.start();

		try {
//			th1.sleep(2000);	
			Thread.sleep(2000); 
			// sleep()은 static이기 때문에 클래스 이름으로 호출해야하고,
			// sleep이 있는 곳에 적용됨. 지금은 main에 있으니까 main이 제일 늦게 종료될거거고
			// 이 try/catch 문을 쓰레드를 상속받은 다른 클래스로 옮겨가면 걔가 제일 늦게 종료될거임.
		} catch(InterruptedException e) {}

		System.out.print("<<main 종료>>");
	} // main
}

class ThreadEx12_1 extends Thread {
	public void run() {
		for(int i=0; i < 300; i++) {
			System.out.print("-");
		}
		System.out.print("<<th1 종료>>");
	} // run()
}

class ThreadEx12_2 extends Thread {
	public void run() {
		for(int i=0; i < 300; i++) {
			System.out.print("|");
		}
		System.out.print("<<th2 종료>>");
	} // run()
}
