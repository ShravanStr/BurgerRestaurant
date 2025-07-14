import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String type, name;
        String size ;
        String burgerName;
        String yesNo;
        String noYes;
        String isMeal;
        String meal;
        String drinkSize;
        String sideSize;

        ArrayList<String> toppingList = new ArrayList<>(); // This allows us to store as many toppings as the user wants (without knowing the number in advance)
        boolean isMore = true;

        Scanner sc = new Scanner(System.in);

        System.out.println("""
                           Hello Sir,Welcome to the Tom Burger
                           What would you like to have:
                           1) Burger
                           2) Drink
                           3) Side
                           4)Meal
                           """);

        type = sc.nextLine().toUpperCase();

        switch (type) {
            case "DRINK" -> {
                System.out.println("""
                 Which drink you want to choose 
                 1) COKE
                 2) PEPSI
                 3) ICED TEA""");
                name = sc.next().toUpperCase();
                System.out.print("""
                Sir,Please select size:
                (SMALL/MEDIUM/LARGE) : """);
                size = sc.next().toUpperCase();
                Items drink = new Items(name, type, size);
                System.out.println();
                drink.printItems();
                System.out.printf("\nTotal: %.2f\n", drink.getSetPrice());
            }
            case "SIDE" -> {
                System.out.println("""
                                                   Which side you want to choose :
                                                   1) FRIES
                                                   2) BREAD""");
                name = sc.next().toUpperCase();
                System.out.print("""
                                                 Sir,Please select size:
                                                 (SMALL/MEDIUM/LARGE) : """);
                size = sc.next().toUpperCase();
                Items side = new Items(name, type, size);
                System.out.println();
                side.printItems();
                System.out.printf("\nTotal: %.2f\n", side.getSetPrice());
            }
            case "BURGER" -> {
                System.out.println("""
                                                   Please select the burger:
                                                   1) Aloo Tikki
                                                   2) Spicy Paneer
                                                   3)Veg Surprise""");
                burgerName = sc.nextLine().toUpperCase();
                System.out.print("\nSir do you want extra toppings (YES/NO) : ");
                yesNo = sc.nextLine().toUpperCase();
                if (yesNo.equals("YES")) {
                    while (isMore) {
                        
                        System.out.println("""
                                                                                            Here are the toppings:
                                                                   1) CHEESE,TOMATO,LETTUCE -> 18
                                                                   2) MAYO,CHILLI,TANDORI -> 16
                                                                   3) PATTY,KETCHUP -> 20""");
                        
                        String extraTopping = sc.next().toUpperCase();
                        toppingList.add(extraTopping);
                        
                        System.out.print("Do you want more toppings (YES/NO) : ");
                        noYes = sc.next().toUpperCase();
                        if (noYes.equals("NO")) isMore = false;
                    }
                }   Burger burger = new Burger(burgerName, type);
                burger.addExtraToppings(toppingList);
                sc.nextLine();  // ← Clear leftover newline
                System.out.print("Sir do you want to convert it into a meal (YES/NO): ");
                isMeal = sc.nextLine().toUpperCase();
                if (isMeal.equals("YES")) {
                    MealOrder mealOrder = new MealOrder(burger);
                    System.out.println();
                    mealOrder.printItemizedList();
                } else {
                    System.out.println();
                    burger.printItems();
                    System.out.printf("\nTotal: %.2f\n", burger.getSetPrice());
                }
            }
            case "MEAL" -> {
                System.out.println("""
                                                   Please select the meal:
                                                   1) Aloo Tikki Meal
                                                   2) Spicy Paneer Meal
                                                   3) Maharaja Meal""");
                meal = sc.nextLine().toUpperCase();
                System.out.print("Sir,please select drink size: (SMALL/MEDIUM/LARGE) :");
                drinkSize = sc.next().toUpperCase();
                System.out.print("Please select the side size (SMALL/MEDIUM/LARGE) :");
                sideSize = sc.next().toUpperCase();
            switch (meal) {
                case "ALOO TIKKI MEAL" ->                     {
                        MealOrder mealOrder = new MealOrder("Aloo Tikki", "Burger", "Coke", drinkSize, "FRIES", sideSize);
                        System.out.println("Here is your bill summary: \n");
                        mealOrder.printItemizedList();
                    }
                case "SPICY PANEER MEAL" ->                     {
                        MealOrder mealOrder = new MealOrder("SPICY PANEER", "Burger", "Coke", drinkSize, "FRIES", sideSize);
                        System.out.println("Here is your bill summary: \n");
                        mealOrder.printItemizedList();
                    }
                case "MAHARAJA MEAL" ->                     {
                        MealOrder mealOrder = new MealOrder("MAHARAJA", "Burger", "Coke", drinkSize, "FRIES", sideSize);
                        System.out.println("Here is your bill summary: \n");
                        mealOrder.printItemizedList();
                    }
                default -> {
                }
            }
            }
            default -> System.out.println("Invalid option selected.");
        }
    }
}