public class Ex13_1 {

	public static void main(String[] args) {

		ThreadEx1_1 t1 = new ThreadEx1_1();
		
		Runnable r = new ThreadEx1_2();
		Thread t2 = new Thread(r);
		
		t1.start(); // run메서드실행 0 출력
		t2.start(); // run메서드실행 1 출력
		
		// 출력결과 0 0 0 0 0 0  0 0 0 1 1 1 1 11 1 1 1 0 0 0 0 0 1 1 1 0 0 0 0 0 0 0 ~~~ 
	}

}

class ThreadEx1_1 extends Thread{ // Thread 클래스 상속
	public void run() { // 쓰레드는 run 메서드로 작성해야한다.
		for(int i=0; i<505; i++) System.out.println(this.getName()); // 조상 Thread의 getName 
	}
}


class ThreadEx1_2 implements Runnable{ // Runnable 인터페이스를 상속받음
	public void run() { // 마찬가지로 메서드는 run으로
		for(int i=0; i<505; i++) {
//			Thread.currentThread(); // - 현재 실행중인 Tread를 반환
			System.out.println(Thread.currentThread().getName());
		}
	}
}


