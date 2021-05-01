
public class VisaCC extends CreditCard{

	VisaCC() {
		super("VisaCC");
		// TODO Auto-generated constructor stub
	}

	public static boolean isValid(String cardNumber){
		return (cardNumber.length() == 13 ||
				cardNumber.length() == 16) &&
				cardNumber.startsWith("4");
	}
}
