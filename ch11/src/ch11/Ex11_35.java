package ch11;

import java.util.Enumeration;
import java.util.Properties;

public class Ex11_35 {
    public static void main(String[] args) {
        Properties prop = new Properties();

        // prop에 키와 값 을 저장
        prop.setProperty("timeout", "30");
        prop.setProperty("language", "kr");
        prop.setProperty("size", "10");
        prop.setProperty("capacity", "10");

        // prop는 요소를 꺼낼때 Enumeration을 이용해야함
        Enumeration e = prop.propertyNames();

        while (e.hasMoreElements()) {
            String element = (String) e.nextElement();
            System.out.println(element + "=" + prop.getProperty(element));
        }

        System.out.println();
        prop.setProperty("szie", "20");
        System.out.println("size = " + prop.getProperty("size"));
        System.out.println("capacity = " + prop.getProperty("capacity", "20"));
        System.out.println("loadfactor = " + prop.getProperty("loadfactor", "0.75")); // 저장된 key가 없으면 dafualtValue 반환
        System.out.println(prop + " prop 출력 ");
        prop.list(System.out);
    }
}
