// Weird Pizza
class WeirdPizza extends Pizza {
    private String WeirdOne;
    private String WeirdTwo;

    public WeirdPizza() {this.pizzaName = "Super Weird";}
    public void addWeirdOne(String One) {this.WeirdOne = One;}
    public void addWeirdTwo(String Two) {this.WeirdTwo = Two;}

    @Override
    public void showPizza() {
        super.showPizza();
        System.out.println("- Weird WeirdOne: " + WeirdOne);
        System.out.println("- Weird WeirdTwo: " + WeirdTwo);
    }
}