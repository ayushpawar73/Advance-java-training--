public class circle extends shape{
    double radius;
    public circle(String color,double radius){
        this.color=color;
        System.out.println("circle constructor");
        this.radius=radius;
    }
    double area(){

        double ar=3.414*radius*radius;

        return ar;
    }
    String tostring(){

        return "Circle color is " +super.getcolor()+" Area"+area();

    }

}
