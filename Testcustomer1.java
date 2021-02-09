package rough;

class Address{
	private String Addressline;
	private String City;
	
	



	public Address(String addressline, String city) {
		super();
		Addressline = addressline;
		City = city;
	}

    
	
	public String getAddressline() {
		return Addressline;
	}



	public void setAddressline(String addressline) {
		Addressline = addressline;
	}



	public String getCity() {
		return City;
	}



	public void setCity(String city) {
		City = city;
	}



	String getAddressdetails() {
		System.out.println("Address details :"+Addressline+City);
		return getAddressdetails();
		
		
		
	}
    

	
}

class Customer{
	private String Addressdetails = "1st main road btm, bangalore";
	private String Customername;
	private String ResidentialAddress;
	
	
	
	public Customer(String customername, String residentialAddress) {
		super();
		Customername = customername;
		ResidentialAddress = residentialAddress;
	}
	public String getCustomername() {
		return Customername;
	}
	public void setCustomername(String customername) {
		Customername = customername;
	}
	public String getResidentialAddress() {
		return ResidentialAddress;
	}
	public void setResidentialAddress(String residentialAddress) {
		ResidentialAddress = residentialAddress;
	}
	public String getcustomerdetails(){
		System.out.println("Customer name :"+Customername);
		System.out.println("ResidentialAddress:"+Addressdetails);
		return getcustomerdetails();
		
	}
	

		
}

public class Testcustomer1  {

	public static void main(String[] args) {
		Customer cu = new Customer("john","1st main road btm , bangalore");
		cu.getResidentialAddress();
		cu.getcustomerdetails();
		
		


	}

}




