package Beer;

public class Beer {
    private String name;
    private double alcoholprocentage;
    private int price;

    public Beer(String name, double alcoholprocentage, int price) {
        this.name = name;
        this.alcoholprocentage = alcoholprocentage;
        this.price = price;
    }
    public int getPrice(){
        return price;
    }

    public void setAlcoholprocentage(double alcoholprocentage){
        if (alcoholprocentage< 0.0 || alcoholprocentage > 100){
            throw new IllegalArgumentException("Tast noget andet");
        }
        else this.alcoholprocentage = alcoholprocentage;
    }
    public void setPrice(int price){
        if (price< 0){
            throw new IllegalArgumentException("Tast noget andet");
        }
        else this.price =price;
    }
}
