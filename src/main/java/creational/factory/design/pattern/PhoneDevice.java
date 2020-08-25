package creational.factory.design.pattern;

public class PhoneDevice extends DeviceType{
    @Override
    public Device getDevice() {
        return new Phone();
    }
}
