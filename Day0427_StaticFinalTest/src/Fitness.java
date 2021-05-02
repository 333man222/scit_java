
public class Fitness {
	// userid, name, height, weight, bmi, result
	private String userid;
	private String name;
	private double height;
	private double weight;
	private double bmi;
	private String result;
	
	
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
	public void calcBmi() {
		double total = height / 100;
		this.bmi = this.weight / (total * total);
		calcResult();
	}
	public void calcResult() {
		if(this.bmi >= 35) 
			System.out.println("����");
		else if(this.bmi >= 30)
			System.out.println("�浵��");
		else if (this.bmi >= 25)
			this.result = "�浵 ��";
		else if (this.bmi >= 23)
			this.result = "��ü��";
		else if (this.bmi >= 18.5)
			this.result = "��   ��";
		else
			this.result = "��ü��";
	}
	
	
	
}
