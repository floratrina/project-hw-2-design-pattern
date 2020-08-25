package creational.factory.design.pattern;

public class TestFactoryMethodPattern {

    public static void main(String[] args) {
        DeviceType deviceType = new LaptopDevice();
        deviceType.getDeviceType();

        deviceType = new PhoneDevice();
        deviceType.getDeviceType();

    }
}
