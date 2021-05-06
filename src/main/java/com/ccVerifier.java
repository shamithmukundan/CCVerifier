import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class ccVerifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello World");
		String file = "src/test.csv";
		CreditCard cc = new ccVerifier().cardVerify(file);
	}
	
	public CreditCard cardVerify(String file) {
		
    	try {
   	     	File cardCsv = new File(file);
   	     	Scanner cardReader = new Scanner(cardCsv);
   	     	CreditCard cc = null;

   	     	while (cardReader.hasNextLine()) {
   	    	 String csvLine = cardReader.nextLine();
   	    	 String[] cardEntry;
   	    	 if(csvLine != null && csvLine.length() > 0) {
	   	       cardEntry = csvLine.split(",");
	   	       if(CardReaderHelper.isValidEntry(cardEntry)){
	   	       	CreditCard cc = CardReaderHelper.determineCard(cardEntry[0]);
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
   	     	return cc;
   	   } catch (FileNotFoundException e) {
   	     System.out.println("File not found " + args[0]);
   	   } catch (Exception ex) {
   	   	System.out.println("Unknown Error " + ex.getMessage());
   	   }
	}

}
