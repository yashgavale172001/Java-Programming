import java.util.Scanner;
class Hotel 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("****Welcome to restaurant****");
		System.out.println("which type of food you want to eat");
		System.out.println("1.Veg");
		System.out.println("2.Non Veg");
        int i=sc.nextInt();

		switch(i)
		{
			case 1:
			{
				System.out.println("MENUE CARD");
				System.out.println("1. Veg Biryani .........190rs");
				System.out.println("2. Paneer masala.........160rs");
				System.out.println("3. pav bhaji ........... 100rs");
				System.out.println("4. Paneer Tikka Masala...........180rs");
				System.out.println("5. shev bhaji........100rs");
                int ip=sc.nextInt();
				switch(ip)
				{
					case 1:
					{
						System.out.println("this is your veg biryani and your bill is 190rs");
						break;
					}
					case 2:
					{
						System.out.println("this is your Paneer masala and your bill is 160rs");
						break;
					}
					case 3:
					{
						System.out.println("this is your pav bhaji and your bill is 100rs");
						break;
					}
					case 4:
					{
						System.out.println("this is your Paneer tikka masala and your bill is 180rs");
						break;
					}
					case 5:
					{
						System.out.println("this is your shev bhaji and your bill is 100rs");
						break;
					}
					default:
					{
						System.out.println("You choose wrong option");
					}
				}
				break;
			}
			case 2:
			{
				System.out.println("MENUE CARD");
				System.out.println("1. Non-Veg Biryani .........250rs");
				System.out.println("2. Chicken handi.........320rs");
				System.out.println("3. Butter chicken ........... 400rs");
				System.out.println("4. Leg piece(4 Pieces)...........280rs");
				System.out.println("5. Anda Rice........170rs");
                int ip=sc.nextInt();
				switch(ip)
				{
					case 1:
					{
						System.out.println("this is your Non-veg biryani and your bill is 250rs");
						break;
					}
					case 2:
					{
						System.out.println("this is your Chicken Handi and your bill is 320rs");
						break;
					}
					case 3:
					{
						System.out.println("this is your Butter chicken and your bill is 400rs");
						break;
					}
					case 4:
					{
						System.out.println("this is your Leg piece(4 Pieces) and your bill is 280rs");
						break;
					}
					case 5:
					{
						System.out.println("this is your Anda Rice and your bill is 170rs");
						break;
					}
					default:
					{
						System.out.println("You choose wrong option");
					}

					break;

			}
			}
			default:
				{
					System.out.println("You are not from this planate");
				}
		}
	}
}
