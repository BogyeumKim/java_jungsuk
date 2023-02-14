public class Ex7_15 {
    public static void main(String[] args) {


    Car15 car = null;
    FireEngine15 fe = new FireEngine15();
    FireEngine15 fe2 = null;

    fe.water();

    car = fe; // car을 fe 객체에 참조시킴
//    car.water(); 에러, Car에는 water가 없음
        /*
        참조변수 형변환은 인스턴스에서 사용할수있는 멤버의 개수만 조절하는것뿐임.
        11line에서 car는 fe 객체를 참조하고있음. ( 0x 200 )
        fe2는 0x300을 참고하고있는데 fe2(0x300) = car ( 0x200)과 참조하는곳이 다르니까 FireEngin15로 통합해줌
         */
//    fe2.water();
    fe2 = (FireEngine15) car;
    fe2.water();

    }
}

class Car15{
    String color;
    int door;

    void dirve(){
        System.out.println("운전중");
    }
}

class FireEngine15 extends Car15{
    void water(){
        System.out.println("물뿌리기");
    }
}
