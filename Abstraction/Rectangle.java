public class Rectangle extends shape{
    double len;
    double bredth;
    public Rectangle(String col , double length,double breadth){
        this.color=col;
        this.len=length;
        this.bredth=breadth;
    }
    double area(){
        int len =10;
        int breadth=2;
        double are=(len*breadth);
        return are;

    }
    String tostring(){
        return "Rectangle color is " +super.getcolor()+" Area Of rectangle is "+area();

    }
}
