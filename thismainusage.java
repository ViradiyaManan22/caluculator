public class thismainusage {
    String name;
    int age;

    void Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println(name); // this keyword static ma usen nathi thay sakhatu
        System.out.println(age);
    }

    public static void main(String[] args) {
        thismainusage S1 = new thismainusage();
        S1.Student("manan", 25);
    }

}
