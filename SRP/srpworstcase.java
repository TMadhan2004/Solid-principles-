import java.util.*;

class Invoice {

    private List<String> items;
    private double taxRate = 0.18;

    public Invoice(List<String> items) {
        this.items = items;
    }

    public double calculateTotal() {
        double total = 0;

        for (String item : items) {
            total += 100; 
        }

        total += total * taxRate;
        return total;
    }

    public void printInvoice() {
        System.out.println("Invoice");
        for (String item : items) {
            System.out.println("Item: " + item + ": Rs.100");
        }
        System.out.println("Tax: 18%");
        System.out.println("Total: Rs." + calculateTotal());
    }

    public void saveToDatabase() {
        System.out.println("Save operations");
        System.out.println("Connecting to MySQL");
        System.out.println("Saving invoice data");
        System.out.println("Invoice saved successfully.");
    }
}

public class srpworstcase {
    public static void main(String[] args) {

        List<String> items = Arrays.asList("Laptop", "Mouse", "Keyboard");
        Invoice invoice = new Invoice(items);
        invoice.printInvoice();
        invoice.saveToDatabase();
    }
}
