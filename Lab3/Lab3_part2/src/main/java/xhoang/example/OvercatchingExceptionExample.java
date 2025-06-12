package xhoang.example;

import java.util.logging.Logger;

public class OvercatchingExceptionExample {
    private static final Logger logger = Logger.getLogger(OvercatchingExceptionExample.class.getName());

    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            // Initialize array to avoid undefined behavior
            for (int i = 0; i < arr.length; i++) {
                arr[i] = i;
            }
            logger.info("Array value: " + arr[2]); // Access within bounds
        } catch (ArrayIndexOutOfBoundsException e)  {
            logger.severe("Runtime error");
        }
    }
}