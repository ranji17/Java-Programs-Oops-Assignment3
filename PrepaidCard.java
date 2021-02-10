package assignment3;

public abstract class PrepaidCard {
	int cardNo;
	double availableBalance;
	double swipeLimit;

	public PrepaidCard(int cardNo, double availableBalance, double swipeLimit) {
		super();
		this.cardNo = cardNo;
		this.availableBalance = availableBalance;
		this.swipeLimit = swipeLimit;
	}

	public PrepaidCard() {
		// TODO Auto-generated constructor stub
	}

	public abstract boolean swipeCard(double amount);

	public void rechargeCard(double amount) {
		availableBalance = amount + availableBalance;
		System.out.println("After recharge card available balance = " + availableBalance);

	}

	@Override
	public String toString() {
		return "PrepaidCard [cardNo=" + cardNo + ", availableBalance=" + availableBalance + ", swipeLimit=" + swipeLimit
				+ "]";
	}

}
