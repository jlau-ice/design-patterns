package factory;

public class Banana implements Fruit {
    @Override
    public void grow() {
        System.out.println("Banana is growing...");
    }

    @Override
    public void harvest() {
        System.out.println("Banana has been harvested!");
    }
}


