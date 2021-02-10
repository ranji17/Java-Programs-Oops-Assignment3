package assignment5;

import java.util.Date;

public class Syrup extends Medicine{

	public Syrup() {
		super();
		price=500;
		expiryDate=new Date();
		
		// TODO Auto-generated constructor stub
	}

	public Syrup(double price, Date expiryDate) {
		super(price, expiryDate);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void displayLabel() {
		// TODO Auto-generated method stub
		System.out.println("Syrup"+ "\n"+" Shake well before use");
		
	}

}
