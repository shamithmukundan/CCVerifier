import java.util.Date;

public class CreditCard1 {
	protected String type;
	protected String cardNumber;
	protected Date expirationDate;
	protected String name;
	CreditCard1(String type){
		this.type = type;
	}
	public String getType() {
		return type;
	}
	public void setType(String cardNumber) {
		this.type = type;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public Date getExpirationDate() {
		return expirationDate;
	}
	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "CreditCard [type=" + type + ", cardNumber=" + cardNumber + ", expirationDate=" + expirationDate
				+ ", name=" + name + "]";
	}
}
