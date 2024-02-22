public class passconstructor {
    
    String carName,driverName,fuelName,stateName;
    int year,spped;
    passconstructor(String s,String y,String z)
    {
     carName =s;
     driverName = y;
     fuelName = z;
    }
    passconstructor(passconstructor s2)
    {
        carName = s2.carName;
        driverName = s2.driverName;
        fuelName = s2.fuelName;
    }
    void show(){     // constructor is copied another constructor.
        System.out.println("car name = "+ carName);
        System.out.println("driver name = "+ driverName);
        System.out.println("fuel name = "+ fuelName);
        
    }
    public static void main(String[] args) {
        passconstructor s1 = new passconstructor("manan","age","mana");
        s1.show();
        passconstructor s2 = new passconstructor(s1);  
       s2.show();
    }
}
