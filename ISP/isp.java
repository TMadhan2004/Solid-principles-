interface Printable {
   void print();
}
interface Scannable {
   void scan();
}
interface Faxable {
   void fax();
}
interface Photocopiable {
   void photocopy();
}


interface Emailable {
   void email();
}


class OldPrinter implements Printable {


   public void print() {
       System.out.println("Old printer printing document");
   }
}


class MultiFunctionPrinter implements Printable, Scannable, Faxable, Photocopiable, Emailable {


   public void print() {
       System.out.println("Printing document");
   }


   public void scan() {
       System.out.println("Scanning document");
   }


   public void fax() {
       System.out.println("Sending fax");
   }


   public void photocopy() {
       System.out.println("Photocopying document");
   }


   public void email() {
       System.out.println("Emailing document");
   }
}


class PrintService {
   public static void startPrinting(Printable printer) {
       printer.print();
   }
}


class ScanService {
   public static void startScanning(Scannable scanner) {
       scanner.scan();
   }
}


public class isp {
   public static void main(String[] args) {
       Printable oldPrinter = new OldPrinter();
       Printable modernPrinter = new MultiFunctionPrinter();
       System.out.println("Printing");
       PrintService.startPrinting(oldPrinter);
       PrintService.startPrinting(modernPrinter);
       System.out.println("\nScanning");
       Scannable scanner = new MultiFunctionPrinter();
       ScanService.startScanning(scanner);
   }
}
