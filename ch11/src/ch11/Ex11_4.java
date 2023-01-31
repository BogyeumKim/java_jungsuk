package ch11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex11_4 {

	static Queue q = new LinkedList();
	static final int MAX_SIZE = 5; // Queue에 최대 5개까지만 저장
	
	
	public static void main(String[] args) {
		System.out.println("help를 입력하면 도움말");
		
		while(true) {
			System.out.println(">>");
			
			try {
				
				Scanner s = new Scanner(System.in);
				String input = s.nextLine().trim();
				
				if("".equals(input)) continue;
				
				if(input.equalsIgnoreCase("q")) { // 대소문자 구분 안함
					System.exit(0);
				} else if (input.equalsIgnoreCase("help")) {
					System.out.println(" help - 도움말");
					System.out.println(" q,Q - 프로그램 종료");
					System.out.println(" history - 최근에 입력한 명령어를" + MAX_SIZE + "개 보여줌");
				} else if(input.equalsIgnoreCase("history")) {
					save(input);
					
					LinkedList list = (LinkedList)q;
					
					final int SIZE = list.size();
					
					for(int i=0;i<SIZE;i++) // list size는 5 상수이므로 위에 따로 선언해주자.
						System.out.println((i+1)+"."+list.get(i));
				} else {
					save(input);
					System.out.println(input);
				}
				
			
			} catch (Exception e) {
				System.out.println("입력오류");
				
			}
			
			
		} // while 
		
	}
	
	 static void save(String input) {
		// queue에 저장
		if(!"".equals(input)) // if(input != null && !input.equlas(""))
			q.offer(input); // 큐에 명령어 저장
		
		if(q.size() > MAX_SIZE) // size() 컬렉션 인터페이스에 정의 및 size가 MAX 넘으면 삭제
			q.remove(); 
	}
	

}
