public class IElectricDeviceTest {
    public static void main(String[] args) {
        IElectricDevice ed = new Fan();
        ed.turnOn();
        ed.turnOff();

        ed = new Light();
        ed.turnOn();
        ed.turnOff();

    }
}
