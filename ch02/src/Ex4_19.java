import java.util.Scanner;


public class Ex4_19 {

	public static void main(String[] args) {
		
	
		Loop1 : for(int j=2; j<=9; j++) {
			for(int i=1; i<=9; i++) {
				if(i==3) {
//					break;
					break Loop1; // 이름달면 한번에 빠져나옴
				}
				
				System.out.println(j+"*"+i+"="+j*i);
			}
			
			System.out.println();
		}
		
		
	}

}
