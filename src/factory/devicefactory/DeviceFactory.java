package factory.devicefactory;

interface DeviceFactory {
    Mouse getMouse();

    Keyboard getKeyboard();

    Touchpad getTouchpad();
}
