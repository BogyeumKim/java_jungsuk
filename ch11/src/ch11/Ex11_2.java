package ch11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Ex11_2 {

	public static void main(String[] args) {
		
		Stack st = new Stack();
		Queue q = new LinkedList(); // Queue 인터페이스의 구현체인 LinkedList로 생성함.
		
		st.push("0");
		st.push("1");
		st.push("2");
		
		q.offer("0");
		q.offer("1");
		q.offer("2");
		
		System.out.println(" = Stack = ");
		while(!st.empty()) {
			System.out.println(st.pop()); // 스택에서 요소 하나를 꺼낸다 , 2 1 0 아래가 막혀있으니 반대순서로 꺼내옴
		}
		
		System.out.println(" = Queue = ");
		while(!q.isEmpty()) {
			System.out.println(q.poll()); // 큐에서 요소 하나를 꺼낸다 , 0 1 2 아래가 뚫려있으니 순서 그대로 꺼내옴
		}
		
		
	}
	
	

}
