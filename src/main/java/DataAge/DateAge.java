package DataAge;

public class DateAge {

    public int yourAge;

    public int dateAge;

    public DateAge(int yourAge, int dateAge){
        this.yourAge = yourAge;
        this.dateAge = dateAge;
    }


    public int beregn(){
        int lowest = yourAge/2+7;
        return lowest;
    }


    public boolean lovligt(){
        return dateAge >= beregn();
    }

}
