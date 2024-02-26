public abstract class Restaurant {

    public void orderBurger() {
        System.out.println("Ordering Burger...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Burger burger = createBurger();
        burger.prepare();
    }

    public abstract Burger createBurger();

}