package rocket;

public abstract class Rocket {
    private String name, ID;
    private static int ROCKET_COUNT = 0;
    private Pilot pilot;
    
    public Rocket (String name) {
        this.name = name;
        this.ID = "NASA" + ROCKET_COUNT;
    }
    
    public String getName() {
        return name;
    }
    public String getID() {
        return ID;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public void setID(String ID) {
        this.ID = ID;
    }
    
    public abstract void assignPilot();
    public abstract void fuelEfficiency();
    
    public void upCount() {
        ROCKET_COUNT++;
    }
}
