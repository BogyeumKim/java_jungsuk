import java.util.Scanner;


public class Ex4_14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num = 0, sum = 0;
		System.out.println("숫자를 입력하세요 :");
		
		String tmp = scan.nextLine();
		num = Integer.parseInt(tmp);
		
		while(num!=0) {
			
			sum += num%10;
			System.out.printf("sum=%d num=%d%n",sum , num);
			num /=10;
			
		}
		
		System.out.println("나머지값 합 : " +sum);
		System.out.println("나눈값 : " +num);
	}

}
