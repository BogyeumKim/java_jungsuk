import java.util.Arrays; // 컨 쉬프트 o

public class Ex5_1 {

	public static void main(String[] args) {

//		int[] score;
//		score = new int[5];
		
//		int[] score = new int[5];
//		score[3] = 100;
		
		int[] score = {1,2,3,4,5};
		
		
		for(int a=0; a<score.length; a++) {
			System.out.println(score[a]);
		}
		
		
		System.out.println(Arrays.toString(score)); // api를 이용하여 반복문없이 출력
		
		
//		System.out.println(score[3]);
		
		
	}

}
