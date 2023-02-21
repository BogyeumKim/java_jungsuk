package ch11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex11_32 {
    static HashMap phoneBook = new HashMap();

    public static void main(String[] args) {
        addPhoneNo("친구","이자바","010-1111-1111");
        addPhoneNo("친구","김자바","010-2222-2222");
        addPhoneNo("친구","김자바","010-3333-3333");
        addPhoneNo("회사","김대리","010-4444-4444");
        addPhoneNo("회사","김대리","010-5555-5555");
        addPhoneNo("회사","박대리","010-6666-6666");
        addPhoneNo("회사","이과장","010-7777-7777");
        addPhoneNo("세탁","010-8888-8888");

        printList();
    }

    // 그룹에 전화번호 추가 메서드
    static void addPhoneNo(String groupName, String name, String tel) {
        // groupName(Key) 가 없으면 groupName을 넣어준다.
        if (!phoneBook.containsKey(groupName)) {
            phoneBook.put(groupName, new HashMap());
        }
        HashMap group = (HashMap) phoneBook.get(groupName); // groupName을 기준으로 새로운 Map을 생성하여 관리한다.(그룹관리)
        group.put(tel, name); // 이름중복되니까 전화번호를 key로
    }

    static void addPhoneNo(String name, String tel) {
        addPhoneNo("기타",name,tel);
    }


    static void printList() {
        Set set = phoneBook.entrySet(); // Map은 Set으로 변환후 Iterator사용
        Iterator it = set.iterator();

        while (it.hasNext()) { // 그룹들
            Map.Entry e = (Map.Entry) it.next(); // it 사용하려면 Map.Enrty으로 받아와야함.

            Set subSet = ((HashMap)e.getValue()).entrySet(); // 각 그룹의 value값들을 받아온것들을 다시 entrySet으로 변환(출력하기위해서)
            Iterator subIt = subSet.iterator();

            System.out.println(" * " + e.getKey() + "[" + subSet.size() + "]");

            while (subIt.hasNext()) { // 그룹 세부내용
                Map.Entry subE = (Map.Entry) subIt.next();
                String telNo = (String) subE.getKey();
                String name = (String) subE.getValue();
                System.out.println(name + " " + telNo);
            }
            System.out.println();
        }
    } // printList
}

/* * 기타[1]
세탁 010-8888-8888

 * 친구[3]
이자바 010-1111-1111
김자바 010-3333-3333
김자바 010-2222-2222

 * 회사[4]
이과장 010-7777-7777
박대리 010-6666-6666
김대리 010-5555-5555
김대리 010-4444-4444*/
