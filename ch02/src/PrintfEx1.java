
public class PrintfEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(10/3);
		System.out.println(10/3.3);
		
		System.out.printf("%d\n",15);
		
		float f =123.456f;
		System.out.printf("%f",f);
		System.out.println();
		System.out.printf("[%5d]\n",1234567);
		System.out.printf("[%-5d]\n",10);
		System.out.printf("[%05d]\n",10);
		
		double d =1.23456789;
		System.out.println();
		System.out.printf("%.6f\n",d);
		
		System.out.printf("[%s]","www.naver.com");
		System.out.printf("[%20s]","www.naver.com");
		System.out.printf("[%-20s]","www.naver.com");
		System.out.printf("[%.10s]","www.naver.com");
	}

}
