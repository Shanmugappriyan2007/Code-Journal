import java.text.SimpleDateFormat;
import java.util.Date;

public class DigitalClock {
    public static void main(String[] args) {
        while (true) {
            Date now = new Date();
            SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
            System.out.print("\rCurrent Time: " + formatter.format(now));
            try {
                Thread.sleep(1000); // Update every 1 second
            } catch (InterruptedException e) {
                System.out.println("Clock interrupted.");
            }
        }
    }
}
