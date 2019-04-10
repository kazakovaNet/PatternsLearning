package factory.factorymethod;

import java.util.Date;

class DigitalWatch implements Watch {
    public void showTime() {
        System.out.println(new Date());
    }
}