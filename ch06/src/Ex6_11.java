
class Data_1{
	int value;
}

class Data_2{
	int value;
	
	Data_2(int x){ // 1. 매개변수가 있으면 생성자로 쓸수없음.
		value = x;
	}

	 Data_2() { // 3. 이렇게 기본 생성자를 만들어야함
	 }
}

public class Ex6_11 {
	
	public static void main(String args[]) {
	
		Data_1 d1 = new Data_1(); // 4. Data_1은 매개변수가 없어서 컴파일러가 알아서 Data_1() {} 기본생성자 추가해줌.
		Data_2 d2 = new Data_2(); // 2. 생성자호출 컴파일에러남
		
		
	}
	
}
