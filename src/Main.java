import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter client data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.next();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthdate = sdf.parse(sc.next());
        Client clients = new Client(name,email,birthdate);

        System.out.println();

        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next());
        Order order = new Order(new Date(),status,clients);
        System.out.println();

        System.out.print("How many items to this order?");
        int itemsOrder = sc.nextInt();

        for(int i = 1; i <= itemsOrder; i++){
            System.out.println("Enter #" + i + " item data: ");
            System.out.print("Product name: ");
            sc.nextLine();
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            Double productPrice = sc.nextDouble();

            Product product = new Product(productName,productPrice);

            System.out.print("Quantity: ");
            Integer quantity = sc.nextInt();

            OrderItem orderItem = new OrderItem(quantity,productPrice,product);
            order.addItem(orderItem);

            System.out.println();
        }

        System.out.println("ORDER SUMMARY: ");
        System.out.println(order);

        sc.close();
    }
}