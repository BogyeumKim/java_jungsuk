
abstract class Unit{
	int x,y;
	abstract void move(int x, int y);
	void stop() { System.out.println("중지"); }
}

interface Fightable { // 인터페이스의 모든 메서드는 public abstract
	void move(int x , int y); // public abstract가 생략됨
	void attack(Fightable f); // public abstract가 생략됨
}

class Fighter extends Unit implements Fightable{
	@Override
	public void move(int x, int y) { // 오버라이딩 규칙 : 조상(public) 보다 접근 제어자가 좁으면 안된다.
		System.out.println("["+x+","+y+"]로 이동");
	}
	@Override
	public void attack(Fightable f) {
		System.out.println(f+"를 공격");
	}
	
	Fightable getFigtable() {
		Fighter f = new Fighter(); // Fighter를 생성해서 반환
		return (Fightable)f;
	}
	
}


public class FighterTest {

	public static void main(String[] args) {

		Unit u = new Fighter(); // Unit 에는 attack()이 없어서 호출불가
		Fighter f = new Fighter(); // Fighter 에는 stop() 없어서 호출 불가
		
		f.move(100, 200);
		u.stop();
		f.attack(new Fighter());
		
		Fightable f2=f.getFigtable(); // getFigtable()은 Fightable 타입이므로 Fightable 으로 반환된다. 고로 여기에도 Fightable 타입을 선언해줘야함
		
	}

}
