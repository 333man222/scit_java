package net.scit41.myabstract;

abstract class MyPoint{
	//멤버가 필요하므로 abstract 클래스로 만듬
	int x, y;
	public abstract double area();
	public void output() {
		System.out.print("x=" + x + ", y=" + y);
	}
}
class MyCircle extends MyPoint{
	int radius;
	public double area() {
		return Math.PI * radius * radius ;
	}
	@Override
	public void output() {
		super.output();
		System.out.println(", radius=" + radius + ", area=" + this.area());
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
}
class MyTriangle extends MyPoint{
	int edge, height;
	public double area() {
		return edge * height * 0.5 ;
	}
	@Override
	public void output() {
		super.output();
		System.out.println(", edge=" + edge + ", height=" + height + ", area=" + this.area());
	}
	public void setEdge(int edge) {
		this.edge = edge;
	}
	public void setHeight(int height) {
		this.height = height;
	}
}
public class PolygonTest {

	public static void main(String[] args) {
		MyPoint[] list = new MyPoint[10];
		list[0] = new MyCircle(); // 메소드 접근은 가능하지만, 변수에는 접근 불가
		list[0].x = 1;
		list[0].y = 1;
		((MyCircle)list[0]).setRadius(5); //부모클래스의 타입을 강제로 자식클래스로 변환
		list[0].output();
		
		list[1] = new MyTriangle();
		list[1].x = 2;
		list[1].y = 2;
		((MyTriangle)list[1]).setEdge(3);
		((MyTriangle)list[1]).setHeight(4);
		list[1].output();
	}

}
