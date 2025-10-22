package services;

public interface OnlinePaymentService {

	

	public Double interest(Double amount, Integer months);
	Double paymentFee(Double amount);
}
