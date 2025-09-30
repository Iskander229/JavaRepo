class ItalianPizza extends Pizza {
    private String oliveOil;
    private String herbs;

    public ItalianPizza() {this.pizzaName = "Italian";}
    public void addOliveOil(String oil) {this.oliveOil = oil;}
    public void addHerbs(String herbs) {this.herbs = herbs;}

    @Override
    public void showPizza() {
        super.showPizza();
        System.out.println("- Olive Oil: " + oliveOil);
        System.out.println("- Herbs: " + herbs);
    }
}

