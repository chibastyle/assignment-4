import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Burger Restaurant!");

        boolean exit = false;
        while (!exit) {
            System.out.println("Choose your burger:");
            System.out.println("1. Beef Burger");
            System.out.println("2. Veggie Burger");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1, 2, or 3 to exit): ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    orderBurger(new BeefBurgerRestaurant());
                    break;
                case 2:
                    orderBurger(new VeggieBurgerRestaurant());
                    break;
                case 3:
                    exit = true;
                    System.out.println("Thank you for visiting!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
            }
        }

        scanner.close();
    }

    private static void orderBurger(Restaurant restaurant) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        restaurant.orderBurger();
    }
}
