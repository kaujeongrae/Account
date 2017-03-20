
public class Account {
	private double balance;
	
	public void credit(double money){
		balance+=money;
	}
	public void debit(double money){
		if(money>balance)
			System.out.println("잔고가 부족합니다.");
		balance-=money;
	}
	public void getBalance(){
		System.out.printf("Account1 balance: %f",balance);
		System.out.printf("Account2 balance: %f",balance);
	}
	
	protected void setBalance(double balance){
		this.balance=balance;
	}
}
