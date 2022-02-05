import java.util.Scanner;

public class Ordering {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.println("Enter the Customer's name:");
        String name = input.nextLine();
        Customer customer = new Customer(name);
        String showOptions = "1- Order Menu\n" +
                "2- Order a Drink\n" +
                "3- For See Your Total Price\n" +
                "4- See the Main Options Again\n" +
                "q- Exit From the Ordering Program...";




        while(true){
            System.out.println(showOptions);

            System.out.println("Choose the option which you want to do");
            String answer = input.nextLine();
            if(answer.equals("q")){

                break;
            }
            else if (answer.equals("1")){
                String showOptions2 = "1- For order food menu\n" +
                        "2- For order dessert menu\n" +
                        "q- For Exit";
                System.out.println(showOptions2);
                System.out.println("Choose the option which you want to do");
                String answer2 = input.nextLine();
                if(answer2.equals("q")){
                    System.out.println("Exiting...");

                }
                else if (answer2.equals("1")){

                    GreenDolphinStreet.getInstance().showFoodMenu();
                    System.out.println("Enter the menu number that you want to order:");
                    int number = input.nextInt();
                    input.nextLine();
                    if(number == 1){
                        Menu menu1 = new Menu("Mixed Pizza",1, "A mixed pizza: " +
                                "Ingredients ==> Mushroom, Cheddar Cheese, Tomato, Sausage, Salami, Sausage", 45);
                        customer.orderMenu(menu1);
                    }
                    else if(number == 2){
                        Menu menu2 = new Menu("Pizza with Sausage and Cheddar",2, "A Sausage-Cheddar " +
                                "Pizza: " + "Ingredients ==> Sausage and Cheddar Cheese", 40);
                        customer.orderMenu(menu2);
                    }
                    else if(number == 3){
                        Menu menu3 = new Menu("Breakfast Plate",3, "A plate for breakfast: " +
                                "Ingredients ==> cheddar cheese, feta cheese, black olives, salami, tomato, cucumber, butter, honey, boiled egg, tea, coffee", 60);

                        customer.orderMenu(menu3);
                    }
                    else if(number == 4){
                        Menu menu4 = new Menu("Mixed Toast",4, "A mixed toast: " +
                                "Ingredients ==> cheddar cheese, sausage, potatoes, ketchup, mayonnaise, onions, tomatoes", 20);
                        customer.orderMenu(menu4);
                    }
                    else if(number == 5){
                        Menu menu5 = new Menu("Classic Burger",5, "A classic Burger: " +
                                "Ingredients ==> 150 grams of meatballs, salad, tomatoes, pickles, potatoes", 35);
                        customer.orderMenu(menu5);
                    }
                    else if(number == 6){
                        Menu menu6 = new Menu("Chicken Burger",6, "A chicken Burger: " +
                                "Ingredients ==> 150 grams of grilled chicken, salad, tomatoes, pickles, potatoes",30);
                        customer.orderMenu(menu6);
                    }
                    else if(number == 7){
                        Menu menu7 = new Menu("Steak Wrap",7, "A steak wrap: " +
                                "Ingredients ==> Beef tenderloin, cheddar cheese, pepper, mushroom, potato, onion, ranch sauce, chili sauce", 40);
                        customer.orderMenu(menu7);
                    }
                    else if(number == 8){
                        Menu menu8 = new Menu("Chicken Wrap",8, "A chicken wrap: " +
                                "Ingredients ==> 150 grams fried chicken, cheddar cheese, pepper, mushroom, potato, onion, ranch sauce, chili sauce", 35);
                        customer.orderMenu(menu8);
                    }
                    else if(number == 9){
                        Menu menu9 = new Menu("Pasta",9, "A Pasta: " +
                                "Ingredients ==> A pasta with what you love :))",25);
                        customer.orderMenu(menu9);
                    }
                    else{
                        System.out.println("Invalid Transaction!!!");

                    }

                }
                else if(answer2.equals("2")){


                    GreenDolphinStreet.getInstance().showDessertMenu();
                    System.out.println("Enter the menu number that you want to order:");
                    int number = input.nextInt();
                    input.nextLine();
                    if(number == 10){
                        Menu menu1 = new Menu("Cheesecake",10, "Cheesecake ==> with lemon, raspberry, chocolate", 17);
                        customer.orderMenu(menu1);
                    }
                    else if(number == 11){
                        Menu menu2 = new Menu("Tiramisu",11, "Tiramisu ==> a dessert with coffee", 17);
                        customer.orderMenu(menu2);
                    }
                    else if(number == 12){
                        Menu menu3 = new Menu("Brownie",12, "Brownie ==> A chocolate pleasure", 14);
                        customer.orderMenu(menu3);
                    }
                    else{
                        System.out.println("Invalid Transaction!!!");
                        break;
                    }
                }
                else{
                    System.out.println("Invalid Transaction!!!");
                    break;
                }

            }
            else if(answer.equals("2")){

                GreenDolphinStreet.getInstance().showDrinks();
                System.out.println("Enter the drink number that you want to order:");
                int number = input.nextInt();
                input.nextLine();
                if(number == 1){
                    Drink drink1 = new Drink("Espresso",1,18);
                    customer.orderDrink(drink1);
                }
                else if(number == 2){
                    Drink drink2 = new Drink("Americano",2,18);
                    customer.orderDrink(drink2);
                }
                else if(number == 3){
                    Drink drink3 = new Drink("Cappuccino",3,18);
                    customer.orderDrink(drink3);
                }
                else if(number == 4){
                    Drink drink4 = new Drink("Frappe",4,17);
                    customer.orderDrink(drink4);
                }
                else if(number == 5){
                    Drink drink5 = new Drink("Latte",5,17);
                    customer.orderDrink(drink5);
                }
                else if(number == 6){
                    Drink drink6 = new Drink("Macchiato",6,17);
                    customer.orderDrink(drink6);
                }
                else if(number == 7){
                    Drink drink7 = new Drink("Coke",7,7);
                    customer.orderDrink(drink7);
                }
                else if(number == 8){
                    Drink drink8 = new Drink("Sprite",8,6);
                    customer.orderDrink(drink8);
                }
                else if(number == 9){
                    Drink drink9 = new Drink("Fanta",9,6);
                    customer.orderDrink(drink9);
                }
                else if(number == 10){
                    Drink drink10 = new Drink("Tea",10,5);
                    customer.orderDrink(drink10);
                }
                else{
                    System.out.println("Invalid Transaction!!!");

                }
            }
            else if(answer.equals("3")){
                System.out.println("Your total price is: " +customer.getTotalPriceWithTL());
            }
            else if(answer.equals("4")){
                System.out.println(showOptions);
            }
            else{
                System.out.println("Invalid Transaction!!!");
                System.out.println("You must enter the ordering program again...");
                break;

            }
        }


        System.out.println("Exiting from the ordering program...");
        GreenDolphinStreet.getInstance().showOrderQueue();

	}

}
