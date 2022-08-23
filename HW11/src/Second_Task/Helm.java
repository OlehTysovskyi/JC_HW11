package Second_Task;

public class Helm{
	
	private int wheelDiam;
	private String wheelMaterial;
	
	Helm(int wheelDiam, String wheelMaterial) {
		this.wheelDiam = wheelDiam;
		this.wheelMaterial = wheelMaterial;
		
	}

	public int getWheelDiam() {
		return wheelDiam;
	}

	public void setWheelDiam(int wheelDiam) {
		this.wheelDiam = wheelDiam;
	}

	public String getWheelMaterial() {
		return wheelMaterial;
	}

	public void setWheelMaterial(String wheelMaterial) {
		this.wheelMaterial = wheelMaterial;
	}

	@Override
	public String toString() {
		return "wheelDiam=" + wheelDiam + "; wheelMaterial='" + wheelMaterial + "'";
	}
	
	
	
}
