
public class MasterCC extends CreditCard{

	MasterCC() {
		super("MasterCC");
		// TODO Auto-generated constructor stub
	}
	
	public static boolean isValid(String cardNumber ){
		return (cardNumber.length() == 16) &&
				cardNumber.startsWith("4") &&
				cardNumber.substring(1,2).matches("[1-5]");
	}
}
