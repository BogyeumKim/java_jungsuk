public class Ex13_11 {

	static long startTime =0;

	public static void main(String[] args) {

		ThreadEx11_1 th1 = new ThreadEx11_1();
		ThreadEx11_2 th2 = new ThreadEx11_2();
		
		th1.start(); // run메서드실행 0 출력
		th2.start(); // run메서드실행 1 출력
		startTime = System.currentTimeMillis();
		
		try {
			th1.join(); // main쓰레드가 th1의 작업이 끝날때까지 기다림.
			th2.join(); // main쓰레드가 th2의 작업이 끝날때까지 기다림.
		}catch (InterruptedException e) {}
		
		System.out.println("소요시간 :" +(System.currentTimeMillis() - startTime));
		
		// 출력결과
		//  ----------------------------------------------------------------------------------------------------------------------
//		---------------------------------------------------------------------------------------------------------------------------
//		-----------------------------------------------------------lllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllll
//		llllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllll
//		lllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllll소요시간 :3

	}

}

class ThreadEx11_1 extends Thread{ // Thread 클래스 상속
	public void run() { // 쓰레드는 run 메서드로 작성해야한다.
		for(int i=0; i<300; i++) 
			System.out.print("-"); // 조상 Thread의 getName 
	}
}


class ThreadEx11_2 extends Thread{ // Runnable 인터페이스를 상속받음
	public void run() { // 마찬가지로 메서드는 run으로
		for(int i=0; i<300; i++) {
//			Thread.currentThread(); // - 현재 실행중인 Tread를 반환
			System.out.print("l");
		}
	}
}


