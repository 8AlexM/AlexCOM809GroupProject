import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Alexander on 16/02/2021
 * COMMENTS ABOUT PROGRAM HERE
 */
abstract class AbstractTopic
{
   public Scanner scanner;
   protected String topic;
   public int topicScore;
   //a list to store all the questions and answers for this round
   public ArrayList<QuestionAndAnswer> questionsAndAnswers;

   public AbstractTopic(){
      this.questionsAndAnswers = new ArrayList<>();
      this.topicScore = 0;
      this.scanner = new Scanner(System.in);
   }//default constructor


   public void askQs (){
      System.out.println("\nHere are the questions on " + topic + ":\n");

      // loop through each question in the list for that topic
      for (QuestionAndAnswer q : questionsAndAnswers) {
         q.askQ();
         if (q.isCorrect(scanner.nextLine())){
            topicScore++;
         }//if
      }//for
   }//askQs

   public void printScore() {
      System.out.println("You scored " + topicScore + " on the " + topic + " questions");
   }//printScore

}//class