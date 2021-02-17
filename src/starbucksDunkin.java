import java.util.*;
public class starbucksDunkin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hi! What is your name?");
		String name = sc.nextLine();
		System.out.println("Nice to meet you.");
		System.out.println("I have a question for you, " + name + ".");
		
		Scanner choice = new Scanner(System.in);
		System.out.println("Which is better: Starbucks or Dunkin?");
		String opinion = choice.nextLine();
		if (opinion.toLowerCase().equals("starbucks")) {
			System.out.println("Yes!");
		} else if (opinion.toLowerCase().equals("dunkin")) {
			System.out.println("Um, you sure? I disagree.");
			System.out.println("I think I can change your mind. Would you like to know why I hate Dunkin? Please say yes or no.");
			Scanner response = new Scanner(System.in);
			String why = response.nextLine();
		
			if (why.toLowerCase().equals("yes")) {
				System.out.println("1. Dunkin uses tap water (yes TAP WATER!)");
				System.out.println("2. Their iced coffee is too watery.");
				System.out.println("3. They ALWAYS find a way to mess up someone's order.");
				System.out.println("4. The menu is boring, not many options to choose from.");
				System.out.println("5. The drinks have straight up sugar. They only care about the creamers and sweeteners.");
				System.out.println("I can keep going but if your not convinced already I don't know what to say.");
				System.out.println("In conclusion, if you like Dunkin, your probably a kid who doesn't know what actual coffee tastes like (no offense). Goodbye now!");
			} else if (opinion.toLowerCase().equals("no")) {
				System.out.println("Alrighty then. Goodbye! And just so you know Starbucks is better.");
			} 
			}
		}
	}
