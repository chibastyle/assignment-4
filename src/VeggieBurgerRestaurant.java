    public class VeggieBurgerRestaurant extends Restaurant {

        @Override
        public Burger createBurger() {
            System.out.println("Creating Veggie Burger...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return new VeggieBurger();
        }

    }