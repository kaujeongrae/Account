
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
			System.out.println("�ܾ��� 0 ���Ϸ� �϶��߽��ϴ�.");
		}
	}
	public void nextMonth(int month){
		if(balance>=0)
			balance=balance+balance*interest;
		else
			balance=balance-balance*loan_interest;
	}
	
}
