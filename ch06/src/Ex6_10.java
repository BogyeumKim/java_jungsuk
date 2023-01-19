
public class Ex6_10 {
	
	public static void main(String args[]) {
		MyMath3 mm = new MyMath3();
		System.out.println("mm.add(3,5) : "+mm.add(3,5));
		System.out.println("mm.add(3,5L) : "+mm.add(3,5L));
		System.out.println("mm.add(3L,5L) : "+mm.add(3L,5L));
		
		int[] array = {100,200,300};
		System.out.println("mm.add[a] : "+mm.add(array));
		
		
	}
	
}

class MyMath3 {
	int add(int a , int b ) {
		System.out.println("int add(int a, int b) - ");
		return a+b;
	}
	
	
	long add(int a , long b ) {
		System.out.println("int add(int a, long b) - ");
		return a+b;
	}
	
	long add (long a , long b ) {
		System.out.println("int add(long a, long b) - ");
		return a+b;
	}
	
	int add (int[] a) {
		System.out.println("int add(int add(int[] a) - ");
		int result = 0;
		for ( int i =0; i< a.length; i++) {
			result = result+a[i];
		}
		return result;
	}
	
	
}