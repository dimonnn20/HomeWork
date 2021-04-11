package eu.senla.task12.products;

import java.time.LocalDate;

public class Product {
    private int id;
    private String name;
    private LocalDate productDate;

    public Product(int id, String name, LocalDate productDate) {
        this.id = id;
        this.name = name;
        this.productDate = productDate;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getProductDate() {
        return productDate;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", productDate=" + productDate +
                '}';
    }
}
