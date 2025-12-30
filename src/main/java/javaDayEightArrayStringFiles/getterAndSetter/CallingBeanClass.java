package javaDayEightArrayStringFiles.getterAndSetter;

public class CallingBeanClass extends DataBean {
	
	public static void main(String[] args) {
		DataBean dataBean = new DataBean();
		dataBean.setOperandOne(10);
		dataBean.setOperandTwo(20);
		
		System.out.println(dataBean.toString());
		System.out.println(dataBean.getOperandOne());

	}

}
