import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class bulb {
    int watt;
    float price;
    String colour;
    boolean state;
    String shap;
    static int counter;
    static String cname;

    static {
        counter = 0;
        cname = "manan";
    }

    bulb(int watt,
            float price,
            String colour,
            boolean state, String shap) {
        this.watt = watt;
        this.price = price;
        this.colour = colour;
        this.state = state;
        this.shap = shap;
    }

    void showdetail() {
        System.err.println("COMPANY NAME = " + cname);
        System.out.println(" watt = " + watt);
        System.out.println(" price = " + price);
        System.out.println(" colour = " + colour);
        System.out.println(" state = " + state);
        System.out.println(" shap =  " + shap);
        System.out.println("  ");

    }

    {
        counter++; // aa che int block je dereck object vakhte chale potani made
    } // int block ne main method ni andre lakhiye to nai chale

    void changeState() { // static bloack che te int block ni jem j chale pun te program run thata j over
        if (state == true)
            state = false;
        else
            state = true; // load thay che mainint method block karta pun

    }

    static void countBulb() {
        System.out.println("number of ready bulb = " + counter);
    }

    void changecompanyname(String cname) {
        this.cname = cname;
    }

    public static void main(String[] args) {
        System.out.println("  ");
        System.out.println(" ////bulb detail/////");
        System.out.println("  ");
        bulb b1 = new bulb(7, 30.25f, "yellow", true, "glass");
        bulb b2 = new bulb(5, 68.25f, "pink", false, "glass");
        bulb b3 = new bulb(4, 80.25f, "white", true, "plastic");
        System.out.println(" *******bulb first******");
        b1.showdetail();
        System.out.println(" *******bulb second******");
        b2.showdetail();
        System.out.println(" ********bulb second******");
        b3.changeState();
        b3.changecompanyname("neetaben");
        b3.showdetail();
        bulb.countBulb();

    }
}