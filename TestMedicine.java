package assignment5;

import java.util.Random;

public class TestMedicine {
	public static void main(String[] args) {
		Random rand = new Random();
		Medicine arr[] = new Medicine[5];
		arr[0] = new Tablet();

		arr[1] = new Syrup();
		arr[2] = new Ointment();

		int rand_arr = rand.nextInt(3);

		Medicine m = arr[rand_arr];
		m.displayLabel();
		m.getDetails();

	}

}
