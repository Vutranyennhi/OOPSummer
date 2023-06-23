package baitap6;
	public class Account {
	       private long accountNumber;
	       private String name;
	       private double balance;
	       private final double RATE=0.035;
	public Account() {
		super();
	}
	public Account(String name, long accountNumber, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
	}
	public Account(long accountNumber, String name) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getRATE() {
		return RATE;
	}
	public boolean deposit (double amount){
		if (amount>0) {
			balance=balance +amount;
			System.out.print("Gui tien thanh cong");
			System.out.print(balance);
	        return true; }
		else{
			System.out.print("Gui tien khong thanh cong");
			System.out.print(balance);
			return false;

		}		 
	}
	public boolean withdraw(double amount, double fee) {
		if ( amount>0
		  || amount +fee<= balance) {
			balance = balance - (amount + fee);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              
			System.out.print("Rut tien thanh cong");
			System.out.print(balance);
			return true; }
	    else{
		    System.out.print("Rut tien khong thanh cong");
			System.out.print(balance);
			return false;
	    }
		    }
	public double addInterest() {
         return balance + balance *RATE;
         }
	public boolean transfer(Account acc2, double amount) {
		try {
            this.withdraw(amount, fee);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            System.out.println("Loi: " + e.getMessage());
        }
        try {
            acc2.deposit(amount);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            System.out.println("Loi: " + e.getMessage());
        }
    }
	@Override
	public String toString() {
		return "baitap6 [accountNumber=" + accountNumber + ", name=" + name + ", balance=" + balance + ", RATE=" + RATE
				+ "]";
	}
		
	}

