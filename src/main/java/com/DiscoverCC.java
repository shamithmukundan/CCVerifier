
public class DiscoverCC extends CreditCard{

	DiscoverCC() {
		super("DiscoverCC");
		// TODO Auto-generated constructor stub
	}

	public static boolean isValid(String cardNumber ){
		return (cardNumber.length() == 16) &&
				cardNumber.startsWith("6011");
	}
}
