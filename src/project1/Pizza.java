package project1;

public class Pizza {
    private String pizzaName;
    private int pizzaId;
    private String size;
    private Double price;
    private PizzaBase pizzaBase;
    private Topping topping;

    public Pizza(int pizzaId, String pizzaName, String size, Double price, PizzaBase pizzaBase, Topping topping) {
        this.pizzaName = pizzaName;
        this.pizzaId = pizzaId;
        this.size = size;
        this.price = price;
        this.pizzaBase = pizzaBase;
        this.topping = topping;
    }

    public String getPizzaName() {
        return pizzaName;
    }

    public void setPizzaName(String pizzaName) {
        this.pizzaName = pizzaName;
    }

    public int getPizzaId() {
        return pizzaId;
    }

    public void setPizzaId(int pizzaId) {
        this.pizzaId = pizzaId;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public PizzaBase getPizzaBase() {
        return pizzaBase;
    }

    public void setPizzaBase(PizzaBase pizzaBase) {
        this.pizzaBase = pizzaBase;
    }

    public Topping getTopping() {
        return topping;
    }

    public void setTopping(Topping topping) {
        this.topping = topping;
    }

    @Override
    public String toString() {
        return "Pizza info: " +
                "pizzaName=" + pizzaName +
                ", pizzaId=" + pizzaId +
                ", size=" + size +
                ", price=" + price +
                "\n" + pizzaBase +
                "\n" + topping;
    }
}
