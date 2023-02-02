import java.util.ArrayList;

class Tv{}
class Audio{}


public class GenericTest2 {

	public static void main(String[] args) {
	ArrayList<Tv> list = new  ArrayList<Tv>();
	
	list.add(new Tv());
//	list.add(new Audio()); // 에러임 Tv객체만 받아올수있으니까
	
	Tv t = (Tv)list.get(0); // 원래 (Tv)로 형변환 해줘야 하지만 제네릭선언하면 (Tv) 생략가능
	
		
	}

}
