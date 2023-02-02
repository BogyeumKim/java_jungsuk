package ch11;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex11_17 {
	
	public static void main(String[] args) {
		
		HashMap map = new HashMap();
		map.put("김씨", new Integer(90));
		map.put("김씨", 100);
		map.put("이씨", 100);
		map.put("안씨", 80);
		map.put("강씨", 70);
		
		
		Set set = map.entrySet();
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			System.out.println("이름 : "+e.getKey()+", 점수 : "+e.getValue());
		}
		
		set = map.keySet();
		System.out.println("참가자 명단 : "+set);
		System.out.println("점수 모음 : "+map.values());
		
		Collection val = map.values(); // 컬렉션 참조타입 벨류에 map의 벨류값 다 넣기.
		
		it = val.iterator();
		System.out.println(it); // index값뜰거임
		
		int total = 0;
		
		while(it.hasNext()) {
			int i = (int)it.next();
			total +=i;
		}
		
		System.out.println("총점 : "+total);
		System.out.println("평균 : "+(float)total/set.size()); // 사이즈가 개수가니까
		System.out.println("최고점수 : "+Collections.max(val));
		System.out.println("최저점수 : "+Collections.min(val));
		
	
	}
}

