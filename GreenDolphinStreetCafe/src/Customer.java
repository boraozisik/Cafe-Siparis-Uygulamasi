import java.util.ArrayList;

public class Customer {
	
	private String name;
    private int orderNumber;

    ArrayList<Menu> orderedMenus;
    ArrayList<Drink> orderedDrinks;
    private int totalPrice;


    public Customer(String name) {//gdsCustomer gerek yok buna baðlý iþlemleri instance ile yap
        this.name = name;

        this.totalPrice = 0;
        this.orderedMenus = new ArrayList<Menu>();
        this.orderedDrinks = new ArrayList<Drink>();

    }

    public int getTotalPrice() {
        return totalPrice;
    }
    public String getTotalPriceWithTL() {
        String returned = this.totalPrice + " TL";
        return returned;
    }
    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }



    public void orderMenu(Menu menu){
        this.orderNumber = GreenDolphinStreet.getInstance().getCustomerOrderNumber();
        GreenDolphinStreet.getInstance().setCustomerOrderNumber(this.orderNumber + 1);
        GreenDolphinStreet.getInstance().addToQueue(this);
        this.orderedMenus.add(menu);
        this.totalPrice += menu.getMenuPrice();
        System.out.println("Your order has been received!");
    }
    public void orderDrink(Drink drink){
        this.orderNumber = GreenDolphinStreet.getInstance().getCustomerOrderNumber();
        GreenDolphinStreet.getInstance().setCustomerOrderNumber(this.orderNumber + 1);
        GreenDolphinStreet.getInstance().addToQueue(this);
        this.orderedDrinks.add(drink);
        this.totalPrice += drink.getDrinkPrice();
        System.out.println("Your order has been received!");

    }


}
