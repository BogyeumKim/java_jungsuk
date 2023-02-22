package ch11;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Ex11_37 {
    public static void main(String[] args) {
        Properties prop = new Properties();
        prop.setProperty("timeout", "30");
        prop.setProperty("language", "한글");
        prop.setProperty("size", "10");
        prop.setProperty("capacity", "10");

        try {
            prop.store(new FileOutputStream("output.txt"), "Properties Exmaple");
            prop.storeToXML(new FileOutputStream("output.xml"), "Properties Exmaple"); // 한글이 포함된경우 store보단 storeToXML을 이용해 XML로 저장하자.

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
