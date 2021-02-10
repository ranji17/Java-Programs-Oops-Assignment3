package assignment2;

public class EngineeringBookTest {
	public static void main(String[] args) {
		EngineeringBook book=new EngineeringBook();
		book.setBookNo(102);
		book.setAuthor("Reddy");
		book.setTitle("Python");
		book.setPrice(800);
		book.setCategory("Programming Language");
		System.out.println(book);
	}

}
