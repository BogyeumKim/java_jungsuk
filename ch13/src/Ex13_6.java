public class Ex13_6 {

	public static void main(String[] args) {
		ThreadEx6_1 th1 = new ThreadEx6_1();
		ThreadEx6_2 th2 = new ThreadEx6_2();
		
		th2.setPriority(7); // 우선순위를 좀더 높인다.
		
		System.out.println("Priority of th1(-) : "+ th1.getPriority());
		System.out.println("Priority of th2(l) : "+ th2.getPriority());
		
		th1.start();
		th2.start();
		
		// 출력결과
		/**
		 * Priority of th1(-) : 5
			Priority of th2(l) : 7
			---------------------------------------------l-----------------------------------------------------------------------------
			-l-----------------------------------l---------------------------------------------------------------------l----------l--------
			-------------------------------------------------------llllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllll
			llllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllll
			lllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllll
		 *  이런식으로 우선순위 l가 높다고 먼저되는건아님 그냥 희망사항일뿐 OS스케쥴러가 정함 
		 */
		
	}

}


class ThreadEx6_1 extends Thread{ 
	public void run() { 
		for(int i=0; i<300; i++) 
			System.out.print("-");  
		for(int x=0; x< 10000; x++); // 시간벌기용
	}
}


class ThreadEx6_2 extends Thread{ 
	public void run() { 
		for(int i=0; i<300; i++) {
			System.out.print("l");
			for(int x=0; x< 10000; x++);			
		}
	}
}

