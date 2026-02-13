import java.util.ArrayList;

public class Gonka {
    ArrayList<Auto> autoList;

    Gonka(ArrayList<Auto> autoList){this.autoList = autoList;}

    String winnersName(){
        Auto winnersAuto = autoList.get(0);
        for (Auto tekAuto:autoList){
            if (tekAuto.getDistance()>winnersAuto.getDistance()) {
                winnersAuto = tekAuto;
            }
        }
    return winnersAuto.name;
    }
}
