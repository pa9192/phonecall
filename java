
public abstract class PhoneCall 
{

	private String phoneno;
	private double price;

	public PhoneCall(String phoneno, double price) 
	{
		this.phoneno =  phoneno;
		this.price = price;
	}
	public String getphoneno()
	{
		return phoneno;
	}
	public double getprice()
	{
		return price = 0.0;
	}

	public static void main(String[] args) {

	}

}
public class IncomingPhoneCall extends PhoneCall
{

	public IncomingPhoneCall(String phoneno, double price) {
		super(phoneno, price);

	}
	
}
public class OutgoingPhoneCall extends PhoneCall
{

	public OutgoingPhoneCall(String phoneno, double price) {
		super(phoneno, price);

	}
	
}
