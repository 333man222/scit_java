package diet.vo;

public class Body {
	private String user_id;
	private int height; 
	private int weight; 
	private double body_bmi;
	private String body_type;
	private String recom_id;
	
	public Body(String user_id, int height, int weight, double body_bmi, String body_type, String recom_id) {
		super();
		this.setUser_id(user_id);
		this.height = height;
		this.weight = weight;
		this.body_bmi = body_bmi;
		this.body_type = body_type;
		this.recom_id = recom_id;
	}
	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public double getBody_bmi() {
		return body_bmi;
	}

	public void setBody_bmi(double body_bmi) {
		this.body_bmi = body_bmi;
	}

	public String getBody_type() {
		return body_type;
	}

	public void setBody_type(String body_type) {
		this.body_type = body_type;
	}

	public String getRecom_id() {
		return recom_id;
	}

	public void setRecom_id(String recom_id) {
		this.recom_id = recom_id;
	}
	@Override
	public String toString() {
		return "Body [user_id=" + user_id + ", height=" + height + ", weight=" + weight + ", body_bmi=" + body_bmi
				+ ", body_type=" + body_type + ", recom_id=" + recom_id + "]";
	}


}
