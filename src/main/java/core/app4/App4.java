package core.app4;

public class App4 {
    public static void main(String[] args) {
        //spring이 객체 생성도 해주고 연결까지 해줌

    }
}

class Controller1 {
    Service1 s;

    //직접 객체 만들지 않고 불러온다. 3
    public void setS(Service1 s) {
        this.s = s;
    }

    public void method1() {
        System.out.println("요청 파라미터 분석/가공");
//        System.out.println("CRUD"); 별도 메소드로 뺀다 1x
//        Service1 s = new Service1(); //직접 객체 생성 2x
        s.crud();
    }
}

class Controller2 {
    Service1 s;

    public void setS(Service1 s) {
        this.s = s;
    }

    public void method2() {
        System.out.println("요청 분석");
//        System.out.println("CRUD");
//        Service1 s = new Service1();
        s.crud();
    }
}

class Service1 {
    public void crud() {
        System.out.println("CRUD");
    }
}