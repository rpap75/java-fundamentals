import java.util.Random;

public class Main {
  public static void main(String[] args) {
       String test = "TEST TEST.";
      System.out.println("test");
        pluralize("dog", 1);
        pluralize("cat", 2);
        pluralize("turtle", 0);

        	System.out.println("~FLIPPING COINS~");
		flipNHeads(6);
		System.out.print("\n\n");
  }
  public static void pluralize (String word, int number) {
    if (number == 0 || number > 1) {
      System.out.println("I own " + number + " " + word + "s.");
      } else{
        System.out.println("I own " + number + " " + word + ".");
        }
        }
public static void flipNHeads(int n) {
		Random rand = new Random();
		int headCount = 0;
		int flips = 0;
		while(headCount < n) {
			flips++;
			if (rand.nextFloat() >= 0.5) { 
				headCount++;
				System.out.println("heads");
			} else {
				headCount = 0;
				System.out.println("tails");
			}
		}
		System.out.println("It took " + flips + " flips to flip " + n + " heads in a row.");
	}

}