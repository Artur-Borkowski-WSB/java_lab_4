public class Prostokat extends Figura {
	double x;
	double y;

	public Prostokat(double x, double y) {
		this.x = x;
		this.y = y;
	}

	@Override
	double pole() {
		return this.x * this.y;
	}

	@Override
	double obwod() {
		return 2 * (this.x + this.y);
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Prostokat{" +
			"x=" + x +
			", y=" + y +
			'}';
	}
}
