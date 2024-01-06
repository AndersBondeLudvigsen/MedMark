package Rafle;

import java.util.ArrayList;
import java.util.Random;

public class Raflebæger {
    private int antalTerninger;
    private Random random = new Random();

    public ArrayList<Integer> getTerninger() {
        return terninger;
    }

    private ArrayList<Integer> terninger = new ArrayList<>();


    public Raflebæger(int antalTerninger){
        this.antalTerninger = antalTerninger;
    }

    public int ryst(){
        int sum= 0;
        terninger.clear();
        for (int i = 0; i <antalTerninger ; i++) {
            i = random.nextInt(6);
            sum += i;
            terninger.add(i);
        }
        return sum;
    }


}
