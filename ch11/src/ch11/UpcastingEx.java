package ch11;

class A {
	void Ametod() {
		System.out.println("조상 A메소드임");
	}
	void pollLast(int[] arr) {}
}

class B extends A{
	 void pollLast(int[] arr) { 
		int lastVal = arr[arr.length-1];
		System.out.println(lastVal);
	}
	
}

class C extends A{
	void Cmetod() {
		System.out.println("C메소드임");
	}
	
	void pollLast(int[] arr) { 
		int lastVal = arr[arr.length-1];
		System.out.println(lastVal);
	}
}

class UpcastingEx {
	public static void main(String[] args) {
		int[] array = {1,2,3,4};
		A a = new C();
		a.Ametod();
		a.pollLast(array);
	}
}