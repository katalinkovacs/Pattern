package builderpattern;


public class PizzaHut {

    public static void main(String[] args) {
        Builder b = new Builder("large");

        b.souce("tomato");
        b.with("sausage");
        b.with("cheese");
        b.cooked();

        Pizza pizza = b.build();

        /*Pizza pizza = new Builder("medium")
                .souce("tomato")
                .with("Onion")
                .with("Sausage").cooked()
                .with("Mozzarella")
                .build();
*/


       // System.out.println(pizza.description());
    }
}
