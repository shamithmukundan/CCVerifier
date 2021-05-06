import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class CCVerifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello World");
		String file = "src/test.csv";
		CreditCard cc = new CCVerifier().cardVerify(file);
	}
	
	public CreditCard cardVerify(String file) {
		CreditCard cc = null;
    	try {
   	     	File cardCsv = new File(file);
   	     	Scanner cardReader = new Scanner(cardCsv);
   	     	

   	     	while (cardReader.hasNextLine()) {
   	    	 String csvLine = cardReader.nextLine();
   	    	 String[] cardEntry;
   	    	 if(csvLine != null && csvLine.length() > 0) {
	   	       cardEntry = csvLine.split(",");
	   	       if(CardReaderHelper.isValidEntry(cardEntry)){
	   	       	cc = CardReaderHelper.determineCard(cardEntry[0]);
	   	       	if(cc != null) {
	   	       		cc.setCardNumber(cardEntry[0]);
	   	       		cc.setExpirationDate(new SimpleDateFormat("MM/dd/yyyy").parse(cardEntry[1]));
	   	       		cc.setName(cardEntry[2]);
	   	       	}
	   	       	System.out.println("Created CC" + cc.toString());
	   	       } else {
	   	       	System.out.println("Skipping due to bad format : " + cardEntry);
	   	       }
   	    	 }
   	     	}
   	     	cardReader.close();
   	   } catch (FileNotFoundException e) {
   	     System.out.println("File not found " + file);
   	   } catch (Exception ex) {
   	   	System.out.println("Unknown Error " + ex.getMessage());
   	   }
    	return cc;
	}

}
