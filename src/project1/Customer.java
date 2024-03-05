package project1;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private int customerId;
    private String customerName;
    private Address address;
    private long mobile;
    private String email;
    private List<Order> ordersList;

    public Customer(int customerId, String customerName, Address address, long mobile, String email) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.address = address;
        this.mobile = mobile;
        this.email = email;
        ordersList = new ArrayList<>();
    }
    public void addOrder(Order order){
        ordersList.add(order);
    }
    public double getPayableBillAmount(){
        return ordersList.get(ordersList.size() - 1).getPayableBillAmount();
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public long getMobile() {
        return mobile;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Order> getOrdersList() {
        return ordersList;
    }

    public void setOrdersList(List<Order> ordersList) {
        this.ordersList = ordersList;
    }
    
    private String allOrders(){
        String orders = "";
        for (int i = 0; i < ordersList.size(); i++) {
            orders += ordersList.get(i) + ((i == ordersList.size() - 1) ? "" : ", ");
        }
        return orders;
    }

    @Override
    public String toString() {
        return "Customer info: " +
                "customerId=" + customerId +
                ", customerName='" + customerName  +
                ", address=" + address +
                ", mobile=" + mobile +
                ", email='" + email +
                ", orders=" + allOrders();
    }
}
