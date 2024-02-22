class object {
    String mo_number, name, prrof, value;
    int age;

    public static void main(String args[]) {
        object firsObject = new object();
        System.out.println("******first object");
        firsObject.name = "manan";
        firsObject.prrof = "adthar";
        firsObject.mo_number = "7016284618";
        firsObject.age = 20;
        method(firsObject);
        object second = new object();
        System.out.println("******second object******");
        second.name = "ram";
        second.age = 25;
        second.mo_number = "578+558858";
        second.prrof = "passport";
        second.value = "yes";
        method(second);

    }

    static void method(object obj) {
        System.out.println("name=" + obj.name);
        System.out.println("prrof=" + obj.prrof);
        System.out.println("mobail=" + obj.mo_number);
        System.out.println("age=" + obj.age);

    }
}
