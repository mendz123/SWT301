package xhoang.example;

import java.util.logging.Logger;

public class CatchGenericExceptionExample {
    private static final Logger logger = Logger.getLogger(CatchGenericExceptionExample.class.getName());

    public static void main(String[] args) {
        String s = args.length > 0 ? args[0] : null;
        try {
            if (s != null) {
                logger.info("Length: " + s.length());
            } else {
                logger.warning("String is null or no argument provided");
            }
        } catch (Exception e) {
            logger.severe("Something went wrong");
        }
    }
}