package javaDayNineExceptionTypeCastDateEnum.typeCasting;

public class TypeCastExampleWidening {

	public static void main(String[] args) {
		int number = 237;
		
		long longConvert = (long)number;
		
		double doubleConvert = (double)number;
		
		String a = Integer.toString(number);
		
		System.out.println(number+"\n"+longConvert+"\n"+doubleConvert+"\n"+a);
		
		}

}
