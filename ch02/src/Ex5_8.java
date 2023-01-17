import java.util.Arrays;; // 컨 쉬프트 o

public class Ex5_8 {

	public static void main(String[] args) {

		int[][] score = { { 100, 100, 100 },
				{ 20, 20, 20 },
				{ 30, 30, 30 },
				{ 40, 40, 40 } };

		int[] xarry = new int[score.length];
		int[] yarry = new int[score[0].length];
		int sum = 0;

		for (int i = 0; i < score.length; i++) { // score.length = 4 
			for (int j = 0; j < score[i].length; j++) { // score[i].length =3 , j = 0,1,2
//				System.out.printf("score[%d][%d] = %d\n",i,j,score[i][j]);
				
				sum += score[i][j];
				xarry[i] += score[i][j];
				yarry[j] += score[i][j];
				
			}
		}
		System.out.println("합계 :" + sum);
		System.out.println("================");

		System.out.println("가로의합 : " + Arrays.toString(xarry));

		System.out.println("================");

		System.out.println("세로의합 : " + Arrays.toString(yarry));

	}

}
