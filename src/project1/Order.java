package project1;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private int orderId;
    private String orderDescription;
    private List<Pizza> pizzas;
    private Double payableBillAmount;
    private String orderDate;

    public Order(int orderId, String orderDate, Double payableBillAmount, String orderDescription) {
        this.orderId = orderId;
        this.orderDescription = orderDescription;
        this.pizzas = new ArrayList<>();
        this.payableBillAmount = payableBillAmount;
        this.orderDate = orderDate;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderDescription() {
        return orderDescription;
    }

    public void setOrderDescription(String orderDescription) {
        this.orderDescription = orderDescription;
    }

    public List<Pizza> getPizzas() {
        return pizzas;
    }

    public void setPizzas(List<Pizza> pizzas) {
        this.pizzas = pizzas;
    }

    public Double getPayableBillAmount() {
        return payableBillAmount;
    }

    public void setPayableBillAmount(Double payableBillAmount) {
        this.payableBillAmount = payableBillAmount;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }
    private String allPizzas(){
        String resultString = "";
        for (int i = 0; i < pizzas.size(); i++) {
            resultString += pizzas.get(i) + ((i == pizzas.size() -1) ? "" : ", ");
        }
        return resultString;
    }

    @Override
    public String toString() {
        return "Order info: " +
                "orderId=" + orderId +
                ", orderDescription='" + orderDescription +
                ", pizzas=" + allPizzas() +
                ", payableBillAmount=" + payableBillAmount +
                ", orderDate='" + orderDate + '\'' +
                '}';
    }
}
