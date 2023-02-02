public class Ex13_7 implements Runnable{
	
	static boolean autoSave = false;
	
	public static void main(String[] args) {
		
		Thread t = new Thread(new Ex13_7()); // new Ex13_7l()이 new Thread( new Runnable r ) 이랑 마찬가지
		t.setDaemon(true); // 이부분이 없으면 종료가 안됨. run() while이 계속 돌기때문에
		t.start();
		
		for(int i=0; i<=12; i++) {
			try {
				Thread.sleep(1000);
			}catch (Exception e) {}
			
			System.out.println(i);
			
			if(i==5) autoSave = true; // 5초부터 아래 run 실행되면서 3초마다 작업파일 자동저장완료 찍힘
		}
		
		System.out.println("프로그램 종료");
		
		
	}

	
	public void run() {
		while(true) {
			try {
				Thread.sleep(3 * 1000); // 3초마다
			} catch (InterruptedException e) {}
			
			// autoSave의 값이 true면 autoSave() 호출
			if(autoSave) autoSave();
			
		} // while 
	}
	
	void autoSave() {
		System.out.println("작업파일 자동저장완료.");
	}
	
	
}

