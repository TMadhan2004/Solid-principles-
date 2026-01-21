interface Printable {
    print(): void;
}

interface Scannable {
    scan(): void;
}

interface Faxable {
    fax(): void;
}

interface Photocopiable {
    photocopy(): void;
}

interface Emailable {
    email(): void;
}

class OldPrinter implements Printable {
    print(): void {
        console.log("Old printer printing document");
    }
}

class MultiFunctionPrinter
    implements Printable, Scannable, Faxable, Photocopiable, Emailable {

    print(): void {
        console.log("Printing document");
    }

    scan(): void {
        console.log("Scanning document");
    }

    fax(): void {
        console.log("Sending fax");
    }

    photocopy(): void {
        console.log("Photocopying document");
    }

    email(): void {
        console.log("Emailing document");
    }
}

class PrintService {
    static startPrinting(printer: Printable): void {
        printer.print();
    }
}

class ScanService {
    static startScanning(scanner: Scannable): void {
        scanner.scan();
    }
}

class isp {
    static main(): void {
        const oldPrinter: Printable = new OldPrinter();
        const modernPrinter: Printable = new MultiFunctionPrinter();

        console.log("Printing");
        PrintService.startPrinting(oldPrinter);
        PrintService.startPrinting(modernPrinter);

        console.log("\nScanning");
        const scanner: Scannable = new MultiFunctionPrinter();
        ScanService.startScanning(scanner);
    }
}

isp.main();
