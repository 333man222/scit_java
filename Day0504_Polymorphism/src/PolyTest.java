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
		System.out.println("������=" + radius);
	}
}

class MyRectangle extends Polygon {
	int width, height;

	@Override
	void output() {
		super.output();
		System.out.println("�ʺ�=" + width + ", ����=" + height);
	}
}

public class PolyTest {
	public static void main(String[] args) {
		Polygon[] poly = new Polygon[10];
		poly[0] = new Polygon();	// �θ�� ���� ���踸 �س���
		poly[1] = new MyCircle();	// �ڽĵ��� �����ϴ� ��찡 ����
		poly[2] = new MyRectangle();
		
		printAll(poly[0]);
		printAll(poly[1]);
		printAll(poly[2]);
	}
	// call by reference(�ּҰ� �Ѿ�� ���,, ���� �ּҸ� ���� ��) <->call by value(���� ���� �Ѿ�� ��)
	public static void printAll(Polygon poly) {
		poly.output();
	}
}
