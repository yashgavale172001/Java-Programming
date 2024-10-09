package Inheritance;

public class SLevelBankAcc 
{
   long accno;
   String ifsc;
   String branch;
   String bankname;
   
   public void displayBankAcc()
   {
	   System.out.println("Account number is "+accno);
	   System.out.println("branch is"+branch);
	   System.out.println("IFSC Code is "+ifsc);
	   System.out.println("BankName is "+bankname);
   }
}
