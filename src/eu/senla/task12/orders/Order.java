package eu.senla.task12.orders;

import java.time.LocalDate;

public class Order {
    private int orderId;
    private LocalDate orderDate;
    private int productIdFirst;
    private int productIdSecond;

    public Order(int orderId, LocalDate orderDate, int productIdFirst, int productIdSecond) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.productIdFirst = productIdFirst;
        this.productIdSecond = productIdSecond;
    }

    public int getOrderId() {
        return orderId;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public int getProductIdFirst() {
        return productIdFirst;
    }

    public int getProductIdSecond() {
        return productIdSecond;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", orderDate=" + orderDate +
                ", productIdFirst=" + productIdFirst +
                ", productIdSecond=" + productIdSecond +
                '}';
    }
}
