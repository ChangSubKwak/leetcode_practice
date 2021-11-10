package leetcode;

public class LC2043_SimpleBankSystem {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		String[] operation = new String[] {"Bank", "withdraw", "transfer", "deposit", "transfer", "withdraw"};
		long[] balance = new long[] {10, 100, 20, 50, 30};
		
		Bank obj = new Bank(balance);
	}
}

class Bank {
	private long[] balance;

	public Bank(long[] balance) {
		this.balance = balance;
	}

	public boolean transfer(int account1, int account2, long money) {
		try {
			if (account1 < 1 || balance.length < account1)
				return false;
			if (account2 < 1 || balance.length < account2)
				return false;
			if (money < 0 || 1_000_000_000_000L < money)
				return false;

			if (balance[account1 - 1] < money) {
				return false;
			}
			balance[account1 - 1] -= money;
			balance[account2 - 1] += money;
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public boolean deposit(int account, long money) {
		try {
			if (account < 1 || balance.length < account)
				return false;
			if (money < 0 || 1_000_000_000_000L < money)
				return false;

			balance[account - 1] += money;
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public boolean withdraw(int account, long money) {
		try {
			if (account < 1 || balance.length < account)
				return false;
			if (money < 0 || 1_000_000_000_000L < money)
				return false;

			if (balance[account - 1] < money) {
				return false;
			}
			balance[account - 1] -= money;
		} catch (Exception e) {
			return false;
		}
		return true;
	}
}