class Pizza {
    protected String dough;
    protected String sauce;
    protected String topping;
    protected String extra;
    protected String pizzaName;

    public void makeDough(String dough) {this.dough = dough;}
    public void makeSauce(String sauce) {this.sauce = sauce;}
    public void makeToppings(String topping) {this.topping = topping;}
    public void addExtra(String extra) {this.extra = extra;}

    public void showPizza() {
        System.out.println("Pizza " + pizzaName + " with:");
        System.out.println("- Dough: " + dough);
        System.out.println("- Sauce: " + sauce);
        System.out.println("- Topping: " + topping);
        if (extra != null) System.out.println("- Extra: " + extra);
    }
}