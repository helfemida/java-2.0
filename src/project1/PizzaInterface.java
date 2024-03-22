package project1;

public interface PizzaInterface {
    Pizza getPizzaBySize(String size) throws PizzaNotFoundException;
    Pizza getPizzaById(int id) throws PizzaNotFoundException;
    Pizza getPizzaByName(String name) throws PizzaNotFoundException;
    Pizza orderNewPizza(Pizza pizza, Customer customer);
    Pizza updatePrice(Pizza pizza, double newPrice);
    void deletePizza(Pizza pizza);
    Pizza addNewPizza(Pizza pizza);
}
