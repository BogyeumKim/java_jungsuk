import java.util.Arrays;
import java.util.StringTokenizer;

public class Ex9_42 {

    public static void main(String[] args) {
        String data = "100,,200,300";

        String[] result = data.split(",");
        System.out.println("split으로 자른결과(빈문자열 포함됨)"+Arrays.toString(result));

        StringTokenizer st = new StringTokenizer(data, ",");

        for (int i = 0; i < result.length; i++) {
            System.out.printf(result[i] + "|");
        }
        System.out.println("개수 :" + result.length);

        int i=0;
        for (; st.hasMoreTokens(); i++) {
            System.out.print(st.nextToken() + "|");
        }
        System.out.println("개수 :"+i);
    } /*split 은 데이터를 토큰으로 잘라낸후 배열에 담아 변환하기때문에 StringTokenizer보다 성능이 떨어진다.
    하지만 데이터 양이 많은경우가 아니라면 그냥 split 쓰자. 또는 위 예제처럼 빈 문자열처리할때 사용.*/
}
