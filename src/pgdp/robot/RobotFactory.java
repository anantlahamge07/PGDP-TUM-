package pgdp.robot;

public class RobotFactory {
    public Robot makePanicPenguin(String name, double rotation, Robot.FailureSimulator failureSimulator){
        return new Robot();
    }
    public Robot makeLineFollower(String name, double direction, Robot.FailureSimulator failureSimulator){
        return new Robot();
    }
    public Robot makeCar(String name, Robot.FailureSimulator failureSimulator){
        return new Robot();
    }
    public Robot makeMazeRunner(String name, double direction, Robot.FailureSimulator failureSimulator){
        return new Robot();
    }
    public Robot makeTempleRunner(String name, double direction, Robot.FailureSimulator failureSimulator){
        return new Robot();
    }




}
