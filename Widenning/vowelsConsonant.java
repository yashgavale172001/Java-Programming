import java.util.Scanner;
class vowelsConsonant 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter the character: ");
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
        
		if(ch>='a' && ch<='z' ||ch>='A' && ch>='Z')
		{
			switch(ch)
		    {
			    case 'a':
			    case 'e':
				case 'i':
				case 'o':
				case 'u':
				case 'A':
				case 'E':
				case 'I':
				case 'O':
				case 'U':
				{
					System.out.println("It is an vowels");
				}

				default:
				{
					System.out.println("It is  consonant");
				}
		    }
		}
		else{
			System.out.println("Its not an alphabet");
		}
	}
}
