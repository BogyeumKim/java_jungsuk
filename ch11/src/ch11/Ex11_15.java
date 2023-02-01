package ch11;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Ex11_15 {
	
	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		int[] score = {80,90,45,30,25,15,10,100};
		
		for(int i=0; i<score.length; i++) {
			set.add(score[i]); // Set은 항상 참조객체만 받으므로 set.add(new Integer(score[i]))로 써야하지만 알아서 컴파일시 변환해준다.
		}
		
		// headSet, tailSet , subSet은 TreeSet에만 있으므로 Set 참조타입 set 변수로 만들지말고 TreeSet 참조타입으로 생성하자.
		System.out.println("50보다 작은값 : "+set.headSet(50)); 
		System.out.println("50보다 큰값 : "+set.tailSet(50));
		System.out.println("40~80 사이 값 : "+set.subSet(40,80));
	}
}

