import java.util.List;

class Burger extends Items{
    private Items extra1;
    private Items extra2;
    private Items extra3;

    public Burger(String name, String type) {
        super(name, type);
    }

    @Override
    public String getName() {
        System.out.println();
        return super.getName() + " BURGER";
    }

    @Override
    public double getSetPrice() {
        return getPrice() +
                ((extra1 == null) ? 0 : extra1.getSetPrice()) +
                ((extra2 == null) ? 0 : extra2.getSetPrice()) +
                ((extra3 == null) ? 0 : extra3.getSetPrice());

    }

    public void printItemizedList(){
        printItems(getName(),getPrice());
        if (extra1 != null){
            extra1.printItems();
        }
        if(extra2 != null){
            extra2.printItems();
        }
        if(extra3 != null){
            extra3.printItems();
        }
    }

    public double extraToppingPrice(String extraTopping){
        return switch (extraTopping.toUpperCase()){
            case "CHEESE","TOMATO","LETTUCE" -> 18;
            case "MAYO","CHILLI","TANDORI" -> 16;
            case "PATTY","KETCHUP" -> 20;
            default -> 0;
        };
    }

    public void addExtraToppings(List<String> toppings) {
        if (!toppings.isEmpty())
            this.extra1 = new Items(toppings.get(0), "Topping", extraToppingPrice(toppings.get(0)));
        if (toppings.size() > 1)
            this.extra2 = new Items(toppings.get(1), "Topping", extraToppingPrice(toppings.get(1)));
        if (toppings.size() > 2)
            this.extra3 = new Items(toppings.get(2), "Topping", extraToppingPrice(toppings.get(2)));
    }

    @Override
    public void printItems() {
        printItemizedList();
        System.out.println("-".repeat(30));

    }

}