package creational.factory.design.pattern;

public class LaptopDevice extends DeviceType{
    @Override
    public Device getDevice() {
        return new Laptop();
    }
}
