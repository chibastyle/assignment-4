public class BeefBurger implements Burger {

    @Override
    public void prepare() {
        System.out.println("Preparing Beef Burger...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Beef Burger is ready!");
    }


}