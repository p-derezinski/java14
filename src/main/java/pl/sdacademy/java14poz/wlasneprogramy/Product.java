package pl.sdacademy.java14poz.wlasneprogramy;

public class Product {

    private String name;
    private double productPrice;
    private String description;

    public Product(String name, double productPrice, String description) {
        this.name = name;
        this.productPrice = productPrice;
        this.description = description;
    }

    public String toString() {
        int nameLength = this.name.length();
        int priceLength = String.format("%.2f", this.productPrice).length();
        StringBuilder sb = new StringBuilder();
        sb.append("- ").append(this.name);
        for (int i = 1; i < (30 - nameLength); i++) {
            sb.append(" ");
        }
        sb.append("\t\t-->");
        for (int i = 1; i < (10 - priceLength); i++) {
            sb.append(" ");
        }
        sb.append(String.format("%.2f", this.productPrice)).append(" $");
        return sb.toString();
    }

    public String showDescription() {
        return toString() + "\n" + this.description;
    }

    public String getName() {
        return name;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public String getDescription() {
        return description;
    }
}
