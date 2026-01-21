interface Machine {
   void print();
   void scan();
   void fax();
   void photocopy();
   void email();
}


class MultiFunctionPrinter implements Machine {
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
class OldPrinter implements Machine {
   public void print() {
       System.out.println("Old printer printing document");
   }
   public void scan() {
       System.out.println("Scan not supported");
   }
   public void fax() {
       System.out.println("Fax not supported");
   }
   public void photocopy() {
       System.out.println("Photocopy not supported");
   }
   public void email() {
       System.out.println("Email not supported");
   }
}


class Office {
   public static void useMachine(Machine machine) {
       machine.print();
       machine.scan();
       machine.fax();
       machine.photocopy();
       machine.email();
   }
}


public class ispviolates {
   public static void main(String[] args) {
       Machine modernMachine = new MultiFunctionPrinter();
       Machine oldMachine = new OldPrinter();
       System.out.println("Using MultiFunctionPrinter");
       Office.useMachine(modernMachine);
       System.out.println("\nUsing OldPrinter");
       Office.useMachine(oldMachine);
   }
}
