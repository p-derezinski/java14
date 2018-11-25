package pl.sdacademy.java14poz.wlasneprogramy;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private List<Position> orderList;

    public Order() {
        this.orderList = new ArrayList<Position>();
    }

    public double addPosition(Position position, double balance) {
        if (balance >= position.calculatePrice()) {
            this.orderList.add(position);
            System.out.println("New position has been added to the order: " + position.getProduct().getName() +
                    ", quantity: " + position.getQuantity() + ".");
            return balance - position.calculatePrice();
        } else {
            System.out.println("Insufficient balance, " + position.getProduct().getName() + " has not been added to the order.");
            return balance;
        }
    }

    public double calculateTotalPrice() {
        double total = 0;
        for (int i = 0; i < this.orderList.size(); i++) {
            total += this.orderList.get(i).calculatePrice();
        }
        return total;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("=================================================================================\n");
        sb.append("Your order:\n");
        for (int i = 0; i < this.orderList.size(); i++) {
            sb.append(this.orderList.get(i).toString()).append("\n");
        }
        sb.append("Totsl price: ").append(String.format("%.2f", calculateTotalPrice())).append(" $\n");
        sb.append("=================================================================================");
        return sb.toString();
    }

    public List<Position> getOrderList() {
        return orderList;
    }
}
