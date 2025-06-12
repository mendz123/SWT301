package xhoang.example;

import java.util.logging.Logger;

class Printer {
    private static final Logger logger = Logger.getLogger(Printer.class.getName());

    void print(String message) {
        logger.info(message);
    }
}

class Report {
    private final Printer printer = new Printer(); // Marked as final

    void generate() {
        printer.print("Generating report... ");
    }
}

public class TightCouplingExample {
    public static void main(String[] args) {
        Report report = new Report();
        report.generate();
    }
}