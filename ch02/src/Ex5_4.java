import java.util.Arrays; // 컨 쉬프트 o

public class Ex5_4 {

	public static void main(String[] args) {
 
		int[] num = {0,1,2,3,4,5,6,7,8,9};
		String[] write = {"hi","lol","wtf"};
		
		System.out.println(Arrays.toString(num));
		
		for(int i=0; i<num.length; i++) {
			
			int n= (int)Math.random();
			
			int tmp=num[0];
			num[0]=num[i];
			num[i]=tmp;
			
		}
		
		System.out.println(Arrays.toString(num));
		System.out.println(Arrays.toString(write));
		
	}

}
