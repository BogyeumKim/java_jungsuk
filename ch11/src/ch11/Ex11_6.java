package ch11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex11_6 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList(1000000);
        LinkedList ll = new LinkedList();

        add(al);
        add(ll);

        System.out.println(" 접근 시간 테스트");
        System.out.println("ArrayList : " + access(al));
        System.out.println("LinkedList : " + access(ll));

        /*
        Array List는 읽기가 빠르고 추가/삭제가 느리다 LinkedList는 읽기가 느리고 추가/삭제가 빠르다.
        그러므로 ArrayList al = new ArrayList(10000);
        for(int i = 0 ~~ ) al.add(i+"");

        하지만 추가/삭제할 작업이 많다면

        LinkedList ll = new LinkedList(al);
        for(int i=0; ~~ ) ll.add(index,"value");

        이런식으로 처음에는 ArrayList로 저장후 LinkedList에 데이터를 옮겨 작업하자.
        */
    }

    static void add(List list) {
        for (int i = 0; i < 10000; i++) {
            list.add(i + "");
        }
    }

    static long access(List list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            list.get(i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }
}
