import java.util.Random;
import java.time.LocalDateTime;
import java.time.format.*;
import java.util.concurrent.TimeUnit;

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

System.out.println("~COMMAND LINE CLOCK~");
		clock();
  }

  //Pluralize
  public static String pluralize (String word, int number) {
    if (number == 0 || number > 1) {
			String newWord = word + "s";
			return newWord;
      // System.out.println("I own " + number + " " + word + "s.");
      } else{
        // System.out.println("I own " + number + " " + word + ".");
				return word;
        }
        }

		//Flipping Coing
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

	//Comman Line Clock

	public static void clock() {
		while (true) {
			try {
				LocalTime time = LocalTime.now();
				DateTimeFormatter formatTime = DateTimeFormatter.ofPattern("HH:mm:ss");
				String formattedTime = time.format(formatTime);
				System.out.println(formattedTime);
				// delays by miliseconds
				Thread.sleep(1000);
			} catch (Exception err) {
				System.out.println(err);
			}
		}
	}
}