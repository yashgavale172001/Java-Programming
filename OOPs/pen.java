class pen 
{
	String brand="Camlin"; // non static initialiser
	String name;
	String color;
	double price;

	{
		System.out.println("ststic block 1");
	}
	
     pen()
	{
		System.out.println("No argument constructor object 1");
	}

	{
		System.out.println("static block 2");
	}

	pen(String name,String color,double price)
	{
		this.name=name;
		this.color=color;
		this.price=price;
		System.out.println("parameterised constructor1 object 2");
	}

	pen(String name,String color,double price,String brand)
	{
		this.name=name;
		this.color=color;
		this.price=price;
		this.brand=brand;
		System.out.println("parameterised  constructor2 object 3 ");
	}

	{
		System.out.println("ststic block 3");
	}



	public void display()
	{
		System.out.println(brand);
		System.out.println(price);
		System.out.println(color);
		System.out.println(name);
	}

}
