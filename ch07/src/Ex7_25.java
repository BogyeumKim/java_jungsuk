interface Parseable {
    void parse(String fileName); // public abstract 생략
}

class XMLParser implements Parseable{
    public void parse(String fileName){
        System.out.println(fileName + "- XML parsing");
    }
}

class HTMLParse implements  Parseable{
    public void parse(String fileName){
        System.out.println(fileName + "- HTML parsing");
    }
}

class ParseManager{
    public static Parseable getParser(String type){ // 클래스가 인터페이스면 반환타입은 해당 인터페이스를 구현한 클래스여야한다!
        if(type.equals("XML")){
            return new XMLParser(); // Parseable을 구현한 XMLParser 클래스
        }else{
            Parseable p = new HTMLParse();  // Parseable을 구현한HTMLParser 클래스
            return p; // -> return new HTMLParse();
        }
    }
}


public class Ex7_25 {
    public static void main(String[] args) {
        Parseable parser = ParseManager.getParser("XML");
        parser.parse("document.xml");
        parser = ParseManager.getParser("HTML");
        parser.parse("document2.html");
    }
}
