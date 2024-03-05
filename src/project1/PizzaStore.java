package project1;

import java.util.List;

public class PizzaStore {
    private int storeId;
    private String storeName;
    private String storeLocation;
    private List<Customer> customersList;
    private List<Pizza> pizzasList;

    public PizzaStore(int storeId, String storeName, String storeLocation, List<Customer> customersList, List<Pizza> pizzasList) {
        this.storeId = storeId;
        this.storeName = storeName;
        this.storeLocation = storeLocation;
        this.customersList = customersList;
        this.pizzasList = pizzasList;
    }
    public void addPizza(Pizza pizza){
        pizzasList.add(pizza);
    }
    public void addCustomer(Customer customer){
        customersList.add(customer);
    }

    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getStoreLocation() {
        return storeLocation;
    }

    public void setStoreLocation(String storeLocation) {
        this.storeLocation = storeLocation;
    }

    public List<Customer> getCustomersList() {
        return customersList;
    }

    public void setCustomersList(List<Customer> customersList) {
        this.customersList = customersList;
    }

    public List<Pizza> getPizzasList() {
        return pizzasList;
    }

    public void setPizzasList(List<Pizza> pizzasList) {
        this.pizzasList = pizzasList;
    }
    private String allCustomers(){
        String resultString = "";
        for (int i = 0; i < customersList.size(); i++) {
            resultString += customersList.get(i) + ((i == customersList.size() -1) ? "" : ", ");
        }
        return resultString;
    }
    private String allPizzas(){
        String resultString = "";
        for (int i = 0; i < pizzasList.size(); i++) {
            resultString += pizzasList.get(i) + ((i == pizzasList.size() -1) ? "" : ", ");
        }
        return resultString;
    }

    @Override
    public String toString() {
        return "PizzaStore info: " +
                "storeId=" + storeId +
                ", storeName='" + storeName +
                ", storeLocation='" + storeLocation +
                ", customersList=" + allCustomers() +
                ", pizzasList=" + allPizzas();
    }
}
