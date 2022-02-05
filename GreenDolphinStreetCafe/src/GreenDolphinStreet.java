
import java.util.LinkedList;
import java.util.Queue;

public class GreenDolphinStreet implements ICafe {
	private int customerOrderNumber = 1;
    private Queue<Customer> customers = new LinkedList<Customer>();
    private static GreenDolphinStreet instance = new GreenDolphinStreet();

    public static GreenDolphinStreet getInstance(){
        return instance;
    }

    private GreenDolphinStreet() {


    }

    public int getCustomerOrderNumber() {
        return instance.customerOrderNumber;
    }

    public void setCustomerOrderNumber(int customerOrderNumber) {
        instance.customerOrderNumber = customerOrderNumber;
    }

    public void addToQueue(Customer customer){
        getInstance().customers.offer(customer);

    }
    public void removeFromQueue(Customer customer){
        instance.customers.poll();
    }
    public void showOrderQueue(){
        for(Customer customer: instance.customers){
            System.out.println(customer.getName());
        }
    }
    public void deliverTheOrder(Customer customer){

        Customer momentCustomer = instance.customers.peek();
            if(momentCustomer.getName() == customer.getName()){
                System.out.println("Customer " +customer.getName() +" your order is ready.You can get it!");
            }
            else{
                System.out.println("Customer " +customer.getName() +" it is not your turn!");
            }

    }

    @Override
    public void showFoodMenu() {
        Menu menu1 = new Menu("Mixed Pizza",1, "A mixed pizza: " +
                "Ingredients ==> Mushroom, Cheddar Cheese, Tomato, Sausage, Salami, Sausage", 45);

        Menu menu2 = new Menu("Pizza with Sausage and Cheddar",2, "A Sausage-Cheddar " +
                "Pizza: " + "Ingredients ==> Sausage and Cheddar Cheese", 40);

        Menu menu3 = new Menu("Breakfast Plate",3, "A plate for breakfast: " +
                "Ingredients ==> cheddar cheese, feta cheese, black olives, salami, tomato, cucumber, butter, honey, boiled egg, tea, coffee", 60);

        Menu menu4 = new Menu("Mixed Toast",4, "A mixed toast: " +
                "Ingredients ==> cheddar cheese, sausage, potatoes, ketchup, mayonnaise, onions, tomatoes", 20);

        Menu menu5 = new Menu("Classic Burger",5, "A classic Burger: " +
                "Ingredients ==> 150 grams of meatballs, salad, tomatoes, pickles, potatoes", 35);

        Menu menu6 = new Menu("Chicken Burger",6, "A chicken Burger: " +
                "Ingredients ==> 150 grams of grilled chicken, salad, tomatoes, pickles, potatoes",30);


        Menu menu7 = new Menu("Steak Wrap",7, "A steak wrap: " +
                "Ingredients ==> Beef tenderloin, cheddar cheese, pepper, mushroom, potato, onion, ranch sauce, chili sauce", 40);

        Menu menu8 = new Menu("Chicken Wrap",8, "A chicken wrap: " +
                "Ingredients ==> 150 grams fried chicken, cheddar cheese, pepper, mushroom, potato, onion, ranch sauce, chili sauce", 35);

        Menu menu9 = new Menu("Pasta",9, "A Pasta: " +
                "Ingredients ==> A pasta with what you love :))",25);

        menu1.getMenuInfo();
        System.out.println("---------------------------------------------------------------------------------");
        menu2.getMenuInfo();
        System.out.println("---------------------------------------------------------------------------------");
        menu3.getMenuInfo();
        System.out.println("---------------------------------------------------------------------------------");
        menu4.getMenuInfo();
        System.out.println("---------------------------------------------------------------------------------");
        menu5.getMenuInfo();
        System.out.println("---------------------------------------------------------------------------------");
        menu6.getMenuInfo();
        System.out.println("---------------------------------------------------------------------------------");
        menu7.getMenuInfo();
        System.out.println("---------------------------------------------------------------------------------");
        menu8.getMenuInfo();
        System.out.println("---------------------------------------------------------------------------------");
        menu9.getMenuInfo();
        System.out.println("*********************************************************");
    }

    @Override
    public void showDessertMenu() {
        Menu menu1 = new Menu("Cheesecake",10, "Cheesecake ==> with lemon, raspberry, chocolate", 17);
        Menu menu2 = new Menu("Tiramisu",11, "Tiramisu ==> a dessert with coffee", 17);
        Menu menu3 = new Menu("Brownie",12, "Brownie ==> A chocolate pleasure", 14);

        menu1.getMenuInfo();
        System.out.println("---------------------------------------------------------------------------------");
        menu2.getMenuInfo();
        System.out.println("---------------------------------------------------------------------------------");
        menu3.getMenuInfo();
        System.out.println("***************************");

    }

    @Override
    public void showDrinks() {
        Drink drink1 = new Drink("Espresso",1,18);
        Drink drink2 = new Drink("Americano",2,18);
        Drink drink3 = new Drink("Cappuccino",3,18);
        Drink drink4 = new Drink("Frappe",4,17);
        Drink drink5 = new Drink("Latte",5,17);
        Drink drink6 = new Drink("Macchiato",6,17);
        Drink drink7 = new Drink("Coke",7,7);
        Drink drink8 = new Drink("Sprite",8,6);
        Drink drink9 = new Drink("Fanta",9,6);
        Drink drink10 = new Drink("Tea",10,5);

        drink1.getDrinkInfo();
        System.out.println("---------------------------------------------------------------------------------");
        drink2.getDrinkInfo();
        System.out.println("---------------------------------------------------------------------------------");
        drink3.getDrinkInfo();
        System.out.println("---------------------------------------------------------------------------------");
        drink4.getDrinkInfo();
        System.out.println("---------------------------------------------------------------------------------");
        drink5.getDrinkInfo();
        System.out.println("---------------------------------------------------------------------------------");
        drink6.getDrinkInfo();
        System.out.println("---------------------------------------------------------------------------------");
        drink7.getDrinkInfo();
        System.out.println("---------------------------------------------------------------------------------");
        drink8.getDrinkInfo();
        System.out.println("---------------------------------------------------------------------------------");
        drink9.getDrinkInfo();
        System.out.println("---------------------------------------------------------------------------------");
        drink10.getDrinkInfo();
        System.out.println("*********************************************************");



    }

}
