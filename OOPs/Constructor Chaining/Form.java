class Form 
{
	public static void main(String[] args) 
	{
		FormDriver yash=new FormDriver();
        yash.displayForm();
		FormDriver manya=new FormDriver("manya",22,89,"manya@gmail.com","BE",77.8,"8380993133");
		manya.displayForm();
        FormDriver yash0=new FormDriver("yash",22,89,"yashya@gmail.com","BE",77.8,"7276590778","A+");
		yash0.displayForm();
		FormDriver yash1=new FormDriver("yash",22,89,"yashya@gmail.com","BE",77.8,"7276590778","A+",5.2);
		yash1.displayForm();
		FormDriver yash2=new FormDriver("yash",22,89,"yashya@gmail.com","BE",77.8,"7276590778","A+",5.2,58.34);
		yash2.displayForm();
	}
}
