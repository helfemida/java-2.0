package project1_copy;


public class Topping { //instance
    private String toppingName;
    private String description;
    private String spiceLevel;

    public Topping(String toppingName, String description, String spiceLevel){
        this.toppingName = toppingName;
        this.description = description;
        this.spiceLevel = spiceLevel;
    }
    @Override
    public String toString() {
        return "Topping info: " +
                "toppingName=" + toppingName +
                ", spiceLevel=" + spiceLevel +
                ", description=" + description;
    }
}
