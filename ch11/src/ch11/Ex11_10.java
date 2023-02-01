package ch11;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Ex11_10 {
	
	public static void main(String[] args) {

		Set set = new HashSet();
		
		int num =0;
		for(int i=0; set.size()<6; i++) {
			num =(int)(Math.random()*45) +1; // 1~ 45 랜덤숫자
//			set.add(new Integer(num)); // set은 객체를 저장해야하니까 일반 num 이 아니라 참조객체 Integer num 넣기
			set.add(num); // 그래도 num만 넣어도 컴파일러가 알아서 반환해서 넣어줌.
		}
		
		List list = new LinkedList(set); // 정렬(sort)하려면 List로 만들어야함 , Set은 정렬불가
		Collections.sort(list); // Collections는 list의 조상이므로 컬렉션 메서드 sort 사용하여 list의 값들을 순차적으로 정렬
		System.out.println(list);
	}


}
