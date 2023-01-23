
abstract class Player { // 추상클래스
	abstract void play(String music); // 추상 메서드
	abstract void stop(); // 추상 메서드
}


class AudioPlayer extends Player {
	void play(String music) {
		System.out.println(music + "시작");
	}
	void stop() {
		System.out.println("중지");
	}
}


public class PlayerTest {

	public static void main(String[] args) {
//		Player p = new Player();
		
//		AudioPlayer ap = new AudioPlayer();
		Player ap = new AudioPlayer(); // 다형성 추상클래스 조상에 완성된 Audio의 주소가 들어가니까 
		ap.play("뉴진스 OMG");
		ap.stop();
	}

}
