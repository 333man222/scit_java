
public interface Practice {
	public static final int A = 10;
	int [] ARY = new int[5];
	double PI = Math.PI;
	double calc(double x, double y);
}

class Pracimpl implements Practice {

	@Override
	public double calc(double x, double y) {
		
		return 2 * 3 ;
	}

}