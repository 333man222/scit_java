
public class CalculatorTest {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		int a =3, b = 5, c = 3, d = 2, e = 3, f = 4;
		
		System.out.println(a + "+" + b + "=" + calc.add(a, b));
		System.out.println(a + "-" + b + "=" + calc.substract(a, b));
		System.out.println(a + "*" + b + "=" + calc.multiply(a, b));
		System.out.println(a + "/" + b + "=" + calc.divide(a, b));
		System.out.println(c + "%" +  d + "=" + calc.mod(c, d));
		System.out.println(e + "^" + f + "=" + calc.power(e, f));
		

	}

}
