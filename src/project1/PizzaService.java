package project1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PizzaService implements PizzaInterface {
    private String pizzaNotFoundMessage = "The pizza you're searching for is not find.";
    private PizzaStore store;
    private int ordersId = 0;
    @Override
    public Pizza getPizzaBySize(String size) throws PizzaNotFoundException {
        List<Pizza> pizzas = store.getPizzasList();

        for(int i = 0; i < pizzas.size(); i++){
            if(pizzas.get(i).getSize().equalsIgnoreCase(size)){
                return pizzas.get(i);
            }
        }
        throw new PizzaNotFoundException(pizzaNotFoundMessage);
    }

    @Override
    public Pizza getPizzaById(int id) throws PizzaNotFoundException {
        List<Pizza> storePizzas = store.getPizzasList();
        for (Pizza pizza: storePizzas) {
            if(pizza.getPizzaId() == id) {
                return pizza;
            }
        }
        throw new PizzaNotFoundException(pizzaNotFoundMessage);
    }

    @Override
    public Pizza getPizzaByName(String name) throws PizzaNotFoundException {
        List<Pizza> storePizzas = store.getPizzasList();
        for (Pizza pizza: storePizzas) {
            if(pizza.getPizzaName().equalsIgnoreCase(name)) {
                return pizza;
            }
        }
        throw new PizzaNotFoundException(pizzaNotFoundMessage);
    }

    @Override
    public Pizza orderNewPizza(Pizza pizza, Customer customer) {
        String orderDescription = "ordered pizza: " + pizza.getPizzaName() +
                ", order bill: " + pizza.getPrice() +
                ", customer name: " + customer.getCustomerName();
        Order order = new Order(ordersId, new Date() + "", pizza.getPrice(), orderDescription);
        customer.addOrder(order);
        ordersId++;
        System.out.println("Order successfully added! ");
        return pizza;
    }

    @Override
    public Pizza updatePrice(Pizza pizza, double newPrice) {
        pizza.setPrice(newPrice);
        System.out.println("Pizza price updated! ");
        return null;
    }

    @Override
    public void deletePizza(Pizza pizza) {
        store.getPizzasList().remove(pizza);
        System.out.println("Pizza removed! ");
    }

    @Override
    public Pizza addNewPizza(Pizza pizza) {
        store.getPizzasList().add(pizza);
        System.out.println("Pizza added! ");
        return pizza;
    }
    public void setPizzaStore(){
        this.store = new PizzaStore(1, "Alaskas Pizza Store", "Oslo", new ArrayList<>(), new ArrayList<>());
    }
    public void getAllPizza(){
        List<Pizza> pizzas = store.getPizzasList();
        for (Pizza pizza : pizzas) {
            System.out.println(pizza.toString());
            System.out.println();
        }
    }
}
