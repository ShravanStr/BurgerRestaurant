class Items{
    protected String name;
    private final String type;
    private String size;
    private double price;

    public Items(String name, String type, String size) {
        this.name = name.toUpperCase();
        this.type = type.toUpperCase();
        this.size = size.toUpperCase();
    }

    public Items(String name, String type,double price) {
        this.name = name.toUpperCase();
        this.type = type.toUpperCase();
        this.price = price;
    }

    public Items(String name, String type) {
        this.name = name.toUpperCase();
        this.type = type.toUpperCase();
    }

    public String getName() {
        if(type.equals("SIDE") || type.equals("DRINK")){
            return size + " " + name;
        }
        return name;
    }

    public double getPrice() {
        switch (type) {
            case "DRINK" -> {
                return switch (name){
                    case "COKE" -> 75;
                    case "PEPSI" -> 70;
                    case "ICED TEA" -> 80;
                    default -> 0;
                };
            }
            case "SIDE" -> {
                return switch (name){
                    case "FRIES" -> 85;
                    case "BREAD" -> 75;
                    default -> 0;
                };
            }
            case "BURGER" -> {
                return switch (name){
                    case "ALOO TIKKI" -> 60;
                    case "SPICY PANEER" -> 130;
                    case "VEG SURPRISE" -> 90;
                    case "MAHARAJA" -> 200;
                    default -> 0;
                };
            }
            case "TOPPING" -> {
                return price;
            }
            default -> {
            }
        }
        return 0;
    }

    public double getSetPrice(){
        if(type.equals("SIDE") || type.equals("DRINK")){
            return switch (size){
                case "SMALL" -> getPrice() - 15;
                case "MEDIUM" -> getPrice() + 15;
                case "LARGE" -> getPrice() + 25;
                default -> getPrice();
            };
        }
        return getPrice();
    }

    public static void printItems(String name,double price){
        System.out.printf("%s : %.2f\n",name,price);
    }


    public void printItems(){
        printItems(getName(),getSetPrice());
    }
}