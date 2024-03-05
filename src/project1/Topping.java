package project1;

public class Topping {
    private String toppingName;
    private String spiceLevel;
    private String description;

    public Topping(String toppingName, String spiceLevel, String description) {
        this.toppingName = toppingName;
        this.spiceLevel = spiceLevel;
        this.description = description;
    }

    public String getToppingName() {
        return toppingName;
    }

    public void setToppingName(String toppingName) {
        this.toppingName = toppingName;
    }

    public String getSpiceLevel() {
        return spiceLevel;
    }

    public void setSpiceLevel(String spiceLevel) {
        this.spiceLevel = spiceLevel;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Topping info: " +
                "toppingName=" + toppingName +
                ", spiceLevel=" + spiceLevel +
                ", description=" + description;
    }
}
