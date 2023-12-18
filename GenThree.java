import java.util.Random;

/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
    int lowerBound = Integer.parseInt(args[0]);
    int upperBound = Integer.parseInt(args[1]);

    /**
     * Create random Object Generator
     */
    Random rand = new Random();

    int lowestNumberGenerated = upperBound;
    int generatedNumber;
    for (int i = 0; i < 3; ++i) {
      generatedNumber = rand.nextInt(upperBound - lowerBound) + lowerBound;
      System.out.println(generatedNumber);

      // Could use min function here
      // lowestNumberGenerated = Math.min(lowestNumberGenerated, generatedNumber);
      if (generatedNumber < lowestNumberGenerated) {
        lowestNumberGenerated = generatedNumber;
      }
    }

    System.out.println("The minimal generated number was " + lowestNumberGenerated);
	}
}
