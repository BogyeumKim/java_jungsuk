

public class Ex9_1 {

	public static void main(String[] args) {
		
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		
		if(v1.equals(v2)) System.out.println("v1과 v2는 같음");
		else System.out.println("v1과 v2는  다름");
	}

}


class Value {
	int value;
	
	Value(int value){
		this.value= value;
	}
	
	public boolean equals(Object obj) { // equals를 오버라이딩할때는 매개변수를 오브젝트로만 받아야한다.
		// 참조변수의 형변환 전에는 꼭 instanceof로 확인하자
		if(!(obj instanceof Value)) return false;
		
		Value v = (Value)obj;
		return this.value == v.value;
	}
	
}
