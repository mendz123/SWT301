package xhoang.example;

import java.util.logging.Logger;

public class UnreachableCodeExample {
    private static final Logger logger = Logger.getLogger(UnreachableCodeExample.class.getName());

    public static int getNumber() {
        return 41+1; // Removed unreachable code
    }

    public static void main(String[] args) {
        logger.info("Number: " + getNumber());
    }
}