class Vehicle{
	private String brand;
	public Vehicle() { }
	public Vehicle(String brand) {
		super();
		this.brand = brand;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "[brand=" + brand + "]";
	}
	
}

class Car extends Vehicle {
	private int displacement; //배기량
	public Car() {	}
	public Car(int displacement) {
		super();
		this.displacement = displacement;
	}
	public int getDisplacement() {
		return displacement;
	}
	public void setDisplacement(int displacement) {
		this.displacement = displacement;
	}
	
	@Override
	public String toString() {
		return super.getBrand() + "[배기량=" + displacement + "]";
	}
	
}
public class VehicleTest {

	public static void main(String[] args) {
		Vehicle v1 = new Car(4000);	//이퀄의 왼쪽에 부모 이퀄의 오른쪽에 자식 (다형성)
		v1.setBrand("현대");
		System.out.println(v1);
		
		Vehicle v2 = new Car(5000);
		v2.setBrand("기아");
		System.out.println(v2);
		
		
//		Car c1 = new Car();
//		c1.setBrand("현대");
//		c1.setDisplacement(4000);
//		
//		System.out.println(c1);
//		
//		Car c2 = new Car(5000);
//		c2.setBrand("Ford");
//		System.out.println(c2);
		
	}

}
