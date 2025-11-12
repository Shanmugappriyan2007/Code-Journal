interface SmartDevice {
    void turnOn();
    void turnOff();
}

class SmartLight implements SmartDevice {
    public void turnOn() {
        System.out.println("💡 Smart Light is now ON.");
    }
    public void turnOff() {
        System.out.println("💡 Smart Light is now OFF.");
    }
}

class SmartFan implements SmartDevice {
    public void turnOn() {
        System.out.println("🌀 Smart Fan started spinning.");
    }
    public void turnOff() {
        System.out.println("🌀 Smart Fan stopped.");
    }
}

class SmartSpeaker implements SmartDevice {
    public void turnOn() {
        System.out.println("🔊 Smart Speaker is playing music.");
    }
    public void turnOff() {
        System.out.println("🔊 Smart Speaker turned off.");
    }
}

public class SmartDeviceController {
    public static void main(String[] args) {
        SmartDevice light = new SmartLight();
        SmartDevice fan = new SmartFan();
        SmartDevice speaker = new SmartSpeaker();

        System.out.println("🎛️ Controlling Smart Devices:\n");
        light.turnOn();
        fan.turnOn();
        speaker.turnOn();
        System.out.println("\n🔌 Turning everything off...");
        light.turnOff();
        fan.turnOff();
        speaker.turnOff();
    }
}
