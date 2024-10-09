class FormDriver 
{
	String name;
	int age;
	double percentage;
	String Email;
	String degree;
	double aggregate;
	String mono;

	String blood;
	double ht;
	double weight;

	FormDriver()
	{
		
	}
	FormDriver(String name,int age,double percentage,String Email,String degree,double aggregate,String mono)
	{
		this.name=name;
		this.age=age;
		this.percentage=percentage;
		this.Email=Email;
		this.degree=degree;
		this.aggregate=aggregate;
		this.mono=mono;
	}

	FormDriver(String name,int age,double percentage,String Email,String degree,double aggregate,String mono,String blood)
	{
		this.name=name;
		this.age=age;
		this.percentage=percentage;
		this.Email=Email;
		this.degree=degree;
		this.aggregate=aggregate;
		this.mono=mono;

		this.blood=blood;
	}

	FormDriver(String name,int age,double percentage,String Email,String degree,double aggregate,String mono,String blood,double ht)
	{
		this.name=name;
		this.age=age;
		this.percentage=percentage;
		this.Email=Email;
		this.degree=degree;
		this.aggregate=aggregate;
		this.mono=mono;

		this.blood=blood;
		this.ht=ht;
	}

	FormDriver(String name,int age,double percentage,String Email,String degree,double aggregate,String mono,String blood,double ht,double wt)
	{
		this.name=name;
		this.age=age;
		this.percentage=percentage;
		this.Email=Email;
		this.degree=degree;
		this.aggregate=aggregate;
		this.mono=mono;

		this.blood=blood;
		this.ht=ht;
		weight=wt;
	}

	public void displayForm()
	{
		System.out.println(name);
		System.out.println(age);
		System.out.println(percentage);
		System.out.println(Email);
		System.out.println(degree);
		System.out.println(aggregate);
		System.out.println(mono);
		System.out.println(blood);
		System.out.println(ht);
		System.out.println(weight);
	}
}
