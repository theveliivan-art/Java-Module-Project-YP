public class Auto {
    final String name;
    final int speed;

    Auto(String name, int speed){
        this.name = name;
        this.speed = speed;
    }

    int getDistance(){ return speed*24;}
}
