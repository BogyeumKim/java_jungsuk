package ch11;

import java.util.ArrayList;
import java.util.Collections;

public class Ex11_1 {

	public static void main(String[] args) {
		ArrayList list1 = new ArrayList(10); // 기본 길이(용량) 10인 arraylist 생성
		
		// ArrayList에는 객체만 저장 가능
		list1.add(5); // autoboxing에 의해 기본형이 참조형으로 자동 변환 -> new Integer(5)로 변환됨
//		list1.add(new Integer(5));
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));

		ArrayList list2 = new ArrayList(list1.subList(1, 4)); // 1<=x<4
		print(list1,list2);
		
		Collections.sort(list1); // 오름차순 정렬
		Collections.sort(list2); // 동일
		print(list1,list2);
		
		list2.add("B"); // 맨뒤에 B추가
		list2.add("C"); // 맨뒤에 C추가
		list2.add(3,"A"); // 3번째 index에 A추가
		print(list1,list2);
		
		list2.set(3, "AA"); // 3번째 index에 AA로 치환
		print(list1,list2);
		
		list1.add(0,"1"); // String임
		print(list1,list2);
		
		System.out.println("index="+list1.indexOf("1")); // indexOf()는 저장된 객체의 위치(index)를 반환
		System.out.println("index="+list1.indexOf(1)); // indexOf()는 저장된 객체의 위치(index)를 반환
		System.out.println("");
		
		list1.remove(new Integer(1)); // 객체 Integer타입 1 을 의미
		list1.remove(5); // index 5번을 의미
		print(list1,list2);
		
		
	}
	
	

	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1:"+list1);
		System.out.println("list2:"+list2);
		System.out.println("");
	}

}
