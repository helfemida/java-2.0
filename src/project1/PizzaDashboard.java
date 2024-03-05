package project1;

import java.util.Scanner;

public class PizzaDashboard {
    static Scanner in = new Scanner(System.in);
    static PizzaService pizzaService = new PizzaService();
    static int nextPizzaID = 0;

    public static void main(String[] args) throws PizzaNotFoundException {
        pizzaService.setPizzaStore();

        System.out.println("""
                Hi! Who u gonna be today?\s
                 1. Admin \s
                 2. Customer""");
        int n = in.nextInt();

        switch (n) {
            case 1 -> openAdminRole();
            case 2 -> openAdminRole();
        }
    }

    public static void openAdminRole() {
        System.out.println("<-------> Welcome to the admin role! <------->");
        String menu = """
                <----> Menu <---->\s
                1. Add new pizza\s
                2. Update price\s
                3. Delete pizza\s
                4. View all pizza\s
                5. Search pizza\s
                6. Exit
                """;

        while (true) {
            System.out.println(menu);
            int n = in.nextInt();

            switch (n) {
                case 1:
                    System.out.println("<----> Add Pizza <---->");

                    System.out.print("Pizza name: ");
                    in.nextLine();
                    String pizzaName = in.nextLine();

                    System.out.print("Size: ");
                    String size = in.next();

                    System.out.print("Price: ");
                    double price = in.nextDouble();

                    System.out.print("Topping name: ");
                    in.nextLine();
                    String toppingName = in.nextLine();

                    System.out.print("Topping spice level: ");
                    String spiceLevel = in.next();

                    System.out.print("Topping description: ");
                    in.nextLine();
                    String toppingDescription = in.nextLine();

                    System.out.print("Pizza base name: ");
                    String baseName = in.nextLine();

                    System.out.print("Pizza base type: ");
                    String baseType = in.nextLine();

                    System.out.print("Pizza base description: ");
                    String baseDescription = in.nextLine();

                    System.out.println("Creating a pizza, wait a bit...");

                    Topping topping = new Topping(toppingName, spiceLevel, toppingDescription);
                    PizzaBase pizzaBase = new PizzaBase(baseDescription, baseType, baseName);

                    Pizza pizza = new Pizza(nextPizzaID, pizzaName, size, price, pizzaBase, topping);

                    pizzaService.addNewPizza(pizza);

                    break;
                case 2:
                    System.out.println("<----> Update Price <---->");

                    Pizza pizzaToChange = null;

                    try {
                        pizzaToChange = searchPizza();
                    } catch (PizzaNotFoundException ex) {
                        System.out.println(ex.getMessage());
                        continue;
                    }

                    System.out.println("Enter a new price: ");
                    double newPrice = in.nextDouble();

                    pizzaService.updatePrice(pizzaToChange, newPrice);
                    System.out.println("Pizza price is changed");
                    break;
                case 3:
                    System.out.println("<----> Delete Pizza <---->");

                    Pizza pizzaToDelete = null;

                    try {
                        pizzaToDelete = searchPizza();
                    } catch (PizzaNotFoundException ex) {
                        System.out.println(ex.getMessage());
                        continue;
                    }

                    System.out.println("Are you sure to delete? [Yes/No]");
                    String answer = in.next();

                    if (answer.equalsIgnoreCase("yes")) {
                        pizzaService.deletePizza(pizzaToDelete);
                        System.out.println();
                    } else {
                        System.out.println("Returning to the main menu...");
                        continue;
                    }
                    break;
                case 4:
                    System.out.println("<----> View All Pizza <---->");
                    pizzaService.getAllPizza();
                    break;
                case 5:
                    Pizza searchingPizza = null;
                    try {
                        searchingPizza = searchPizza();
                        System.out.println(searchingPizza);
                    } catch (PizzaNotFoundException ex) {
                        System.out.println(ex.getMessage());
                    }
                    break;
                case 6:
                    System.out.println("See ya!");
                    System.exit(0);
            }
        }
    }
    public static void openCustomerMode(){
        System.out.println("<-------> Welcome to the customer role! <------->");
        String menu = """
                <----> Menu <---->\s
                1. Place order\s
                2. Pay Bill\s
                3. View all pizza\s
                4. View order history\s
                5. Search pizza\s
                6. Exit
                """;

        while(true){
            System.out.println(menu);
            int n = in.nextInt();
            switch (n){
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                default:
                    System.out.println("Choose the one from the listed");
            }
        }
    }

    public static Pizza searchPizza() throws PizzaNotFoundException {
        System.out.println("Search pizza by: \n" +
                "1. Name \n" +
                "2. ID \n" +
                "3. Size");

        int n = in.nextInt();

        switch (n) {
            case 1:
                System.out.println("Enter the pizza name: ");
                String name = in.next();
                return pizzaService.getPizzaByName(name);
            case 2:
                System.out.println("Enter the pizza id: ");
                int id = in.nextInt();
                return pizzaService.getPizzaById(id);
            case 3:
                System.out.println("Enter the pizza size: ");
                in.nextLine();
                String size = in.nextLine();
                return pizzaService.getPizzaBySize(size);
            default:
                System.out.println("Choose the option from the listed below. ");
                break;
        }
        return null;
    }

}
