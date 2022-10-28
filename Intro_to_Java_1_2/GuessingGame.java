public class GuessingGame {


    // Java Program to guess a Random Number Generation

	public static void main(String[] args)
	{

		// stores actual and guess number
		int answer, guess;

		// maximum value is 1000
		int MAX = 1000;


		// Random instance
		int Random = 1 + (int) Math.random() * MAX;

		boolean correct = false;

		// correct answer
		answer = rand.nextInt(MAX) + 1;

		// loop until the guess is correct
		while (!correct) {

			System.out.println(
				"Guess a number between 1 and 100: ");

			// guess value
			guess = StdIn.readInt();

			// if guess is greater than actual
			if (guess > answer) {
				System.out.println("Too high, try again");
			}

			// if guess is less than actual
			else if (guess < answer) {
				System.out.println("Too low, try again");
			}

			// guess is equal to actual value
			else {

				System.out.println(
					"Yes, you guessed the number.");

				correct = true;
			}
		}
		System.exit(0);
	}
}
