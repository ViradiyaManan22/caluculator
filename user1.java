
class user1 {

    String mo_number, name, prrof, value;
    int age;
    double hight;

    public user1(String n, String p, String m, int a, double h) {
        name = n;
        prrof = p;
        mo_number = m;
        age = a;
        hight = h;
    }

    public static void main(String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.println("name..");
        String n = s.next();
        System.out.println("prrof..");
        String p = s.next();
        System.out.println("mobile..");
        String m = s.next();
        System.out.println("age..");
        int a = s.nextInt();
        System.out.println("hight..");
        double h = s.nextDouble();
        // first.show(n, p, m, a, h);
        user1 first = new user1(n, p, m, a, h);
        first.method(first);
        System.out.println("************************");
        System.out.println("name..");
        String n1 = s.next();
        System.out.println("prrof..");
        String p1 = s.next();
        System.out.println("mobile..");
        String m1 = s.next();
        System.out.println("age..");
        int a1 = s.nextInt();
        System.out.println("hight..");
        double h1 = s.nextDouble(); // this also applicable for build anotheer mehod
        // second.show(n1, p1, m1, a1,h1);
        user1 second = new user1(n1, p1, m1, a1, h1);
        second.method(second);
        s.close();
    }

    public void method(user1 object) {
        System.out.println("name = " + object.name);
        System.out.println("prrof = " + object.prrof);
        System.out.println("mobail = " + object.mo_number);
        System.out.println(age = +object.age);
        System.out.println(hight = +object.hight);
    }

}