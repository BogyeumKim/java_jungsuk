import java.util.Arrays;; // 컨 쉬프트 o

public class Ex5_8 {

	public static void main(String[] args) {
 
		int[][] score = {
				{100, 100 ,100},
				{20,20,20},
				{30,30,30},
				{40,40,40}
		};
		
		int sum = 0;
		int asd = 0;
		
		for (int i=0; i<score.length; i++) {
			for(int j=0; j<score[i].length; j++) {
//				System.out.printf("score[%d][%d] = %d\n",i,j,score[i][j]);
				sum +=score[i][j];
			}
			System.out.println(sum);
			sum=0; // 가로한번 끝나고 초기화해야하니까.
			System.out.println("================");
		}
		
		
		


		
//		System.out.println("sum ="+sum);
		
	}

}
 