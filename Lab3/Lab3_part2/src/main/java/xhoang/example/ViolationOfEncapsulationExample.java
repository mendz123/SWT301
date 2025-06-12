package xhoang.example;
import java.util.logging.Logger;

class User {
    private static final Logger logger = Logger.getLogger(User.class.getName());
    private String name;
    private int age;

    public void display() {
        logger.info("Name: " + name + ", Age: " + age);
    }

    // Getter methods (optional, add setters if needed)
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    // Setter methods (optional)
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
}

public class ViolationOfEncapsulationExample {
    public static void main(String[] args) {
        User user = new User();
        user.setName("John");
        user.setAge(25);
        user.display();
    }
}