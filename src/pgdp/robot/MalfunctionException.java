package pgdp.robot;

@SuppressWarnings("serial")
public class MalfunctionException extends Exception{
    private Sensor<?> brokenSensor;

	public MalfunctionException(Sensor<Integer> sensor) {
        this.brokenSensor = sensor;
	}
    public Sensor<?> getSensor(){
        return this.brokenSensor;
    }
    @Override
    public String toString(){
        return this.brokenSensor + " malfunctioned and needs to be replaced";
    }
}
