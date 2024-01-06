package Beer;

import java.util.ArrayList;

public class Main {
    public static int main(String[] args) {
        Beer beer1 = new Beer("Tuborg", 5, 10);
        Beer beer2 = new Beer("Tuborg", 5, 100);
        Beer beer3 = new Beer("Tuborg", 5, 2000);
        Beer beer4 = new Beer("Tuborg", 5, 300);
        beer1.setAlcoholprocentage(-2);
        System.out.println(beer1);

        ArrayList<Beer> beers = new ArrayList<>();
        beers.add(beer1);
        beers.add(beer2);
        beers.add(beer3);
        beers.add(beer4);
        int price = 0;
        for (Beer beer : beers){
            price += beer.getPrice();
        }
        return price;
    }
}
