import java.lang.reflect.Array;
import java.util.Arrays;

public class Ex5_10 {
    public static void main(String[] args) {
        int[] numArr = new int[10];

        for (int i = 0; i < numArr.length; i++) {
            System.out.print(numArr[i] = (int) (Math.random() * 10)); // 0~9랜덤값 출력
        }

//        Arrays.sort(numArr); // 한줄로 바로 정렬 가능
//        System.out.println(Arrays.toString(numArr));
        System.out.println("==========");

        for (int i = 0; i < numArr.length -1 ; i++) { // numArr.length = 10 , 10-1=9
           boolean changed = false;


            /* numArr = 5 9 0 6 0 9 8 7 9 9
             5,9 / 9,0 / 0,6 ... ~ 9,9 까지 numArr.length는 10이지만 9번 비교함
             비교해서 왼쪽에 더 낮은 숫자를 tmp에 저장후 넣음 5 0 0 6 ... 9 마지막엔 제일큰값 9 로 정렬 후 i ++ -> i=1
             마지막 최대값 9 나왔으니 다시 처음부터 비교 5 0 6 0 9 8 7 9 9 9 , 5 0 / 0 6 / 6 0 / 0 9 / 9 8 / 8 7 / 7 9 / 9 9
             8번 비교하니까 결과적으로 length -1 -i 만큼 비교
             */
           for(int j=0; j <numArr.length -1 -i; j++){ // 10-1-0 = 9 .. 9-1 = 8 .. 9 -2 = 7 ..
               if (numArr[j] > numArr[j + 1]) { // 5 >  9 ,  9 > 0 true [ j = 1 ]
                   int temp = numArr[j]; // tmp 0 = numArr[1] 9
                   numArr[j] = numArr[j + 1]; // numarr[1] 9 = numArr[2] 0
                   numArr[j + 1]= temp; // numArr[2] 0 = 9
                   // 5 0 9 ... ~ 7 7 9 9
                   changed = true;
               }
           } // j
            if (!changed) break;

//            for (int k = 0; k < numArr.length; k++) {
//                System.out.print(numArr[k]);
//            } // k
            System.out.println();
        } // i

        System.out.println(Arrays.toString(numArr));
    }
}