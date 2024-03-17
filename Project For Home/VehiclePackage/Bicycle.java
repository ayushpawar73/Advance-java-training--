package VehiclePackage;

public class Bicycle implements Vehicle {
    int normal_speed;
    int gear;
    @Override
    public void gearchange(int gear) {
        this.gear=gear;
        System.out.println("Gear is " +gear);

    }

    public void speedup(){
        int normal_speed=50;

        System.out.println("The speed after increasing 20 kmph in normal speed = " +(normal_speed+20));
    }
    public  void brake(){
        System.out.println("These are brakes");

    }
    public String tostring(){
        return "gear : " +gear+ " The speed is : " +(normal_speed+70) ;
    }

    public static void main(String[] args) {
        Bicycle b=new Bicycle();
        b.speedup();
        b.gearchange(5);

    }
}
