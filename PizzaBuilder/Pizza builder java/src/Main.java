//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main(String[] args) {
    ItalianPizza italian = new ItalianPizza();
    italian.makeDough("Thin Crust");
    italian.makeSauce("Tomato Basil");
    italian.makeToppings("Mozzarella");
    italian.addOliveOil("Extra Virgin");
    italian.addHerbs("Oregano");
    italian.showPizza();

    System.out.println("-------------");

    SpanishPizza spanish = new SpanishPizza();
    spanish.makeDough("Thick Crust");
    spanish.makeSauce("Spicy Tomato");
    spanish.makeToppings("Chorizo & Cheese");
    spanish.addOliveOil("Extra Virgin");
    spanish.addHerbs("Rosemary");
    spanish.addChorizo("Spanish Chorizo");
    spanish.showPizza();

    System.out.println("-------------");

    SenegalPizza senegal = new SenegalPizza();
    senegal.makeDough("Soft Bread");
    senegal.makeSauce("Spicy Pepper");
    senegal.makeToppings("Goat Cheese");
    senegal.addSenegaliano("Senegaliano Spice");
    senegal.showPizza();

    System.out.println("-------------");

    ColombianPizza colombian = new ColombianPizza();
    colombian.makeDough("Corn Flour Dough");
    colombian.makeSauce("Garlic Sauce");
    colombian.makeToppings("Chicken & Cheese");
    colombian.addX("Avocado");
    colombian.addY("Beans");
    colombian.addZ("Plantain");
    colombian.showPizza();

    System.out.println("-------------");

    WeirdPizza weird = new WeirdPizza();
    weird.makeDough("Weird Dough");
    weird.makeSauce("Weird Sauce");
    weird.makeToppings("Weird Topping");
    weird.addWeirdOne("WeirdOne ingredient");
    weird.addWeirdTwo("WeirdTwo ingredient");
    weird.showPizza();
}