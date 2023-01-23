
class Car {
	String color;
	int door;
	
	void drive() {
		System.out.println(" 운전시작 ");
	}
	
	void stop() {
		System.out.println(" 운전 정지 ");
	}
	
}

class FireEngine extends Car{
	void water() {
		System.out.println(" 물뿌리기 ");
	}
}

public class Ex7_7 {

	public static void main(String[] args) {
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = fe; // car =(Car)fe; 에서 형변환 생략 FireEngine은 color , door , dirve() , stop() , water() 5개 car는 water 제외 4개라 생략 가능 
//		car.water(); // 4는 5 다. 작은거에 큰걸 넣어 오른쪽 fe의 메소드 water 쓸수 없다.
		fe2 = (FireEngine)car; // 자손타입 < 조상타입 형변환 생략 불가 
		fe2.water(); //  5는 4다. 큰거에 작은 조상을 넣어 fe2 메소드 water 사용 가능
	}

}
