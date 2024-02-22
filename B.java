class B {
    int x = 19;
    int k = 15;
    int f = 25; // Instance variable
    static int y = 10; // Static variable

    void show() {
        System.out.println(k);
        System.out.println(new B().f);
    }

    void hi() {
        show();
        System.out.println(new B().k);
        System.out.println(f);
    }

    B() {
        System.out.println(x);
    }

    static void disp() {
        System.out.println(new B().y);

    }

    public static void main(String[] args) { // Corrected signature
        B b = new B();
        System.out.println(b.y);
        disp();
        // B.disp();
        new B().hi();
    }
}
