
public class car {
    String location_of_car;
    float price;
    String colour;
    String state;
    String car_name;
    static int counter;
    static String cname;

    static {
        counter = 0;
        cname = "manan";
    }

    car(String location_of_car,
            float price,
            String colour,
            String state, String car_name) {
        this.location_of_car = location_of_car;
        this.price = price;
        this.colour = colour;
        this.state = state;
        this.car_name = car_name;
    }

    void showdetail() {
        System.err.println("COMPANY NAME = " + cname);
        System.out.println(" location_of_car = " + location_of_car);
        System.out.println(" price = " + price);
        System.out.println(" colour = " + colour);
        System.out.println(" state = " + state);
        System.out.println(" car name =  " + car_name);
        System.out.println("  ");

    }

    {
        counter++; // aa che int block je dereck object vakhte chale potani made
    } // int block ne main method ni andre lakhiye to nai chale

    void changeState() { // static bloack che te int block ni jem j chale pun te program run thata j over
        if (state == "1")
            state = "run";
        else
            state = "no run"; // load thay che mainint method block karta pun

    }

    static void countcar() {
        System.out.println("number of ready car = " + counter);
    }

    void changecompanyname(String cname) {
        this.cname = cname;

    }

    public static void main(String[] args) {
        System.out.println("  ");
        System.out.println(" ///// car detail/////");
        System.out.println("  ");
        car b1 = new car("india", 300000f, "yellow", "1", "roseroyal");
        car b2 = new car("canada", 680000f, "pink", "0", "lambrgi");
        car b3 = new car("america", 80000f, "white", "1", "farari");
        System.out.println(" *******car  first******");
        b1.changeState();
        b1.showdetail();
        System.out.println(" *******car second******");
        b2.changeState();
        b2.showdetail();
        System.out.println(" ********car second******");
        b3.changeState();
        b3.changecompanyname("neetaben");
        b3.showdetail();
        car.countcar();

    }
}