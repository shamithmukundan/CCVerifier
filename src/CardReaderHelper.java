
public class CardReaderHelper {
	public static boolean isValidEntry(String[] cardEntry) {
		return cardEntry.length == 3 &&
				cardEntry[0].length() <= 19;
	}
}
