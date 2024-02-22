class user {

        String mo_number, name, prrof, value;
        int age;
        double hight;

    public static void main(String[] args) {
        user first = new user();
        first.show("manan","Aadhaar","71654655",25,5.89);
        first.method(first);
        user second = new user();
        second.show("ram","passport","15525465",35,7.69);
        second.method(second);
    }
     public void show(String n,String p,String m,int a,double h)
    {
        name = n;
        prrof = p;
        mo_number = m;
        age = a;
        hight = h;
    }
        public void method(user object) {
            System.out.println("name=" + object.name);
            System.out.println("prrof=" + object.prrof);
            System.out.println("mobail=" + object.mo_number);
            System.out.println(age = +object.age);
            System.out.println(hight = +object.hight);
        }

}
