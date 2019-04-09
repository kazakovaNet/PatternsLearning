package factory.devicefactory;

class RuMouse implements Mouse {
    public void click() {
        System.out.println("Щелчок мышью");
    }

    public void dblclick() {
        System.out.println("Двойной щелчок мышью");
    }

    public void scroll(int direction) {
        if (direction > 0)
            System.out.println("Скроллим верх");
        else if (direction < 0)
            System.out.println("Скроллим вниз");
        else
            System.out.println("Не скроллим");
    }
}
