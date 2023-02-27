public class Ex14_2_1 {
    public static void main(String[] args) {
        MyFunction14_2 f = ()->{}; // MyFunction f = (MyFunction)(()->{});
        Object obj = (MyFunction14_2)(()->{}); // 오브젝트 타입으로 형변환 생략됨
        String str = ((Object)(MyFunction14_2)(()->{})).toString();

        System.out.println(f);
        System.out.println(obj);
        System.out.println(str);

        System.out.println((MyFunction14_2)(()->{}));
        System.out.println(((Object)(MyFunction14_2)(()->{})).toString());
        /*
        출력결과
        Ex14_2_1$$Lambda$1/455659002@4eec7777  -> 외부클래스이름$Lambda$번호 형식
        Ex14_2_1$$Lambda$2/1283928880@3b07d329
        Ex14_2_1$$Lambda$3/295530567@776ec8df
        Ex14_2_1$$Lambda$4/1096979270@404b9385
        Ex14_2_1$$Lambda$5/1831932724@682a0b20*/
    }
}

@FunctionalInterface
interface MyFunction14_2 {
    void myMethod();
}
