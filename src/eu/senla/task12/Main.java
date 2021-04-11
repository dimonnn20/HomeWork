package eu.senla.task12;

import eu.senla.task12.orders.Order;
import eu.senla.task12.products.Product;

import java.io.File;
import java.io.FileWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static String num1 = "0";
    public static void main (String [] args) {

        //Работа с файлами
        // Файл с товарами
        try {
            File productsFile = new File("C:/Users/User/IdeaProjects/eu.senla/src/eu/senla/task12/products/products.txt");
            Scanner scanProducts = new Scanner(productsFile);
            ArrayList productsList = new ArrayList();
            while (scanProducts.hasNextLine()) {
                String line = scanProducts.nextLine();
                String[] str = line.split("/");
                Product product = new Product(Integer.parseInt(str[0]), str[1], getDate(str[2]));
                productsList.add(product);
            }
            // Файл с заказами
            File ordersFile = new File("C:/Users/User/IdeaProjects/eu.senla/src/eu/senla/task12/orders/orders.txt");
            Scanner scanOrders = new Scanner(ordersFile);
            ArrayList ordersList = new ArrayList();
            while (scanOrders.hasNextLine()) {
                String line = scanOrders.nextLine();
                String[] str = line.split("/");
                Order order = new Order(Integer.parseInt(str[0]), getDate(str[1]), Integer.parseInt(str[2]), Integer.parseInt(str[3]));
                ordersList.add(order);
            }
            // Работа с консолью
            Scanner sc = new Scanner(System.in);
            while (true) {
                System.out.println("Press 1 for Products, press 2 for orders, press 3 to EXIT ");
                num1 = sc.next();
                if ("1".equals(num1)) {
                    processList(productsList);
                    FileWriter fl = new FileWriter(productsFile);
                    for (int i = 0; i < productsList.size(); i++) {
                        Product product = (Product) productsList.get(i);
                        String str = product.getId() + "/" + product.getName() + "/" + product.getProductDate() + "\n";
                        fl.write(str);
                    }
                    fl.close();
                }
                if ("2".equals(num1)) {
                    processList(ordersList);
                    FileWriter fl = new FileWriter(ordersFile);
                    for (int i = 0; i < ordersList.size(); i++) {
                        Order order = (Order) ordersList.get(i);
                        String str = order.getOrderId() + "/" + order.getOrderDate() + "/" + order.getProductIdFirst() + "/" + order.getProductIdSecond() + "\n";
                        fl.write(str);
                    }
                    fl.close();
                }
                    if ("3".equals(num1)) {
                        break;
                    }
                else {
                    System.out.println("Wrong command please try again");

                }

            }
            sc.close();
            scanOrders.close();
            scanProducts.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void processList(ArrayList list) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Press 1 - to see all, press 2 - to add, press 3 - to delete, press 4 - back to Main menu");
            String num2 = sc.next();
            if ("1".equals(num2)) {
                System.out.println(list);
            }
            if ("2".equals(num2)) {
                if ("1".equals(num1)) {
                    System.out.println("Enter new product name");
                    String name = sc.next();
                    System.out.println("Enter the date of production in format DD-MM-YYYY");
                    String date = sc.next();
                    Product product = new Product(list.size()+1, name, getDateFromKeyboard(date));
                    list.add(product);
                }
                if ("2".equals(num1)) {
                    System.out.println("Enter order date in format DD-MM-YYYY");
                    String date = sc.next();
                    System.out.println("Enter id for first product");
                    String idFirst = sc.next();
                    System.out.println("Enter id for second product");
                    String idSecond = sc.next();
                    Order order = new Order(list.size()+1, getDateFromKeyboard(date), Integer.parseInt(idFirst), Integer.parseInt(idSecond));
                    list.add(order);
                }
            }
                if ("3".equals(num2)) {
                    System.out.println("Enter ID for delete");
                    num2 = sc.next();
                    list.remove(Integer.parseInt(num2)-1);
                }
                if ("4".equals(num2)) {break;}
                else {
                    System.out.println("Wrong command please try again");

                }
        }

    }

    private static LocalDate getDate(String s) {
        String[] str = s.split("-");
        return LocalDate.of(Integer.parseInt(str[0]), Integer.parseInt(str[1]), Integer.parseInt(str[2]));
    }
    private static LocalDate getDateFromKeyboard(String s) {
        String [] str = s.split("-");
        return LocalDate.of(Integer.parseInt(str[2]), Integer.parseInt(str[1]),Integer.parseInt(str[0]) );
    }
}
