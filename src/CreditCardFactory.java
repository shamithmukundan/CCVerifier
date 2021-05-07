
public class CreditCardFactory extends AbstractFactory{
	
	@Override
	CreditCard getCard(String cardNumber) {
		CreditCard cc = null;
		if((cardNumber.length() == 13 || cardNumber.length() == 16) && cardNumber.startsWith("4")){
	         cc = new VisaCC();         
	    }else if((cardNumber.length() == 16) && cardNumber.startsWith("4") && cardNumber.substring(1,2).matches("[1-5]")){
	         cc = new MasterCC();
	      }else if((cardNumber.length() == 16) && cardNumber.startsWith("6011")){
		     cc = new DiscoverCC();
		  }else if((cardNumber.length() == 15) && cardNumber.startsWith("3") && cardNumber.substring(1,2).matches("[4|7]")){
		     cc = new AmExCC();
		  }
	return cc;
	}
}
