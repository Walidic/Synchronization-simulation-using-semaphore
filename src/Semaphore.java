public class Semaphore {
    protected int value;

    public Semaphore(int inputValue) {
        value = inputValue;
    }

    public synchronized void wait(Device device) {
        value--;
        if (value < 0) {
            System.out.println(
                    "(" + device.getDeviceName() + ")" + " " + "(" + device.getDeviceType() + ")"
                            + " arrived and waiting");
            try {
                wait();
            } catch (InterruptedException e) {
            }

        } else {
            System.out.println(
                    "(" + device.getDeviceName() + ")" + " " + "(" + device.getDeviceType() + ")" + " arrived");
        }
    }

    public synchronized void semaphoreSignal() {
        value++;
        if (value < 0) {
            notify();
        }
    }
}