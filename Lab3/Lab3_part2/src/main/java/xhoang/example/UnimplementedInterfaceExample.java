package xhoang.example;

import java.util.logging.Logger;

interface Drawable {
    void draw();
}

class Circle implements Drawable {
    private static final Logger logger = Logger.getLogger(Circle.class.getName());

    public void draw() {
        // Basic implementation
        logger.info("Drawing a circle");
    }
}
