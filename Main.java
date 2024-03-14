import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {

        PriorityQueue<car> pq=new PriorityQueue<>();
        pq.add(new car(500,400));
        pq.add(new car(5000,600));
        pq.add(new car(1550,800));
        pq.add(new car(100,1000));
        pq.add(new car(250,1200));
        pq.add(new car(200,1400));
while(!pq.isEmpty()) {
    System.out.println(pq.poll());
}
    }
}
