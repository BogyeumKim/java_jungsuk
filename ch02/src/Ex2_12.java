
public class Ex2_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "3";
		
		System.out.println(str.charAt(0) - '0'); // 숫자
		System.out.println('3'-'0' +1); // 숫자
		System.out.println('3' +1); // '3'은 숫자 51 
		System.out.println(Integer.parseInt(str) +1); // 숫자 3+1
		System.out.println("3"+1); // 문자 31
		System.out.println(3 +'0'); // '0'은 숫자로 48
		System.out.println((char)(3 +'0')); // 문자 3

	}

}
