import java.util.*;

class Invoice {
    private List<String> items;

    public Invoice(List<String> items) {
        this.items = items;
    }

    public List<String> getItems() {
        return items;
    }
}

class InvoiceCalculator {

    private static final double TAX_RATE = 0.18;

    public double calculateTotal(Invoice invoice) {
        double total = 0;

        for (String item : invoice.getItems()) {
            total += 100; 
        }

        total += total * TAX_RATE;
        return total;
    }
}

class InvoicePrinter {

    public void print(Invoice invoice, double total) {
        System.out.println("Invoice");

        for (String item : invoice.getItems()) {
            System.out.println("Item: " + item + ": Rs.100");
        }

        System.out.println("Tax: 18%");
        System.out.println("Total: Rs." + total);
    }
}

class InvoiceRepository {

    public void save(Invoice invoice, double total) {
        System.out.println("Save operations");
        System.out.println("Connecting to MySQL");
        System.out.println("Saving invoice data");
        System.out.println("Invoice saved successfully.");
    }
}

public class srp {

    public static void main(String[] args) {

        List<String> items = Arrays.asList("Laptop", "Mouse", "Keyboard");
        Invoice invoice = new Invoice(items);

        InvoiceCalculator calculator = new InvoiceCalculator();
        InvoicePrinter printer = new InvoicePrinter();
        InvoiceRepository repository = new InvoiceRepository();

        double total = calculator.calculateTotal(invoice);

        printer.print(invoice, total);
        repository.save(invoice, total);
    }
}
