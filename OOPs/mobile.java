class mobile 
{
	double price;
	String brand;
	String name;
	String color;

	mobile()
	{
		System.out.println("No Argument Constructor");
	}
	mobile(double price,String brand,String name,String color)
	{
		this.price=price;
		this.brand=brand;
		this.name=name;
		this.color=color;
	}

	public void display()
	{
		System.out.println(price);
		System.out.println(brand);
		System.out.println(name);
		System.out.println(color);
	}
}
