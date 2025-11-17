import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// Observer Interface
interface TemperatureListener {
    void onTemperatureChange(int newTemp);
}

// Subject Class
class TemperatureSensor extends Thread {
    private List<TemperatureListener> listeners = new ArrayList<>();
    private Random random = new Random();
    private int currentTemp = 25; // starting value

    public void addListener(TemperatureListener listener) {
        listeners.add(listener);
    }
    private void notifyListeners(int newTemp) {
        for (TemperatureListener listener : listeners) {
            listener.onTemperatureChange(newTemp);
        }
    }
    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(2000); // updates every 2 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // generate random temp
            currentTemp = 20 + random.nextInt(15); // 20 to 35

            notifyListeners(currentTemp);
        }
    }
}
// Display 1
class MobileDisplay implements TemperatureListener {
    @Override
    public void onTemperatureChange(int newTemp) {
        System.out.println("[Mobile Display] Temperature Updated: " + newTemp + "°C");
    }
}
// Display 2
class SmartHomeDisplay implements TemperatureListener {
    @Override
    public void onTemperatureChange(int newTemp) {
        System.out.println("[Smart Home Display] New Temp: " + newTemp + "°C");
    }
}
public class TemperatureApp {
    public static void main(String[] args) {

        TemperatureSensor sensor = new TemperatureSensor();
        MobileDisplay mobile = new MobileDisplay();
        SmartHomeDisplay home = new SmartHomeDisplay();
        sensor.addListener(mobile);
        sensor.addListener(home);
        // start sensor thread
        sensor.start();
        System.out.println("Temperature Sensor Started...");
    }
}
