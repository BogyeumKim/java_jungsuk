import java.util.Arrays;
import java.util.Map;
import java.util.stream.IntStream;

import com.sun.org.apache.bcel.internal.generic.NEWARRAY;

public class ArrayZeroRemove {

	public static void main(String[] args) {

		int[][] score = { { 0, 100, 100 },
				{ 0, 20, 20 },
				{ 0, 30, 30 },
				{ 0, 40, 40 },
				{ 0, 40, 40 },
				{ 0, 40, 40 },
				{ 0, 40, 40 }};

		int[] xarry = new int[score.length];
		int[] yarry = new int[score.length];
		int sum = 0;
		
		
		
		for (int i = 0; i < score.length; i++) { // score.length = 7 
			for (int j = 0; j < score[i].length; j++) { // score[i].length =3 , j = 0,1,2
//				System.out.printf("score[%d][%d] = %d\n",i,j,score[i][j]);
				sum += score[i][j];
				xarry[i] += score[i][j];
				yarry[j] += score[i][j];
				
				
			}
		}
		
		
//		int[] filteredArray = Arrays.stream(yarry).filter(num -> num != 0).toArray(); // 1.8이상부터 지원됨 개날먹   
		
		int validValCount =0;
		
		for(int i = 0; i<yarry.length; i++) {
			if(yarry[i] !=0 ) {
				validValCount++;
			}
		}
		
		int j=0;
		
		int[] newArray = new int[validValCount];
		for(int i=0; i<yarry.length; i++) {

			if(yarry[i]!=0) {	
				newArray[j]=yarry[i];
				j++;
			}
		}
		
		
		
		
		
		System.out.println("합계 :" + sum);
		System.out.println("================");

		System.out.println("가로의합 : " + Arrays.toString(xarry));

		System.out.println("================");
		System.out.println("세로의합 : " + Arrays.toString(newArray));

//		System.out.println("세로의합 : " + Arrays.toString(filteredArray));

	}

}
