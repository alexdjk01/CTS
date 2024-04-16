package ro.ase.cts.adapterHM2;



public class Ex2 {

	public static void main(String[] args)
	{
		PaymentProcessor payPalAdapter = new PayPalAdapter(new PayPal());
		PaymentProcessor stripeAdapter = new StripeAdapter(new Stripe());
		payPalAdapter.processPayment(100);
		stripeAdapter.processPayment(200);
	}
	
}
