
public class Ex6_1 {
	
	public static void main(String args[]) {
				
		Tv t = new Tv();
		System.out.println(t.chn);
		t.chnDown();
		System.out.println(t.chn);
		
	}
		
	
}

class Tv {
	
	int chn = 55;
	
	void chnUp() {chn++;}
	void chnDown() {chn--;}
	
}






//public class는 하나만 사용가능하며 소스파일(*.java)의 이름과 동일해야한다.
//
//ex ) Hello.java 
//
//public class Hello{}
//
//
//
//public class가 없는 경우 소스파일의 이름은  작성된 아무 class 이름으로  가능하다.
//
//[단 class가 없는 이름으로 만드는경우 main 메서드를 찾지못하므로 class 이름을 맞추자 ]
//
//ex ) Hello3.java
//
//class Hello2 {}
//
//class Hello3 {}
//
//
//
//하나의 소스파일에는 하나의 클래스만 작성하는것이 바람직하다.







