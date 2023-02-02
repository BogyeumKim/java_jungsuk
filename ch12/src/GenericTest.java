import java.util.ArrayList;

public class GenericTest {

	public static void main(String[] args) {
		
//		JDK 1.5 이전에는 제네릭스 생략가능 1.5 이후에는 지네릭스 생략하면안됨.
//		ArrayList list = new ArrayList();
		
		ArrayList<Object> list = new ArrayList<Object>();
//		ArrayList<Integer> list = new ArrayList<Integer>(); // 18line 사용가능
		list.add(10);
		list.add(20);
		list.add("30"); // String 6줄에서는 괜찮지만 7에서는 불가
//		list.add(30);
		
//		Integer i = (Integer)list.get(2); // 형변환 오류 list.get(2)는 Stinrg
//		Integer i =list.get(2); // 8 line에서 지네릭스를 사용시 형변환 생략 가능 
		String i = (String)list.get(2); // 7 line에서 Object를 받아온다면 String으로 형변환 가능
		
		System.out.println(i);
		
		System.out.println(list);
		
	}

}
