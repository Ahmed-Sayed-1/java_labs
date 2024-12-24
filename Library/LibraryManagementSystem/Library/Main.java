

import javax.swing.*;
import java.awt.*;


public class Main {
    public static void main(String[] args) {
         Library library = new Library();

        JFrame frame = new JFrame("Library Management System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLayout(new GridLayout(0, 1));

        // Library Item Buttons
        JButton addItemButton = new JButton("Add Library Item");
        JButton retrieveItemButton = new JButton("Retrieve Library Item");
        JButton displayItemsButton = new JButton("Display All Library Items");
        JButton deleteItemButton = new JButton("Delete Library Item");

        // Client Management Buttons
        JButton addClientButton = new JButton("Add Client");
        JButton retrieveClientButton = new JButton("Retrieve Client");
        JButton displayClientsButton = new JButton("Display All Clients");
        JButton deleteClientButton = new JButton("Delete Client");

        // Add Library Item
        addItemButton.addActionListener(e -> {
            String type = JOptionPane.showInputDialog("Enter type (Book/Magazine):");
            String id = JOptionPane.showInputDialog("Enter ID:");
            String title = JOptionPane.showInputDialog("Enter Title:");
            if (type.equalsIgnoreCase("Book")) {
                library.addItem(new Book(id, title));
            } else if (type.equalsIgnoreCase("Magazine")) {
                library.addItem(new Magazine(id, title));
            } else {
                JOptionPane.showMessageDialog(frame, "Invalid type.");
            }
        });

        // Retrieve Library Item
        retrieveItemButton.addActionListener(e -> {
            String id = JOptionPane.showInputDialog("Enter Item ID:");
            try {
                LibraryItem item = library.getItem(id);
                JOptionPane.showMessageDialog(frame, "Item Details: " + item.getItemDetails());
            } catch (ItemNotFoundException ex) {
                JOptionPane.showMessageDialog(frame, ex.getMessage());
            }
        });

        // Display All Library Items
        displayItemsButton.addActionListener(e -> {
            StringBuilder items = new StringBuilder();
            for (LibraryItem item : library.displayitems()) {
                items.append(item.getItemDetails()).append("\n");
            }
            JOptionPane.showMessageDialog(frame, items.length() > 0 ? items.toString() : "No items found.");
        });

        // Delete Library Item
        deleteItemButton.addActionListener(e -> {
            String id = JOptionPane.showInputDialog("Enter Item ID to delete:");
            if (library.deleteItem(id)) {
                JOptionPane.showMessageDialog(frame, "Item deleted successfully.");
            } else {
                JOptionPane.showMessageDialog(frame, "Item not found.");
            }
        });

        // Add Client
        addClientButton.addActionListener(e -> {
            String id = JOptionPane.showInputDialog("Enter Client ID:");
            String name = JOptionPane.showInputDialog("Enter Name:");
            String email = JOptionPane.showInputDialog("Enter Email:");
            library.addClients(new Client(id, name, email));
        });

        // Retrieve Client
        retrieveClientButton.addActionListener(e -> {
            String id = JOptionPane.showInputDialog("Enter Client ID:");
            try {
                Client client = library.getClient(id);
                JOptionPane.showMessageDialog(frame, "Client Details: " + client.getClientDetails());
            } catch (ItemNotFoundException ex) {
                JOptionPane.showMessageDialog(frame, ex.getMessage());
            }
        });

        // Display All Clients
        displayClientsButton.addActionListener(e -> library.displayClients());

        // Delete Client
        deleteClientButton.addActionListener(e -> {
            String id = JOptionPane.showInputDialog("Enter Client ID to delete:");
            if (library.deleteClient(id)) {
                JOptionPane.showMessageDialog(frame, "Client deleted successfully.");
            } else {
                JOptionPane.showMessageDialog(frame, "Client not found.");
            }
        });

        // Add Buttons to Frame
        frame.add(addItemButton);
        frame.add(retrieveItemButton);
        frame.add(displayItemsButton);
        frame.add(deleteItemButton);
        frame.add(addClientButton);
        frame.add(retrieveClientButton);
        frame.add(displayClientsButton);
        frame.add(deleteClientButton);

        frame.setVisible(true);
    }

        /*Library library = new Library();
        // List<Client> clients = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Library Item");
            System.out.println("2. Retrieve Library Item");
            System.out.println("3. Display All Library Items");
            System.out.println("4. Delete Library Item");
            System.out.println("5. Add Client");
            System.out.println("6. Retrieve Client");
            System.out.println("7. Display All Clients");
            System.out.println("8. Delete Client");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter type (Book/Magazine): ");
                    String type = scanner.nextLine();
                    System.out.print("Enter ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter Title: ");
                    String title = scanner.nextLine();
                    if (type.equalsIgnoreCase("Book")) {
                        library.addItem(new Book(id, title));
                    } else if (type.equalsIgnoreCase("Magazine")) {
                        library.addItem(new Magazine(id, title));
                    } else {
                        System.out.println("Invalid type.");
                    }
                    break;

                case 2:
                    System.out.print("Enter Item ID: ");
                    id = scanner.nextLine();
                    try {
                        LibraryItem item = library.getItem(id);
                         item.getItemDetails();
                    } catch (ItemNotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 3:
                    library.displayitems();
                    break;

                case 4:
                    System.out.print("Enter Item ID to delete: ");
                    id = scanner.nextLine();
                    if (library.deleteItem(id)) {
                        System.out.println("Item deleted successfully.");
                    } else {
                        System.out.println("Item not found.");
                    }
                    break;

                case 5:
                    System.out.print("Enter Client ID: ");
                    id = scanner.nextLine();
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Email: ");
                    String email = scanner.nextLine();
                    library.addClients(new Client(id, name, email));
                    break;

                case 6:
                    System.out.print("Enter Client ID: ");
                    id = scanner.nextLine();
                    try {
                        Client item = library.getClient(id);
                         item.getClientDetails();
                    } catch (ItemNotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 7:     
                        library.displayClients();
                    break;

                case 8:
                    System.out.print("Enter Client ID to delete: ");
                    id = scanner.nextLine();
                    if (library.deleteClient(id)) {
                        System.out.println("Client deleted successfully.");
                    } else {
                        System.out.println("Client not found.");
                    }
                    break;

                case 9:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }*/
}
