package Second_Task;

public class Car{
	
	private int hp, gradYear;
	private Helm Helm;
	private Engine Engine;
	
	Car(int hp, int gradYear, Helm Helm, Engine Engine){
		this.hp = hp;
		this.gradYear = gradYear;
		this.Helm = Helm;
		this.Engine = Engine;
	}
	
	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getGraduationYear() {
		return gradYear;
	}

	public void setGraduationYear(int gradYear) {
		this.gradYear = gradYear;
	}

	@Override
	public String toString() {
		return "Car [hp=" + hp + "; year=" + gradYear + "; " + Helm.toString() + "; " + Engine.toString() + "]";
	}

	
	
	
}
