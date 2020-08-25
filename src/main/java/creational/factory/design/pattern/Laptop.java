package creational.factory.design.pattern;

public class Laptop implements Device{
    @Override
    public String devices() {
        System.out.println("Displaying Laptop device:: ");
        return "This is a HP Laptop";
    }
}
