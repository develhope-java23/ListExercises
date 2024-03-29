public class Product {
    private String name;
    private double unitPrice;
    private int quantity;

    public Product(String name, double unitPrice, int quantity) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotalPrice() {
        return quantity * unitPrice;
    }
}