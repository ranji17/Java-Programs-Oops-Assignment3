package assignment5;

import java.util.Date;

public abstract class Medicine {
	double price;
	Date expiryDate;

	public Medicine() {
		super();

		// TODO Auto-generated constructor stub
	}

	public Medicine(double price, Date expiryDate) {
		super();
		this.price = price;
		this.expiryDate = expiryDate;
	}

	public void getDetails() {
		System.out.println("Price = " + price + " Expiry Date = " + expiryDate);
	}

	public abstract void displayLabel();

}
