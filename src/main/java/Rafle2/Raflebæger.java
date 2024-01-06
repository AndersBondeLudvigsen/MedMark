package Rafle2;

import java.util.ArrayList;
import java.util.Random;

public class Raflebæger {
    private int antalTerninger;
    private ArrayList <Integer> visØjne;

    public Raflebæger(int antalTerninger) {
        this.antalTerninger = antalTerninger;
        visØjne = new ArrayList<>();
    }
    public int ryst(){
        Random random = new Random();
        int samletAntalØjne = 0;
        visØjne.clear();
        for (int i = 0; i <antalTerninger ; i++) {
            int øjne = random.nextInt(6)+1;
            visØjne.add(øjne);
            samletAntalØjne += øjne;
        }
        return samletAntalØjne;
    }
    public ArrayList<Integer> se(){
        return visØjne;
    }
}
