package LinkedListPractice;

import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {
        DoublyCircularLinkedList list = new DoublyCircularLinkedList();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n========= Product Menu =========");
            System.out.println("1. Add Product");
            System.out.println("2. Delete First Product");
            System.out.println("3. Display All Products");
            System.out.println("4. Update Product");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Product ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Product Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Product Type: ");
                    String type = sc.nextLine();

                    System.out.print("Enter Product Price: ");
                    double price = sc.nextDouble();

                    product pro = new product(id, name, type, price);
                    list.addLast(pro);
                    System.out.println("Product added successfully!");
                    break;

                case 2:
                    product deleted = list.deleteFirst(null);
                    if (deleted != null) {
                        System.out.println("Deleted product: " + deleted.getName());
                    } else {
                        System.out.println("List is empty. Nothing to delete.");
                    }
                    break;

                case 3:
                    list.displayAll();
                    break;

                case 4:
                    System.out.print("Enter Product Name to Update: ");
                    String updateName = sc.nextLine();

                    System.out.print("Enter New Product ID: ");
                    int newId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter New Product Type: ");
                    String newType = sc.nextLine();

                    System.out.print("Enter New Product Price: ");
                    double newPrice = sc.nextDouble();

                    product updatedProduct = new product(newId, updateName, newType, newPrice);
                    list.Update(updatedProduct);
                    break;

                case 5:
                    System.out.println("Exiting... Thank you!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
