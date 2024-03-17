package Interface_Demo;

public interface IQ {
    final int a=10;
    default void display(){
        System.out.println("Hello " +(a));
    }
}
