
public class Ex6_8 {
	
	public static void main(String args[]) {
		
		Data3 d = new Data3(); // 1. 참조변수 d에 class Data3 을 생성 0x100 
		d.x = 100;
		
		Data3 d2 = copy(d); // 2. 참조변수 d2에 메소드 copy값 을 넣음
		System.out.println("d.x ="+d.x); // 100
		System.out.println("d2.x ="+d2.x); // 100
		
		
	}
	
	static Data3 copy(Data3 d) { // 3. Data3 참조형 타입의 copy라는 메소드 매개변수는 Data3 참조형
		Data3 tmp = new Data3(); // 4. 참조변수 tmp에 class Data3 을 생성 0x200
		tmp.x = d.x; // 5. tmp.x에 d.x 을 넣는데 여기서 d.x는 이미 1번에서 생성된 참조형 변수 d임 0x100값
		return tmp; // 6. 7번 라인에 d.x = 100 을 이미 넣어둠. tmp = 100 반환
	}
		
	
}


class Data3 { 
	int x; 
	}


/*
1. 참조변수 d에 class Data3 을 생성 0x100 
2. 참조변수 d2에 메소드 copy값 을 넣음
3. Data3 참조형 타입의 copy라는 메소드 매개변수는 Data3 참조형
4. 참조변수 tmp에 class Data3 을 생성 0x200 
5. tmp.x에 d.x 을 넣는데 여기서 d.x는 이미 1번에서 생성된 참조형 변수 d임 0x100값
6. 7번 라인에 d.x = 100 을 이미 넣어둠. tmp = 100 반환
*/