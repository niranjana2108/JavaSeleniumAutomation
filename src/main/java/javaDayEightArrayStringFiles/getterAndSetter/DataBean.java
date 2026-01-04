package javaDayEightArrayStringFiles.getterAndSetter;

public class DataBean {
	
	private int operandOne;
	private int operandTwo;
	private static int counter;
	private String data;

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public int getOperandOne() {
		return operandOne;
	}
	public void setOperandOne(int operandOne) {
		this.operandOne = operandOne;
	}
	public int getOperandTwo() {
		return operandTwo;
	}
	public void setOperandTwo(int operandTwo) {
		this.operandTwo = operandTwo;
	}
	public static int getCounter() {
		return counter;
	}
	public static void setCounter(int counter) {
		DataBean.counter = counter;
	}
	@Override
	public String toString() {
		return "DataBean [operandOne=" + operandOne + ", operandTwo=" + operandTwo + "]";
	}
	
	
	
	
	
	

}
