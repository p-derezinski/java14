package pl.sdacademy.java14poz.wlasneprogramy;

public class Position {

    private Product product;
    private int quantity;

    public Position(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public double calculatePrice() {
        return this.product.getProductPrice() * this.quantity;
    }

    public String toString() {
        int quantityLength = String.format("f", this.quantity).length();
        int calculatedProceLength = String.format("%.2f", calculatePrice()).length();
        StringBuilder sb = new StringBuilder();
        sb.append(this.product.toString()).append("\t").append("quant. ").append(this.quantity);
        for (int i = 1; i < (4 - quantityLength); i++) {
            sb.append(" ");
        }
        sb.append("\t");
        for (int i = 1; i < (10 - calculatedProceLength); i++) {
            sb.append(" ");
        }
        sb.append(String.format("%.2f", calculatePrice())).append(" $");
        return sb.toString();
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }
}
