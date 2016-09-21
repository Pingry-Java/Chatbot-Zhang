import java.util.Scanner;

/**
 * This class represents a basic AI that will chat with a human user.
 * It isn't very human-like. Yet.....
 * @author William Zhang
 @ @version 0.1
 *
 */
public class chatbot
{
	public static void main (String[] args)
	{
		//Set up a new Scanner
		Scanner keys = new Scanner(System.in);
		
		System.out.println("Hi, I'm Chatbot. What's your name?");
		String userName = keys.nextLine();
		
		System.out.println("Nice to meet you " + userName + ", how old are you?");
		int age = keys.nextInt();  //Leaves the pointer before the newline character
		keys.nextLine(); //Gets the pointer to the beginning of the next line. Always do this after nextInt or nextDouble
		
		if (age > 40 && age<100) //Double ampersand && is "and"
		{
			System.out.println("Wow, that's old.");
			System.out.println("Only " + (100-age) + " years until you're 100!");
		}
		else
		{
			System.out.println("How long until you turn " + (++age) + "?");
			keys.nextLine(); //Lets the user answer, but doesn't store the answer anywhere.
		}
		String answer = ""; //Just to enter the loop the first time
		while (! answer.equals("bye")) // can't use != because that compares references
		{
			System.out.println("Tell me one of your hobbies (or say \"bye\" to exit.");
			answer = keys.nextLine();
		}
	}
}