package ch11;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Ex11_5 {
	
	public static void main(String[] args) {
//		ArrayList list = new ArrayList(); 
		 
		
		// set은 컬렉션의 자손 이니까 iterator 사용가능 하지만 HashSet.get이 없으므로 48줄 for문 .get은 불가 그러므로 20 line처럼 , next는 가능하다. 하지만 20라인처럼 업캐스팅해주기
		HashSet list = new HashSet();
//		TreeSet list = new TreeSet();
		
		
		// 아래처럼 업캐스팅 하는 이유는 뒤에 HashSet이나 TreeSet이나 언제든 바꿔도 에러가 안나기 떄문에
//		Collection list = new HashSet();
//		Collection list = new TreeSet();
		
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");


		
		Iterator it = list.iterator(); // 1회용  get,set 다 가능
		
		while(it.hasNext()) { // 다음 요소가 있으면 true 없으면 false 끝
			Object obj = it.next();
			System.out.println(obj);
		}
		
		System.out.println("==============");
		
		it = list.iterator(); 
		while(it.hasNext()) { // 안뜰거임 이유는 itreator가 1회용이라 다시 얻어와야함 윗줄 참고
			Object obj = it.next();
			System.out.println(obj);
		}

		
//		for(int i=0; i<list.size(); i++) {
//			Object obj = list.get(i); // get메서드는 컬렉션 및 Set에 없다. List에만 존재
//			System.out.println(obj);
//		}
		
		
	}


}
