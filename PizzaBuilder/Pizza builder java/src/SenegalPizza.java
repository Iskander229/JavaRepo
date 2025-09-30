// Senegal Pizza
class SenegalPizza extends Pizza {
    private String senegaliano;

    public SenegalPizza() {this.pizzaName = "Senegal";}
    public void addSenegaliano(String seneg) {this.senegaliano = seneg;}

    @Override
    public void showPizza() {
        super.showPizza();
        System.out.println("- Senegaliano: " + senegaliano);
    }
}