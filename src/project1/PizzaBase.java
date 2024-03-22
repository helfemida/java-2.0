package project1;

public class PizzaBase {
    private String description;
    private String baseType;
    private String baseName;

    public PizzaBase(String description, String baseType, String baseName) {
        this.description = description;
        this.baseType = baseType;
        this.baseName = baseName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBaseType() {
        return baseType;
    }

    public void setBaseType(String baseType) {
        this.baseType = baseType;
    }

    public String getBaseName() {
        return baseName;
    }

    public void setBaseName(String baseName) {
        this.baseName = baseName;
    }

    @Override //static polymorphism
    public String toString() {
        return "PizzaBase information: " +
                "baseName=" + baseName +
                ", description=" + description +
                ", baseType=" + baseType;
    }
}
