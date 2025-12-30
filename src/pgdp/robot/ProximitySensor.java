package pgdp.robot;

public class ProximitySensor extends Sensor{
    protected double directionOffset;
    protected double accuracy;
    protected double maxRange;

    public ProximitySensor(){
        super();
    }
    public World.Controller getData(){
    }
    public Sensor<World.Controller> createNewSensor(){
    }
    @Override
    public String toString(){
        return "";
    }
}
