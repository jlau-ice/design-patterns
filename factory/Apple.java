package factory;

public class Apple implements Fruit{
    @Override
    public void grow() {
        System.out.println("Apple is growing...");
    }

    @Override
    public void harvest() {
        System.out.println("Apple has been harvested!");
    }
}


