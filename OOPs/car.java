class car 
{
	String brand;
	String name;
	String color;
	int model;

	car(String brand,String name,String color,int model)
	{
		this.brand=brand;
		this.name=name;
		this.color=color;
		this.model=model;
	}

	public void display()
	{
		System.out.println(brand);
		System.out.println(name);
		System.out.println(color);
		System.out.println(model);
	}

}
