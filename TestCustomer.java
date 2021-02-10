package assignment4;


public class TestCustomer {
	public static void main(String[] args) {
		Customer cust=new Customer("John",new Address("1st Main HSR Layout","Banglore"),new Address("1st Main Electronics city","Banglore"));
		System.out.println(cust.getCustomerDetails());
	}

}
