package Tal;

import java.util.ArrayList;

public class Tal {
    private int[] talrække = {5,66,12,87,66,56,89,66};

    public int tælTal(int input) {
        int count= 0;
        for (int tal : talrække) {
            if (tal == input) {
                count++;
            }
        }
        return count;
    }

    public int gennemsnit(){
        int gennemsnit = 0;
        for (int i : talrække){
            gennemsnit += i;
        }
        return gennemsnit/talrække.length;
    }
}
