package factory;

public class AppleFactory implements FruitFactory {
    @Override
    public Fruit createFruit() {
        System.out.println("AppleFactory is creating an Apple.");
        return new Apple();
    }
}


