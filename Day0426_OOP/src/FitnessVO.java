// class�� � ������ �ϴ��Ŀ� ���� �Ҹ��� �̸��� �ٸ�
// ex ) vo, service, dao, dto....
public class FitnessVO {
	// userid, name, height, weight, bmi, result
	private String userid;
	private String name;
	private double height;
	private double weight;
	private double bmi; // ������ / Ű(m)�� ����;
	private String result;

	// ������(Constructor) : JVM�� ���� �⺻�������� ���� ����(�� ������� �ڵ�������)
	public FitnessVO() {}

	
	public FitnessVO(String userid, String name, double height, double weight) {
		this.userid = userid;
		this.name = name;
		this.height = height;
		this.weight = weight;
		calcBmi();	
		calcResult();
	}


	// Source -> Generate Getters and Setters... ���� ��������
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
		double temp = this.height / 100; // ==> ���ͷ� ȯ��
		this.bmi = this.weight / (temp * temp);
		calcResult();
	}

	public void calcResult() {
		if (this.bmi >= 35)
			this.result = "�� ��";
		else if (this.bmi >= 30)
			this.result = "�ߵ� ��";
		else if (this.bmi >= 25)
			this.result = "�浵 ��";
		else if (this.bmi >= 23)
			this.result = "��ü��";
		else if (this.bmi >= 18.5)
			this.result = "��   ��";
		else
			this.result = "��ü��";
	}

	public void output() {
		System.out.printf("%s %s %.2fcm %.2fkg %.2f => %s%n", userid, name, height, weight, bmi, result);
	}
}
