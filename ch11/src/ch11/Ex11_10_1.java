package ch11;

import java.util.EmptyStackException;
import java.util.Stack;

public class Ex11_10_1 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage : Java ExpValidCheck");
            System.out.println("Example : ((2+3)*1)+3 ");
            System.exit(0);
        }

        Stack st = new Stack();
        String expression = args[0];

        System.out.println("expreesion : " + expression);

        try {
            for (int i = 0; i < expression.length(); i++) {
                char ch = expression.charAt(i);

                if (ch == '(') {
                    st.push(ch + "");
                } else if (ch == ')') {
                    st.pop();
                }
            } // for

            if (st.isEmpty()) {
                System.out.println("괄호가 일치");
            } else {
                System.out.println(" 괄호가 불일치 ");
            }
        } catch (EmptyStackException e) {
            System.out.println(" 괄호 불일치! ");
        } // try
    }
    /*
    * 23 line 에서 '(' 를 발견하면 Stack 에 쌓고 다음 반복문을 돌다가 ')'를 발견하면 꺼내반환함. 괄호가 ( ) 한개씩 맞으면 저장후 반환해 빼내니까
    * isEmpty는 true여야함 괄호가 한개라도 더 많으면 불일치 */
}
