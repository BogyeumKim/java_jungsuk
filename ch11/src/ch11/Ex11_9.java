package ch11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex11_9 {
	
	public static void main(String[] args) {

		Object[] objArr = {"1",new Integer(1),"2","2","3","3","4","4","4","4"};
		Set set = new HashSet();
		
		for(int i=0; i<objArr.length; i++) {
			set.add(objArr[i]);
		}
		
		// HashSet에 저장된 요소 출력
		System.out.println(set);
		
		// HashSet에 저장된 요소 출력 ( Iterator 이용 )
		Iterator it = set.iterator();
		
		while(it.hasNext()) {  // iterator 국룩 sop 이므로 외우자.
			System.out.println(it.next());
		}
		
		
		// 출력결과 1, 1, 2,3 ,4 나오는데 HashSet은 중복 허용하지 않으므로. 1 두번인이유는 String1 / Integer 1 이여서
		
	}


}
