class Train extends Thread {
    private String trainName;

    Train(String trainName) {
        this.trainName = trainName;
    }
    @Override
    public void run() {
        System.out.println(trainName + " is approaching the station...");
        try {
            Thread.sleep(1000 + (int)(Math.random() * 2000)); // variable delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(trainName + " has arrived at the station!");
    }
}
public class TrainSimulator {
    public static void main(String[] args) {
        System.out.println("🚉 Train Arrival Simulation Started...\n");
        Train t1 = new Train("🚆 Express Train");
        Train t2 = new Train("🚄 Bullet Train");
        Train t3 = new Train("🚈 Local Train");
        t1.start();
        t2.start();
        t3.start();
    }
}
