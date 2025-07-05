package factory;

public class BananaFactory implements FruitFactory{

    @Override
    public Fruit createFruit() {
        System.out.println("BananaFactory is creating a Banana.");
        return new Banana();
    }
}


