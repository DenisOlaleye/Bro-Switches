import java.util.Scanner;

public class Switches
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		String desire;
		
		System.out.println("School of magic offers: basketball, weed, training, singing, hustling");
		System.out.print("Enter your desire: ");
		desire = input.nextLine();
		
		switch(desire)
		{
		case "basketball": System.out.println("Let's go on the yard!");
		break;
		case "weed": System.out.println("Let's roll some blants!");
		break;
		case "training": System.out.println("Let's go hard!");
		break;
		case "singing": System.out.println("Let's go on the studio!");
		break;
		case "hustling": System.out.println("Let's go on the street!");
		break;
		default: System.out.println("There is no such activity in our school yet");
		}
		
		
	}
}






/*public class Switches 
{

	public static void main(String[] args) 
	{
	//switch = statement that allows a variable to be tested for equality against a list of values
		
		String day = "Big tasty";
		
		switch(day) 
		{
		case "Sunday": System.out.println("It is Sunday");		
		break;
		case "Monday": System.out.println("It is Monday");
		break;
		case "Tuesday": System.out.println("It is Tuesday");
		break;
		case "Wednesday": System.out.println("It is Wednesday");
		break;
		case "Thursday": System.out.println("It is Thursday");
		break;
		case "Friday": System.out.println("It is Friday");
		break;
		case "Saturday": System.out.println("It is Saturday");
		default: System.out.println(day+ " is not a day");
		
		}
		
	}
}
*/