package ch11;

import java.util.Stack;

public class Ex11_9_1 {

    public static Stack back = new Stack();
    public static Stack forward = new Stack();

    public static void main(String[] args) {
        goURL("1. 네이트");
        goURL("2. 야후");
        goURL("3. 네이버");
        goURL("4. 다음");

        printStatus();

        goBack();
        System.out.println(" = 뒤로가기 버튼 누른 후 =");
        printStatus();

        goBack();
        System.out.println(" '뒤로' 버튼 누른 후 ");
        printStatus();

        goForward();
        System.out.println(" = 앞으로 버튼 누른 후 =");
        printStatus();

        goURL("www.naver.com");
        System.out.println(" 새로운 주소로 이동 ");
        printStatus();
    }

    /*back : [1. 네이트, 2. 야후, 3. 네이버, 4. 다음]
    forward : []
     현재 화면은 : 4. 다음 입니다.

     = 뒤로가기 버튼 누른 후 =
    back : [1. 네이트, 2. 야후, 3. 네이버]
    forward : [4. 다음]
     현재 화면은 : 3. 네이버 입니다.

     '뒤로' 버튼 누른 후
    back : [1. 네이트, 2. 야후]
    forward : [4. 다음, 3. 네이버]
     현재 화면은 : 2. 야후 입니다.

     = 앞으로 버튼 누른 후 =
    back : [1. 네이트, 2. 야후, 3. 네이버]
    forward : [4. 다음]
     현재 화면은 : 3. 네이버 입니다.

     새로운 주소로 이동
    back : [1. 네이트, 2. 야후, 3. 네이버, www.naver.com]
    forward : []
     현재 화면은 : www.naver.com 입니다. */

    static void goURL(String url) {
        back.push(url);
        if (!forward.empty()) { // forward에 저장된값이 있다면
            forward.clear(); // forward 초기화
        }
    }

    static void goForward() {
        if (!forward.empty()) { // forward에 저장된값이 있다면
            back.push(forward.pop()); //  back에 push(저장) ( 맨위에 저장된 맨위[마지막] 객체를 )
        }
    }

    static void goBack() {
        if (!back.empty()) { // back에 저장된값이 있다면
            forward.push(back.pop()); // forward에 저장( back에 저장된 맨위[마지막] 객체를 )
        }
    }
    static void printStatus() {
        System.out.println("back : " + back);
        System.out.println("forward : " + forward);
        System.out.println(" 현재 화면은 : "+back.peek()+" 입니다. "); // ppek : 맨위의 객체를 꺼냄 [ pop과 다르게 반환하지는 않음 ]
        System.out.println();
    }
}
