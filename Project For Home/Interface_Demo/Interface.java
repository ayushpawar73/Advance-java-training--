package Interface_Demo;

public interface Interface {
    void fun();
    default void show(){
        System.out.println("Default");
    }
}
