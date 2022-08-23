package Second_Task;

public class Engine{

	private int numOfCylinders;
	
	Engine(int numOfCylinders) {
		this.numOfCylinders = numOfCylinders;
	}

	public int getNumOfCylinders() {
		return numOfCylinders;
	}

	public void setNumOfCylinders(int numOfCylinders) {
		this.numOfCylinders = numOfCylinders;
	}

	@Override
	public String toString() {
		return "cylinders=" + numOfCylinders;
	}
	
	
}
