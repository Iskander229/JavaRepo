// Colombian Pizza
class ColombianPizza extends Pizza {
    private String x;
    private String y;
    private String z;

    public ColombianPizza() {this.pizzaName = "Colombian";}
    public void addX(String x) {
        this.x = x;
    }
    public void addY(String y) {
        this.y = y;
    }
    public void addZ(String z) {
        this.z = z;
    }

    @Override
    public void showPizza() {
        super.showPizza();
        System.out.println("- Colombian X: " + x);
        System.out.println("- Colombian Y: " + y);
        System.out.println("- Colombian Z: " + z);
    }
}