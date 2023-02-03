public class Ex13_10{
	
	public static void main(String[] args) {
		MyThread th1 = new MyThread("1");
		MyThread th2 = new MyThread("22");
		MyThread th3 = new MyThread("333");
			
			th1.start();
			th2.start();
			th3.start();
		
			try {
				Thread.sleep(2000);
				th1.suspend(); // th1을 잠시 중단시킴
				
				Thread.sleep(2000);
				th2.suspend(); // th2 잠시중단시킴
				
				Thread.sleep(3000);
				th1.suspend(); // th1을 다시 동작시킴
				
				Thread.sleep(3000);
				th1.stop();
				th2.stop();
				
				Thread.sleep(2000);
				th3.stop();
				System.out.println("끝");
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
	}	
	
}

class MyThread implements Runnable {
	
	volatile boolean suspended = false; // volatile 란 쉽게 바뀌는 변수에 적용한다고 생각하자. 안쓰면 컴파일 종료가안됨 run 무한루프돌음 
	volatile boolean stopped = false;
	
	
	Thread th;
	public MyThread(String name) {
		 th = new Thread(this, name); // Thread(Runnable r , String name)
	}
	
	void start() {
		th.start();
	}
	
	void stop() {
		stopped = true;
	}
	
	void suspend() {
		suspended = true;
	}
	
	void resume() {
		suspended = false;
	}
	
	public void run() {
		while(!stopped) {
			if(!suspended) {
				System.out.println(Thread.currentThread().getName());
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO: handle exception
				}
			}
			
		}
	} // run
}