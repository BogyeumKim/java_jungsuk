import java.util.Arrays;

public class Ex9_29 {
    public static void main(String[] args) {


        for (int i = 0; i < 10; i++) {
            System.out.print(getRand(5, 10) + ",");
        }
        System.out.println();

        int[] result = fileRand(new int[10], new int[]{2, 3, 7, 5});
        System.out.println(Arrays.toString(result)); // 2,3,7,5 숫자로만 뽑아서 배열에 넣음

        int[] result2 = fileRand(new int[10], 0,10);
        System.out.println(Arrays.toString(result2)); // 0~10 숫자중 랜덤뽑아서 배열에 넣음

    }



    static int[] fileRand(int[] arr, int from, int to){ // from~ to 범위의 값들을 arr에 넣음.
        for (int i = 0; i < arr.length; i++) {
            arr[i] = getRand(from, to);
        }
        return arr;
    }
    static int[] fileRand(int[] arr, int[] data) { // data값들을 arr에 넣음
        for (int i = 0; i < arr.length; i++) {
            arr[i] = data[getRand(0,data.length-1)]; // getRand는 0~3 사이만 나오니까 data[0]=2 / data[1] = 3 / data[2] = 7 / data[3] =5 중 랜덤으로 배열에 저장후 대입
        }
        return arr;
    }

    static int getRand(int from, int to) { // from ~ to 사이의 정수값을 얻어옴.
//        System.out.println((int)(Math.random() * (Math.abs(to-from)+1)));
        return (int)(Math.random() * (Math.abs(to-from)+1)) + Math.min(from,to);

    }
}
      /*

( 예제와같이 from = 5 , to = 10 기준 )

1번 ( Math.random() * (Math.abs(to-from)+1 )

2번 + Math.min(from,to)

3번 (int) 형변환

계산해보면

random() * 5 +1 -> 1~5 사이의 범위

1~5 중 + 5 [ min값 ] 최소 6 최대 10

문제는 최소값이 5부터인데 뭘까

*/