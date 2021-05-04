class Polygon {
	int x, y;
	void output() {
		System.out.println("X=" + x + ", y=" + y);
	}
}

class MyCircle extends Polygon {
	int radius;

	@Override
	void output() {
		super.output();
		System.out.println("반지름=" + radius);
	}
}

class MyRectangle extends Polygon {
	int width, height;

	@Override
	void output() {
		super.output();
		System.out.println("너비=" + width + ", 높이=" + height);
	}
}

public class PolyTest {
	public static void main(String[] args) {
		Polygon[] poly = new Polygon[10];
		poly[0] = new Polygon();	// 부모는 보통 설계만 해놓고
		poly[1] = new MyCircle();	// 자식들이 구현하는 경우가 많음
		poly[2] = new MyRectangle();
		
		printAll(poly[0]);
		printAll(poly[1]);
		printAll(poly[2]);
	}
	// call by reference(주소가 넘어가는 경우,, 같은 주소를 갖는 것) <->call by value(숫자 값이 넘어가는 것)
	public static void printAll(Polygon poly) {
		poly.output();
	}
}
