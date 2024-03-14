public class car implements Comparable<car> {
    int speed;
    int power;
    public car(int speed,int power){
        this.speed=speed;
        this.power=power;
    }
    public String toString(){
        return "The Speed of car is : " +speed+ " The power of car is : "+power;
    }

    @Override
    public int compareTo(car o) {
        return this.speed-o.speed;
//        if(this.power>o.power){
//            return 1;
//        }else{
//            return -1;
//        }

    }
}
