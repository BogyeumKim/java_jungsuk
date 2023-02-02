import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;


enum Direction2 {  
	EAST(1,">"), SOUTH(2,"V") , WEST(3,"<") , NORTH(4,"^");  // 멤버 추가하려면 똑같이 생성자 초가화해주자
	
	private static final Direction2[] DIR_ARR = Direction2.values();
	private final int value;
	private final String symbol;
	
	
	private Direction2(int value, String symbol) {
		this.value = value;
		this.symbol = symbol;
	}

	int getValue() { return value; }
	String getSymbol() { return symbol; }
	
	public static Direction2 of(int dir) { // Direction2 참조타입의 of 메서드
		if(dir<1 || dir>4)
			throw new IllegalArgumentException("Invalid value: "+dir);
		return DIR_ARR[dir -1];
	}
	
	public Direction2 rotate(int num) { // 방향회전 num의 값만큼 90도 시계방향 회전
		num = num%4 ;
		if(num<0) num +=4; // 움스면 시계 반대방향 
		return DIR_ARR[(value-1+num) %4];
	}
	
	public String toString() {
		return name()+getSymbol();
	}


}; 


public class Ex12_6 {

	public static void main(String[] args) {
			for(Direction2 d : Direction2.values())
				System.out.printf("%s=%d%n" , d.name(), d.getValue());
			
			Direction2 d1 = Direction2.EAST;
			Direction2 d2 = Direction2.of(1);
			
			System.out.printf("d1=%s, %d%n", d1.name(), d1.getValue());
			System.out.printf("d2=%s, %d%n", d2.name(), d2.getValue());
			System.out.println(Direction2.EAST.rotate(1));
			System.out.println(Direction2.EAST.rotate(2));
			System.out.println(Direction2.EAST.rotate(-1));
			System.out.println(Direction2.EAST.rotate(-2));
		
		}
		
		
	}
	
