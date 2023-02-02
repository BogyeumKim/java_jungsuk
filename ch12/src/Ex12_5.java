import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;


enum Direction { EAST, SOUTH , WEST , NORTH } // 상수

public class Ex12_5 {

	public static void main(String[] args) {
			Direction d1 = Direction.EAST;
			Direction d2 = Direction.valueOf("WEST");
			Direction d3 = Enum.valueOf(Direction.class, "EAST");
			
			System.out.println("d1 = "+d1);
			System.out.println("d2 = "+d2);
			System.out.println("d3 = "+d3);

			
			System.out.println("d1 == d2 ? "+(d1==d2));
			System.out.println("d1 == d3 ? "+(d1==d3));
			
			System.out.println("d1.equals(d3) ? " + d1.equals(d3)); // 객체라 true임
//			System.out.println("d2 > d3 ? "+ (d1 > d3)); // 에러 enum 에서 부등호는 == 만 가능 애초에 객체라 불가
			System.out.println("d1.compareTo(d2) ? "+d1.compareTo(d2)); // d1=EAST = 0, d2=WEST = 2 오른쪽이 크니까 음수 
			System.out.println("d1.compareTo(d3) ? "+d1.compareTo(d3));
			
			switch (d1) {
			case EAST: // Direction.EAST라고 쓸수없음. 그냥 공식임
				System.out.println("EAST");
				break;
			case SOUTH:
				System.out.println("SOUTH");
				break;
			case WEST:
				System.out.println("WEST");
				break;
			case NORTH:
				System.out.println("NORTH");
				break;
			default:
				break;
			}
			
			Direction[] dArr = Direction.values(); // values 열거형 모든 상수 배열로 반환
			
			System.out.println("======");
			for (Direction d : dArr) {
				System.out.println(d.name()+" , "+d.ordinal()); // ordinal : 순서
			}
		
		
		}
		
		
	}
	
