package ch11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class EX11_5_1 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList(2000000);
        LinkedList ll = new LinkedList();

        System.out.println(" 순차적 추가 ");
        System.out.println("ArrayList : " + add1(al));
        System.out.println("LinkedList : " + add1(ll));
        System.out.println();

        System.out.println(" 중간에 추가 ");
        System.out.println("ArrayList : " + add2(al));
        System.out.println("LinkedList : " + add2(ll));
        System.out.println();

        System.out.println(" 중간에서 삭제 ");
        System.out.println("ArrayList : " + removel2(al));
        System.out.println("LinkedList : " + removel2(ll));
        System.out.println();

        System.out.println(" 순차적으로 삭제 ");
        System.out.println("ArrayList : " + removel(al));
        System.out.println("LinkedList : " + removel(ll));
        System.out.println();
    }

    static long add1(List list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            list.add(i + "");
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    static long add2(List list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            list.add(500, "X"); // 500 index에 X 추가
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    static long removel(List list) {
        long start = System.currentTimeMillis();
        for (int i = list.size() - 1; i >= 0; i--) { // 순차적으로 삭제(뒤에서부터)
            list.remove(i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    static long removel2(List list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {  // 앞에서부터 삭제( 한칸씩 계속 땡겨와야함 )
            list.remove(i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }
}


