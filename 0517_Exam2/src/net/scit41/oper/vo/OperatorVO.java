package net.scit41.oper.vo;

public class OperatorVO {
	private int num;
	private String Operator;
	private String total;
	
	public OperatorVO() { }

	public OperatorVO(int num, String operator, String total) {
		super();
		this.num = num;
		Operator = operator;
		this.total = total;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getOperator() {
		return Operator;
	}

	public void setOperator(String operator) {
		Operator = operator;
	}

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "OperatorVO [num=" + num + ", Operator=" + Operator + ", total=" + total + "]";
	}
	

	
}
