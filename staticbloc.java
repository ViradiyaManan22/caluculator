public class staticbloc {
    int x = 23;
    static int y = 32;

    staticbloc(int x) {
        System.out.println(x);
    }

    {
        System.out.println("inblockn1");
    }
    {
        System.err.println("intblock");
    }
    static {
        y = 22;
        new staticbloc(12); // int block hamesa constructor ni pela chale
                            // sauthi pela to static j chale pachi bija badha chale.
        System.out.println(y);
    }

    public static void main(String[] args) {
        System.out.println("manna");
    }

    static { // stsck block pela chale che main thin pun and int block thj=i pun joisu next
             // program ma.
        System.out.println("dhoni");

    }
}
