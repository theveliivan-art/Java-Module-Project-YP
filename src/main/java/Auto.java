public class Auto {
    String name;
    int speed;

    Auto(String name, int speed){
        this.name = name;
        this.speed = speed;
    }

    int getDistance(){ return speed*24;}
}
