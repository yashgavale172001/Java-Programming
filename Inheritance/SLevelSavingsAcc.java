package Inheritance;

public class SLevelSavingsAcc extends SLevelBankAcc
{
   double balance;
   double interest;
   
   SLevelSavingsAcc(long accno,String ifsc,String branch,String bankname,double balance,double interest)
   {
	   this.accno=accno;
	   this.ifsc=ifsc;
	   this.branch=branch;
	   this.bankname=bankname;
	   
	   this.balance=balance;
	   this.interest=interest;
   }
   public void displaySavingBankAcc()
   {
	   System.out.println("Account number is "+accno);
	   System.out.println("branch is"+branch);
	   System.out.println("IFSC Code is "+ifsc);
	   System.out.println("BankName is "+bankname);
	   System.out.println("Balance is "+balance);
	   System.out.println("Interest is "+interest);
   }

}
