package encapsulation;

public class AccountDriver 
{
     public static void main(String args[]) 
     {
    	 Account a=new Account("SBI","Yash Vijay Gavale",359711961,"nehru nagar,nandurbar","SBIN0000435",1234,"Nandurbar");
    	 a.deposit(123456789, 1044, 184267);
    	 a.deposit(359711961,1234, 184267);
    	 
    	 a.readaccNumber();
    	 
    	 a.readAddress();
    	 a.readBalance(359711961, 1234);
    	 a.readBankname();
    	 a.readName();
    	 
    	 a.withdraw(359711961, 1234, 2001);
    	 
     }
}
