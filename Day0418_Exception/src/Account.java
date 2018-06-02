
public class Account {
	//입금과 출금 기능이 있고, 잔고(정수)를 저장할 수 있다.
	//입금은 0원 이상 가능
	//잔고 조회기능이 있다.
	private int balance;
	public void deposit(int amount) throws NegativeNumberException{
		//더하기 전에 입력받은 수가 음수인지 양수인지 판단해서
		//음수이면 NegativeNumberException 발생시키기
		if(amount < 0) {
			throw new NegativeNumberException();
		}
		
		balance += amount;
	}
	public void withdraw(int amount) throws NegativeNumberException{
		
		if(balance < amount) {
			throw new NegativeNumberException();
		}
		balance -= amount;
	}
	public void showBalance() {
		System.out.println("잔고는" + balance + "원 입니다.");
	}
}
