import java.util.Arrays;
import java.util.Scanner;

public class Ex5_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자입력");
        String num = sc.nextLine();

        int[] numArr = new int[num.length()];
        int[] counter = new int[numArr.length];
        for (int i = 0; i < numArr.length; i++) {
            numArr[i]=Integer.parseInt(String.valueOf(num.charAt(i)));
        }

        /* numArr = 123 455 678
           counter[numArr[0]]++ -> counter[1]++ -> counter[1]자리에 1 들어감
           .. counter[numArr[4]]++ -> counter[5]++ -> counter[5]=1
           counter[numArr[5]]++ -> counter[5]++ -> counter[5]=2
         */
        for (int i = 0; i < numArr.length; i++) {
            counter[numArr[i]]++;
        }
        for (int i = 0; i < counter.length; i++) {
            System.out.println(i+"의 개수 =" +counter[i]);
        }
    }
}