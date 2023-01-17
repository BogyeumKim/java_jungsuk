import java.util.Arrays; // 컨 쉬프트 o

public class Ex5_2 {

	public static void main(String[] args) {
 
		int sum = 0;
		float average = 0f;
		
		int[] score = {10,41,20,56,94};
		
		for (int i = 0; i < score.length; i++) { // 합구하기
			sum = sum+score[i];
		}
		
		average = (float)sum / score.length; // 평균구하기
		
		System.out.println("합="+sum+"평균:"+average);
		
	}

}
