package factory.devicefactory;

public class AbstractFactoryApp {

    public static void main(String[] args) {

        DeviceFactory factory = getFactoryByCountryCode("FR");
        Mouse m = factory.getMouse();
        Keyboard k = factory.getKeyboard();
        Touchpad t = factory.getTouchpad();

        m.click();
        k.print();
        k.println();
        t.track(10, 35);
    }

    private static DeviceFactory getFactoryByCountryCode(String lang) {
        switch (lang) {
            case "RU":
                return new RuDeviceFactory();
            case "EN":
                return new EnDeviceFactory();
            default:
                throw new RuntimeException("Unsupported Country Code: " + lang);
        }
    }
}