package ch11;

import java.util.HashMap;
import java.util.Scanner;

public class Ex11_16 {
	
	public static void main(String[] args) {
		
		HashMap map = new HashMap();
		map.put("Id", "1234");
		map.put("asd", "1111");
		map.put("asd", "1234");
		System.out.println(map);
		
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.println("id , pw 입력");
			System.out.println("id :");
			String id = s.nextLine().trim();
			
			System.out.println("pw :");
			String pw = s.nextLine().trim();
			System.out.println();
			
			if(!map.containsKey(id)) {
				System.out.println("입력하신 id는 없습니다 다시 입력");
				continue;
			}
			
			
			 if(!(map.get(id)).equals(pw)) {
				System.out.println("비밀번호가 일치하지 않는다.");
			} else {
				System.out.println("id pw 일치");
				break;
			}
			
		} // while 
	}
}

