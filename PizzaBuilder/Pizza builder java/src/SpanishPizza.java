// Spanish Pizza
class SpanishPizza extends ItalianPizza {
    private String chorizo;

    public SpanishPizza() {this.pizzaName = "Spanish";}
    public void addChorizo(String chorizo) {this.chorizo = chorizo;}

    @Override
    public void showPizza() {
        super.showPizza();
        System.out.println("- Extra Spanish: " + chorizo);
    }
}