class MealOrder {
    private final Burger burger;
    private final Items drink;
    private final Items side;


    public MealOrder(Burger burger) {
        this.burger = burger;
        this.drink = new Items("COKE", "DRINK", "MEDIUM");
        this.side = new Items("FRIES", "SIDE", "MEDIUM");
    }
    
    public MealOrder(String burgerName,String type,String drinkName,String drinkSize,String sideName,String sideSize){
        this.burger = new Burger(burgerName,type);
        this.drink = new Items(drinkName,"DRINK",drinkSize);
        this.side = new Items(sideName,"SIDE",sideSize);
    }

    public MealOrder(Burger burger, Items drink, Items side) {
        this.burger = burger;
        this.drink = drink;
        this.side = side;
    }

    public double getTotalPrice(){
        return burger.getSetPrice() + drink.getSetPrice() + side.getSetPrice();
    }

    public void printItemizedList() {
        burger.printItems();
        drink.printItems();
        side.printItems();
        System.out.println("-".repeat(30));
        Items.printItems("Total Price", getTotalPrice());
    }
}