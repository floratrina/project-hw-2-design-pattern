package creational.factory.design.pattern;

public abstract class DeviceType {

    public void getDeviceType() {
        Device device = getDevice();
        String type = device.devices();
        System.out.println(type);
    }

    protected abstract Device getDevice();
}
