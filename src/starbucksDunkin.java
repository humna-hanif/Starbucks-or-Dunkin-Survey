import java.util.*;
public class starbucksDunkin {

	public static void main(String[] args) {
		Scanner choice = new Scanner(System.in);
		System.out.println("Which is better: Starbucks or Dunkin?");
		String opinion = choice.nextLine();
		if (opinion.toLowerCase().equals("starbucks")) {
			System.out.println("Yes!");
		} else if (opinion.toLowerCase().equals("dunkin")) {
			System.out.println("Um, you sure? I disagree.");
		}
	}
}
