package model;

/**
 * @author Tribel
 */
public class SquareEquation {

	double coefficientA;
	double coefficientB;
	double coefficientC;

	
	public SquareEquation(double coefficientA, double coefficientB, double coefficientC) {
		this.coefficientA = coefficientA;
		this.coefficientB = coefficientB;
		this.coefficientC = coefficientC;
	}

	public SquareEquation() {
	}

	/**
	 * Calculate and solve square equation
	 * @return {@code double[]} roots array
	 */
	protected double[] solve() {
		if (coefficientA == 0.0)
			throw new IllegalArgumentException("a == 0! It is not a square equation");
		
		double d = coefficientB * coefficientB - 4 * coefficientA * coefficientC;
		
		if (d < 0) {
			return new double[0];
		} else if (d == 0) {
			return new double[] { -coefficientB / (2 * coefficientA) };
		} else {
			double x1 = (-coefficientB - Math.sqrt(d)) / (2 * coefficientA);
			double x2 = (-coefficientB + Math.sqrt(d)) / (2 * coefficientA);
			return new double[] { x1, x2 };
		}
	}
	
	/**
	 * 
	 * @return true - if all roots are integer , in other case - false.
	 */
	public boolean isIntegerRoots() {
		if(solve().length == 0) return false;
		
		for(double d: solve()) {
			if(d % 1 != 0) return false;
		}
		return true;
	}
	
	/**
	 * 
	 * @return {@code int} roots amount
	 */
	public int rootsAmount() {
		return solve().length;
	}
	
	public double getCoefficientA() {
		return coefficientA;
	}

	public double getCoefficientB() {
		return coefficientB;
	}

	public double getCoefficientC() {
		return coefficientC;
	}

}
