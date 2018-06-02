package thread3;

public class User implements Runnable{
	//통장에 돈을 입금했다가 출금했다가 하는 기능을 가짐
	BankAccount account;
	
	public User(BankAccount account) {
		this.account = account;
	}
	
	//사람1,사람2가 동시에 >>> 스레드로 실행
	//통장에 돈을 10000원 입금, 좀있다가 10000원 출금: 
	
	public void run() {
		for(int i=0;i<50;i++) {
			account.deposit(10000);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			account.withdraw(10000);
			
			System.out.println(account.getBalance());
		}
	}
}
