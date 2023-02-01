package ch11;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Ex11_13 {
	
	public static void main(String[] args) {
		Set set = new TreeSet(); // TreeSet이라 알아서 순차적 정렬됨 범위검색, 정렬에 유리 16~20 for문으로 add하면서 비교
		
		int num =0;
		for( int i=0; set.size() <6; i++) {
			num = (int)(Math.random()*45) +1;
			set.add(num); // or set.add(Integer(num));
			
		}
		
//		set.add(new Test()); // 28줄에 비교기준이 없으므로 비교할수있게 30줄처럼 오버라이딩해줘야함 그리고 16~19 for문 을 없애야함
		
		System.out.println(set);
	}
}

//class Test{} // 비교기준이 없음

class Test implements Comparable{

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

	
