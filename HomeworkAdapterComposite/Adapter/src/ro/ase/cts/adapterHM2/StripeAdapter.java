package ro.ase.cts.adapterHM2;

public class StripeAdapter implements PaymentProcessor {


	private Stripe stripe;
	
	public StripeAdapter(Stripe stripe) {
		this.stripe = stripe;
	}

	@Override
	public void processPayment(double amount) {
		stripe.makePayment(amount);
		
	}
	
}
