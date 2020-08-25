package creational.factory.design.pattern;

public class Phone implements Device {
    @Override
    public String devices() {
        System.out.println("Displaying Phone device:: ");
        return "This is a Samsung Galaxy Phone";
    }
}
