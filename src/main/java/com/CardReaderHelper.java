
public class CardReaderHelper {
	public static boolean isValidEntry(String[] cardEntry) {
		return cardEntry.length == 3 &&
				cardEntry[0].length() <= 19;
	}

	public static CreditCard determineCard(String cardNumber) {
    	if(VisaCC.isValid(cardNumber)) {
    		return new VisaCC();
    	} else if(MasterCC.isValid(cardNumber)) {
    		return new MasterCC();
    	} else if (AmExCC.isValid(cardNumber)) {
    		return new AmExCC();
    	} else if (DiscoverCC.isValid(cardNumber)) {
    		return new DiscoverCC();
    	} else {
    		System.out.println("Skipping due to unknown CC : " + cardNumber);
    		return null;
    	}
	}

}
