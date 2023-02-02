import java.util.ArrayList;
import java.util.List;

class Product {}
class Tv1 extends Product {}
class Audio1 extends Product {}


public class Ex12_1 {

	public static void main(String[] args) {
		ArrayList<Product> pdList = new ArrayList<Product>();
		ArrayList<Tv1> tvList =  new ArrayList<Tv1>();
//		ArrayList<Product> tvList2 = new ArrayList<Tv>(); // 에러 제네릭스가 맞지않음.
		List<Tv1> tvList3 = new ArrayList<Tv1>(); // List는 ArrayList의 조상이니까 업캐스팅 가능 제네릭스는 다르면 무조건 오류
		
		pdList.add(new Tv1());
		pdList.add(new Audio1());
		
		tvList.add(new Tv1());
		tvList.add(new Tv1());
		
		printAll(pdList);
		
		
		
	}
	
	static void printAll (ArrayList<Product> list) {
		for(Product p : list) {
			System.out.println(p);
		} // for
	} // printAll
}
