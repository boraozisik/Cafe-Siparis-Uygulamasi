
public class Drink {
	private String drinkName;
    private int drinkNumber;
    private int drinkPrice;

    public Drink(String drinkName, int drinkNumber, int drinkPrice) {
        this.drinkName = drinkName;
        this.drinkNumber = drinkNumber;
        this.drinkPrice = drinkPrice;
    }

    public String getDrinkName() {
        return drinkName;
    }

    public void setDrinkName(String drinkName) {
        this.drinkName = drinkName;
    }

    public int getDrinkNumber() {
        return drinkNumber;
    }

    public void setDrinkNumber(int drinkNumber) {
        this.drinkNumber = drinkNumber;
    }

    public int getDrinkPrice() {
        return drinkPrice;
    }
    public String getDrinkPriceWithTL() {
        String returned = this.drinkPrice + " TL";
        return returned;
    }
    public void setDrinkPrice(int drinkPrice) {
        this.drinkPrice = drinkPrice;
    }
    public void getDrinkInfo(){
        System.out.println("Menu Name: " +this.drinkName);
        System.out.println("Menu Number: " +this.drinkNumber);
        System.out.println("Menu Price: " +this.drinkPrice);
    }

}
