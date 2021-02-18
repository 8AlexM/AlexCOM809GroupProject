import java.util.Scanner;

/**
 * Created by Alexander on 16/02/2021
 * COMMENTS ABOUT PROGRAM HERE
 */
public class TestClass
{

   public static void main(String[] args)
   {
      Scanner scanner = new Scanner(System.in);
      UserInterface userInterface = new UserInterface(scanner);

      userInterface.start();

   }//main
}//class