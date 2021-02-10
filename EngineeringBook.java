package assignment2;

public class EngineeringBook extends Book{
	private String category;

	
	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	@Override
	public String toString() {
		return super.toString()+"EngineeringBook [category=" + category + "]";
	}


	
	

}
