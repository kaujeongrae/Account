
public class CheckingAccount extends Account {
	private double credit_limit;
	private double interest;
	private double loan_interest;
	
	CheckingAccount(){
		this.credit_limit=credit_limit;
		this.interest=interest;
		this.loan_interest=loan_interest;
	}
	public void debit(double money){
		if(balance<0){
			System.out.println("잔액이 0 이하로 하락했습니다.");
		}
	}
	public void nextMonth(int month){
		if(balance>=0)
			balance=balance+balance*interest;
		else
			balance=balance-balance*loan_interest;
	}
	
}
