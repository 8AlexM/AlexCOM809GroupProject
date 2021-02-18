import java.util.Scanner;

/**
 * Created by Alexander on 16/02/2021
 * COMMENTS ABOUT PROGRAM HERE
 */
public class UserInterface
{
   private Scanner scanner;
   private String[] topics = {"Arrays", "Lists", "Files"}; //TODO - add more topics

   public UserInterface(Scanner scanner) {
      this.scanner = scanner;
   }//Alternative constructor

   public void start() {
      //ask user to select a topic
      System.out.println("Which of the following topics would you like to test yourself on?");
      for (String topic : topics) {
         System.out.print(topic + " ");
      }
      String input = scanner.nextLine();

      if (input.equals("Arrays")) {
         //run the Array topic quiz
         ArrayTopic arrayRound = new ArrayTopic();
         arrayRound.askQs();
         arrayRound.printScore();
      } else {
         //TODO - if user selects other topics
      }

   }//start

}//class