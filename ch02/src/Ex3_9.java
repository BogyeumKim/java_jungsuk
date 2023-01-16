
public class Ex3_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1_000_000 ,b=2_000_000;
		
		long c = a * b; // int 의 범위를 넘어서 음수로나옴
		System.out.println(c);
		
		long c1 = (long)a*(long)b; // 앞 a나 b만 long으로 형변환 해줘도됨
		System.out.println(c1);
		
		
		

	}

}
