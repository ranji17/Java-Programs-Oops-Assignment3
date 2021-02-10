package assignment5;

import java.util.Date;

public class Tablet extends Medicine{

	public Tablet() {
		super();
		price=500;
		expiryDate=new Date();
		// TODO Auto-generated constructor stub
	}

	public Tablet(double price, Date expiryDate) {
		super(price, expiryDate);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void displayLabel() {
		// TODO Auto-generated method stub
		System.out.println("Tablet"+"\n"+"Store in a cool dry place");
		
	}

}
