package pgdp.robot;

import java.util.function.Consumer;

public abstract class Sensor<T> {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getReliability() {
        return reliability;
    }

    public void setReliability(double reliability) {
        this.reliability = reliability;
    }

    protected Consumer<T> processor;
    protected Robot owner;
    protected String name;
    protected double reliability;

	public Sensor(String name, double reliability) {
        this.name = name;
        this.reliability = reliability;
	}
    public void setOwner(Robot robot){
        this.owner = robot;
    }
    public Sensor<T> setProcessor(Consumer<T> processor){
        this.processor = processor;
        return this;
    }
    public abstract T getData() throws MalfunctionException;
    public abstract Sensor<T> createNewSensor();

}
