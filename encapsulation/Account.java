package encapsulation;
import java.util.Scanner;
public class Account {
   private String bankname;
   private String name;
   private long accno;
   private String address;
   private String ifsc;
   private int pin;
   private double balance=0.0;
   private String branch;
   
   public Account()
   {
	   
   }
   public Account(String bankname,String name,long accno,String address,String ifsc,int pin,String branch)
   {
	   this.accno=accno;
	   this.address=address;
	   this.bankname=bankname;
	   this.branch=branch;
	   this.ifsc=ifsc;
	   this.name=name;
	   this.pin=pin;
   }
   public void readBankname()
   {
	   System.out.println(bankname);
   }
   public void readName()
   {
	   System.out.println("Name of Account holder is: "+name);
   }
   public void readaccNumber()
   {
	   System.out.println("Account number of Account holder is: "+accno);
   }
   public void readAddress()
   {
	   System.out.println("Address of Account holder is :"+address);
   }
   public void readIfsc()
   {
	   System.out.println("IFSC code of account holder is :"+ifsc);
   }
   public void readBranch()
   {
	   System.out.println("Branch of acount holder is :"+branch);
   }
   public void readPin()
   {
	   System.out.println("Pin of Account holder is: "+pin);
   }
   
   public void readBalance(long acc,int pin)
   {
	   if(this.accno==acc && this.pin==pin)
	   {
		   System.out.println("Login successful!..");
		   System.out.println("balance is :"+balance);
	   }
	   else {
		   System.out.println("Wrong credentials!..");
	   }
   }
   
   public void deposit(long acc,int pin,double amt)
   {
	   if(this.accno==acc && this.pin==pin)
	   {
		   balance+=amt;
		   System.out.println("Your updated balance is: "+balance);
	   }
	   else {
		   System.out.println("Wrong credentials, Fuck You Bitch!!!...");
	   }
   }
   public void withdraw(long acc,int pin,double amt)
   {
	     if(this.accno==acc && this.pin==pin && amt>0)
	     {
	    	 System.out.println("Login Successfull!..");
	    	 {
	    		 if(amt>2000)
	    		 {
	    			 //System.out.println("Withdraw Successful!..");
	    			 Scanner sc=new Scanner(System.in);
	    			 balance-=amt;
	    			 System.out.println("You want to desplay current balance balance ?");
	    			 System.out.println("1.Yes");
	    			 System.out.println("2.No");
	    		     int s=sc.nextInt();
	    		     //System.out.println(s);
	    		     sc.close();
	    		     if(s==1)
	    		     {
	    		    	 System.out.println("Current balance is :"+balance);
	    		    	 System.out.println("Withdraw done");
	    		     }
	    		     else {
	    		    	 System.out.println("Withdraw done");
	    		     }
	    		    
	    		 }
	    		 else {
	    			 System.out.println("You cannot withdraw money!...minimum balance should be 2000rs in account");
	    		 }
	    	 }
	     }
	     else {
	    	 System.out.println("Wrong credentials!...");
	     }
   }
   
}
