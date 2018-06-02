package thread3;

public class BankAccount {
	private int balance;
	
	public synchronized int getBalance() {
		return balance;
	}
	
	//balance의 값을 더한다
	public synchronized void deposit(int amount) {
		balance = balance + amount;
	}
	//balance의 값을 뺀다
	public synchronized void withdraw(int amount) {
		balance = balance - amount;
	}

}
