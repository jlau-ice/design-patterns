package factory;

public class FactoryMethodDemo {
    public static void main(String[] args) {
        System.out.println("--- Using Apple Factory ---");
        FruitFactory appleFactory = new AppleFactory();
        Fruit apple = appleFactory.createFruit();
        apple.grow();
        apple.harvest();
        System.out.println("\n--- Using Banana Factory ---");
        FruitFactory bananaFactory = new BananaFactory();
        Fruit banana = bananaFactory.createFruit();
        banana.grow();
        banana.harvest();
        System.out.println("\n--- Adding a new fruit (e.g., Orange) ---");
    }
}


