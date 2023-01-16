import java.util.Scanner;


public class Ex4_11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
	
		
		for( int i=1; i<9; i++) {
			for(int j=1; j<9; j++) {
				System.out.println(i+"*"+j+"="+(i*j));
			}
			System.out.println();
		}
		
	}

}
