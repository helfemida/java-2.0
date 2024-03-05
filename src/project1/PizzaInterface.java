package project1;

public interface PizzaInterface {
    public Pizza getPizzaBySize(String size) throws PizzaNotFoundException;
    public Pizza getPizzaById(int id) throws PizzaNotFoundException;
    public Pizza getPizzaByName(String name) throws PizzaNotFoundException;
    public Pizza orderNewPizza(Pizza pizza, Customer customer);
    public Pizza updatePrice(Pizza pizza, double newPrice);
    public void deletePizza(Pizza pizza);
    public Pizza addNewPizza(Pizza pizza);
}
