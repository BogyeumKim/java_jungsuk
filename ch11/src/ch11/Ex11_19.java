package ch11;

import java.util.Arrays;
import java.util.Comparator;

public class Ex11_19 {
    public static void main(String[] args) {
        String[] strArr = {"cat", "Dog", "lion", "tiger"};
        Arrays.sort(strArr); // COmparable 구현에 의한 정렬
        System.out.println("strArr = " + Arrays.toString(strArr));

        Arrays.sort(strArr,String.CASE_INSENSITIVE_ORDER); // 대소문자 구분 X
        System.out.println("str Arr = " + Arrays.toString(strArr));

        Arrays.sort(strArr, new Descending());
        System.out.println("strArr = " + Arrays.toString(strArr));
    }
    /*strArr = [Dog, cat, lion, tiger]
    str Arr = [cat, Dog, lion, tiger]
    strArr = [tiger, lion, cat, Dog]*/
}

class Descending implements Comparator {
    @Override
    public int compare(Object o1, Object o2) { // Comprator 인터페이스의 compare를 구현
        if (o1 instanceof Comparable && o2 instanceof Comparable) {
            Comparable c1 = (Comparable) o1;
            Comparable c2 = (Comparable) o2;
            return c1.compareTo(c2) * -1; // -1 을 곱해서 기본 정렬방식을 역으로 변경. -> c2.compareTo(c1)과 동일
            /*
            *  compare()의 매개변수가 Object이므로 compareTo()를 사용할수없다.
            *  Object를 다시 Comparable로 형변환 해주자.*/
        }
        return -1;
    }
}
