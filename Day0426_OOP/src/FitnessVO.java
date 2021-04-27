// class는 어떤 역할을 하느냐에 따라서 불리는 이름이 다름
// ex ) vo, service, dao, dto....
public class FitnessVO {
	// userid, name, height, weight, bmi, result
	private String userid;
	private String name;
	private double height;
	private double weight;
	private double bmi; // 몸무게 / 키(m)의 제곱;
	private String result;

	// 생성자(Constructor) : JVM이 만든 기본생성자의 모양과 같음(안 만들더라도 자동생성됨)
	public FitnessVO() {}

	
	public FitnessVO(String userid, String name, double height, double weight) {
		this.userid = userid;
		this.name = name;
		this.height = height;
		this.weight = weight;
		calcBmi();	
		calcResult();
	}


	// Source -> Generate Getters and Setters... 에서 생성가능
	public String getUserid() {
		return userid;
	}

	public String getName() {
		return name;
	}

	public double getHeight() {
		return height;
	}

	public double getWeight() {
		return weight;
	}

	public double getBmi() {
		return bmi;
	}

	public String getResult() {
		return result;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public void setName(String name) {
	
		this.name = name;
	}

	public void setHeight(double height) {
		this.height = height;
		calcBmi();
	}

	public void setWeight(double weight) {
		this.weight = weight;
		calcBmi();
	}

	protected void calcBmi() {
		System.out.println("called calcBmi");
		double temp = this.height / 100; // ==> 미터로 환산
		this.bmi = this.weight / (temp * temp);
		calcResult();
	}

	public void calcResult() {
		if (this.bmi >= 35)
			this.result = "고도 비만";
		else if (this.bmi >= 30)
			this.result = "중도 비만";
		else if (this.bmi >= 25)
			this.result = "경도 비만";
		else if (this.bmi >= 23)
			this.result = "과체중";
		else if (this.bmi >= 18.5)
			this.result = "정   상";
		else
			this.result = "저체중";
	}

	public void output() {
		System.out.printf("%s %s %.2fcm %.2fkg %.2f => %s%n", userid, name, height, weight, bmi, result);
	}
}
