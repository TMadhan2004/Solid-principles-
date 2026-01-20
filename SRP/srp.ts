class Invoice {
  constructor(private items: string[]) {}

  getItems(): string[] {
    return this.items;
  }
}

class InvoiceCalculator {
  private static readonly TAX_RATE = 0.18;

  calculateTotal(invoice: Invoice): number {
    let total = 0;

    for (const item of invoice.getItems()) {
      total += 100; 
    }

    return total + total * InvoiceCalculator.TAX_RATE;
  }
}

class InvoicePrinter {
  print(invoice: Invoice, total: number): void {
    console.log("Invoice");

    for (const item of invoice.getItems()) {
      console.log(`Item: ${item} : Rs.100`);
    }

    console.log("Tax: 18%");
    console.log(`Total: Rs.${total}`);
  }
}

class InvoiceRepository {
  save(invoice: Invoice, total: number): void {
    console.log("Save operations");
    console.log("Connecting to database");
    console.log(`Saving invoice with total: Rs.${total}`);
    console.log("Invoice saved successfully.");
  }
}

const items = ["Laptop", "Mouse", "Keyboard"];

const invoice = new Invoice(items);

const calculator = new InvoiceCalculator();
const printer = new InvoicePrinter();
const repository = new InvoiceRepository();

const total = calculator.calculateTotal(invoice);

printer.print(invoice, total);
repository.save(invoice, total);