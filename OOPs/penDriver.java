class penDriver 
{
	public static void main(String[] args) 
	{
		pen p=new pen();
		p.display();
		pen p1=new pen("ballpen","blue",2);
		p1.display();
		pen p2=new pen("ballpen","blue",2,"papersoft");
		p2.display();
	}
}
