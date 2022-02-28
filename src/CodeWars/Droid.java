package CodeWars;

public class Droid {
    int batteryLevel;
    String name;

    public Droid(String droidName){
        name = droidName;
        batteryLevel = 100;
    }

    public String toString(){
        return "Hello, I'm the droid: " + this.name;
    }

    public void performTask(String task){
        System.out.println(this.name + " is performing task: " + task);
        batteryLevel = batteryLevel - 10;
    }
    public void energyLevel(){
        System.out.println("The battery level is now: " + batteryLevel);
    }

    public static void main(String[] args) {
        Droid Codey = new Droid("Codey");
        System.out.println(Codey);
        Codey.performTask("dancing");
        Codey.performTask("eating");
        Codey.performTask("mopping");
        Codey.performTask("killing humans");
        Codey.energyLevel();
    }
}
