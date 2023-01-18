
public class Ex6_4 {
	
	public static void main(String args[]) {
				MyMath mm = new MyMath();
				long reuslt1 = mm.add(5L, 3L);
				long result2 = mm.subtract(10L, 20);
				long result3 = mm.multiply(8, 4L);
				long result4 = mm.divide(10, 5);
				int result5 = mm.maxVal(5, 4);
				
				mm.printGugudan(12);
				
				System.out.println(reuslt1);
				System.out.println(result2);
				System.out.println(result3);
				System.out.println(result4);
				System.out.println(result5);
	
		
	}
		
	
}

class MyMath {
	void printGugudan(int dan) {
		
		if(!(2<=dan && dan <=9)) return;
		
		for(int i=1; i<=9; i++) {
			System.out.printf("%d * %d = %d%n",dan,i,dan*i);
		}
	}
	
	
	
	long add (long a, long b) {
		long result = a+b;
		return result; // or return a+b
	}
	
	long subtract(long a,long b) {
		return a-b;
	}
	
	long multiply(long a,long b) {
		return a*b;
	}
	
	long divide(long a,long b) {
		return a/b;
	}
	
	// 두 값 받아서 둘중에 큰값 반환하는 메소드 작성하기
	int maxVal(int a,int b) {
		if (a<b) return b;
		else return a;		
	}
}




