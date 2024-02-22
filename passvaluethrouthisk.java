class M {
    static void m(A a1) {
        System.out.println("manan2");
        a1.disp();
    }
}

class A {
    void show() {
        System.out.println("manan");
        M.m(this);   // this keyword use to for pass method argument reter the current object.
    }

    void disp() {
        System.out.println("manan1");
    }

}

public class passvaluethrouthisk {

    public static void main(String[] args) {
        A t = new A();
        t.show();
    }
}