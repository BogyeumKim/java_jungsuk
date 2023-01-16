import java.util.Scanner;


public class Ex4_16 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int input =0, answer =0;
		
		answer= (int)(Math.random() *100) +1; // 1~100사이
		
		do {
			System.out.println("1~100 사이 숫자 입력 :");
			input = scan.nextInt();
			
			if(input > answer) {
				System.out.println("정답은 더 작음");
			} else if(input < answer) {
				System.out.println("정답은 더 큼");
			}
		} while(input != answer); // 거짓일때 탈출이니까
			
		
		System.out.println("정답임");
		
		
	}

}
