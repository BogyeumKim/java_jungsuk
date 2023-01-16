
public class VarEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int score = 100;
//		score = 200;
		boolean power = true;
		
		byte b = 5; // - 128 ~ 127 
		
		int oct = 010; // 8진수
		int hex = 0x10; // 16진수
		
		long l = 10_000_000_000L; // jdk1.8부터 언더바(_) 가능
		
		float f = 3.14f;
		double d = 3.14;
		
	
		
		System.out.println(f);
		System.out.println(d);
		
		System.out.println(l);
		
		System.out.println(oct);
		System.out.println(hex);
		
		
		System.out.println(b);
		System.out.println(power);
		System.out.println(score);
		
		System.out.println("=======================");
		char ch = 'A';
		int i = 'A';
		
		String str = ""; // empty 
		String str2 = "ABCD";
		String str3 = "123";
		String str4 = str2+str3;
		
		System.out.println(i);
		
		System.out.println(str4);
		
		
		
	}
}
