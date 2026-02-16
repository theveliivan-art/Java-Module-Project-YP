public class Gonka {
    int distance=0;
    String winner="";

    public void findWinner(Auto newAuto){
        if (distance<newAuto.getDistance()){
            distance = newAuto.getDistance();
            winner = newAuto.name;
        }

    }
    String winnersName(){
        return this.winner;
    }
}
