import javax.management.RuntimeErrorException;

public class Ex8_7 {

	public static void main(String[] args) {

		try { // Exception과 그 자손은 반드시 예외처리 해줘야한다. ( 필수 )
			throw new Exception(); // Exception 고의 발생
		}catch (Exception e) {
			
		}
		// RuntimeException과 그 자손은 예외처리 해주지 않아도 컴파일 가능 ( 선택 ) 
		throw new RuntimeException(); // 컴파일은 가능해도 에러는 뜸
	}
 
}
