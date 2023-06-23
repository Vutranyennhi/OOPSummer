package baitap6;

public class main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Account acc1 = new Account ("Ted Murphy", 72354, 102.56);
		 Account acc2 = new Account ("Jane Smith",69713,40.00);
	     Account acc3 = new Account ("Edward Demsey",93757,759.32);
	     //Gởi thêm số tiền cho acc1 là 25.85, cho acc2 là 500.00.
	     acc1.deposit(25.85);
	     acc2.deposit(500.00);
	     //Rút khỏi acc2 số tiền là 430.75, mức phí 1.50.
	     acc2.withdraw(430.75,1.50);
	     //Tính tiền lãi cho acc3.
	     acc3.addInterest();
	     //Xuất thông tin của acc1, acc2, acc3 (kiểm tra lại kết quả).
	     System.out.println(acc1);
	     System.out.println(acc2);
	     System.out.println(acc3);
	     //Chuyển tiền từ acc2 sang cho acc1 số tiền là 100.00.
	     acc2.transfer(acc1, 100.00);
	     //Xuất thông tin của acc1, acc2 (kiểm tra lại kết quả).
	     System.out.println(acc1);
	     System.out.println(acc2);
		}
	  	}

