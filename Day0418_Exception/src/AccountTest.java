
public class AccountTest {
	public static void main(String[] args) {
		Account myAccount = new Account();
		try{
			myAccount.deposit(100000000);
			System.out.println("입금완료");
		}catch(NegativeNumberException e) {
			e.printStackTrace();
			System.out.println("입금 금액이 잘못 되었습니다.");
		}
		try{
			myAccount.withdraw(200000000);
		}catch(NegativeNumberException e) {
			e.printStackTrace();
			System.out.println("출금 금액이 잔액보다 많습니다.");
		}
		myAccount.showBalance();
	}

}
