
class putr {
    int x = 23;
}

class pardaji extends putr {
    int x = 10;
}

class dadaji extends pardaji {
    int x = 12;
}

/*
 * class base extends dadaji { // upcasting ma object vonstructor ne parent
 * refernce ma nakvanu hoy e.g dadaji t3 = new dadaji()
 * int x = 29;
 * 
 * void show(putr t1, pardaji t2, dadaji t3) { // Aa che upcasting
 * System.out.println(t1.x);
 * System.out.println(t2.x);
 * System.out.println(t3.x);
 * }
 */
// jo uper mujb upcasting na karvu hoy to this typecasting pun apade paent to
// parent ni value print karavi sakiye chiye
// System.out.println(super.x); super thi to khali uperno ekj parent print thase
// pun parent na parent print karva ((class name)this).variablename)thase
class base extends dadaji { // upcasting ma object vonstructor ne parent refernce ma nakvanu hoy e.g dadaji
                            // t3 = new dadaji()
    int x = 29;

    void show() { // Aa che upcasting
        System.out.println(((base) this).x); // this type casting
        System.out.println(((pardaji) this).x);
        System.out.println(((dadaji) this).x);
    }

    public static void main(String[] args) {
        base d = new base();
        d.show();
    }
}