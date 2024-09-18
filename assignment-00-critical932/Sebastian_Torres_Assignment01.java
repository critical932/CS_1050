
import java.util.Scanner;  //Needed for the Scanner class

public class Sebastian_Torres_Assignment01 
{
	public static void main(String[] args) 
	{
		String input;   // To hold a line of input
		char answer;    // To hold a single character
			
		// Create a Scanner object for keyboard input.
		Scanner keyboard = new Scanner(System.in);
		
		// Ask the user a question
		System.out.print("Are you having fun? (Y=yes, N=no) ");
		input = keyboard.nextLine();   // Get a line of input.
		answer = input.charAt(0);      // Get the first character

		if(answer=='N') {
			System.out.println("Sorry to hear that you are not having fun. "
					+ "Let read this story to see if it will get better.\n\n"
					+ "Once upon a time, in a land of technology, "
					+ "there was a computer that started acting up.\n"
					+ "inconvenient times, and generally causing chaos.\n\n"
					+ "The owner, frustrated, decided to consult a computer wizard "
					+ "renowed for fixing the most stubborn issue.\nThe wizard "
					+ "approached the computer, waved a magical mouse, and uttered "
					+ "the words: \"Ctrl + Alt + Del!\" \nTo everyone's surprise, "
					+ "the computer responded, \"Are you sure you want to delete all "
					+ "your problems and start a new life?\"\n\nThe owner burst "
					+ "into laughter, realizing that sometimes a little humor can be "
					+ "the best solution to tech troubles.\n And from that day on, "
					+ "they lived happily ever after, sharing a chuckle whenever "
					+ "the computer misbehaved.");
			}
		else {
			System.out.println("AWESOME. There will be a lot more fun coming.");
			}
		
		keyboard.close();
	}
}
