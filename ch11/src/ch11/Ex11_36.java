package ch11;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class Ex11_36 {
    public static void main(String[] args) {
        // commandline에서 inputfile을 지정해주지 않으면 프로그램 종료

        args[0]="./ch11/src/ch11/input.txt";
        if(args.length !=1 ){
            System.out.println("USAGE : java Properties Ex2 INPUTFILENAME");
            System.exit(0);
        }

        Properties prop = new Properties();
        String inputFile = args[0];

        try {
            prop.load(new FileInputStream(inputFile));
        } catch (IOException e) {
            System.out.println("지정된 파일을 찾을수 없음.");
            System.exit(0);
        }

        String name = prop.getProperty("name");
        String[] data = prop.getProperty("data").split(",");
        int max = 0, min = 0, sum =0;

        for (int i = 0; i < data.length; i++) {
            int intValue = Integer.parseInt(data[i]);
            if (i == 0) {
                max = min = intValue; // data[0]값이 for분 1순위니까 intValue에 data[0]값이 들어옴. 그후 min에 넣고 그걸 max에 다시 넣어 초기화시켜줌(아래 계산을위해)
            }
            /* 1,9,9,5 .. ~ 4
            i=1 일때 intValue=9
            max값은 i=0일때 data[0]=1 로 들어감.
            1<9 -> max에 9 ...
            */
            if(max < intValue) {
                max = intValue;
            }
            else if (min> intValue) {
                min = intValue;
            }

            sum = sum+intValue;
        }
        System.out.println("이름 :" + name);
        System.out.println("최대값 :" + max);
        System.out.println("최소값 :" + min);
        System.out.println("합계 :" + sum);
        System.out.println("평균 :" + (sum * 100.0 / data.length) / 100);
    }
}
