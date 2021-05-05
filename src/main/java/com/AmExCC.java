
public class AmExCC extends CreditCard{

	AmExCC() {
		super("AmExCC");
		// TODO Auto-generated constructor stub
	}

	public static boolean isValid(String cardNumber ){
		return (cardNumber.length() == 15) &&
				cardNumber.startsWith("3") &&
				cardNumber.substring(1,2).matches("[4|7]");
	}
}
