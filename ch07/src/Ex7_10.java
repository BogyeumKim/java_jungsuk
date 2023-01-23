
abstract class Uint{
	int x,y;
	abstract void move(int x, int y);
	void stop() {}
}

class Marine extends Uint{
	void move(int x, int y) {
		System.out.println("마린이 움직였다 x좌표 :"+x+"y좌표 : "+y);
	}
	void stimpack() {}
}

class Tank extends Uint{
	void move(int x, int y) {
		System.out.println("탱크가 움직였다 x좌표 :"+x+"y좌표 : "+y);
	}
	void changeMode() {}
}

class Dropship extends Uint{
	void move(int x, int y) {
		System.out.println("드랍쉽이 움직였다 x좌표 :"+x+"y좌표 : "+y);
	}
	void bording() {}
}




public class Ex7_10 {

	public static void main(String[] args) {
		Uint[] group= {
				new Marine(),
				new Tank(),
				new Dropship()
		};
		/*Unit[] group = new Unit[3];
		 * group[0] = new Marine();
		 * group[0] = new Tank();
		 * group[0] = new Dropship(); 
		 * 위 코드와 동일 한 코드 */
		
		for ( int i=0; i<group.length; i++) {
			group[i].move(100, 200);
		}
		
		/*group[0].move(100,200);
		 * group[1].move(100,200);
		 * group[2].move(100,200);
		 * 위 반복문을 풀어쓴 코드*/
		
		
	}

}
