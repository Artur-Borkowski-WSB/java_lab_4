public class Kwadrat extends Figura {
	double x;

	public Kwadrat(double x) {
		this.x = x;
	}

	@Override
	double pole() {
		return this.x * this.x;
	}

	@Override
	double obwod() {
		return 4 * this.x;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	@Override
	public String toString() {
		return "Kwadrat{" +
			"x=" + x +
			'}';
	}
}
