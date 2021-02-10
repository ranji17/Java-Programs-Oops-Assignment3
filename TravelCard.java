package assignment3;

public class TravelCard extends PrepaidCard implements Rewardable {

	int rewardPoints = 0;

	public TravelCard(int cardNo, double availableBalance, double swipeLimit, int rewardPoints) {
		super(cardNo, availableBalance, swipeLimit);
		this.rewardPoints = rewardPoints;
	}

	public TravelCard() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean swipeCard(double amount) {
		// TODO Auto-generated method stub

		amount = amount * 60;
		if (amount <= swipeLimit && amount <= availableBalance) {
			double remainBalance = availableBalance - amount;
			remainBalance = remainBalance - 0.05 * remainBalance;
			System.out.println("After swipe card Balance= " + remainBalance);
			System.out.println("Transaction Successfull");
			return true;
		} else {

			System.out.println("Transaction can't done");

			return false;
		}

	}

	@Override
	public int rewards(double amount) {
		// TODO Auto-generated method stub

		while (amount >= 100) {
			rewardPoints += 5;
			amount = amount - 100;
		}

		return rewardPoints;
	}

}
