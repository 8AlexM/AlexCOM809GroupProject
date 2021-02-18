Here's an initial draft for the quiz.

The "QuestionAndAnswer" class can can be used to store one question and one answer. From this we can create many "QuestionAndAnswer" objects for our quiz.
It also contains 2 methods, ask() and isCorrect(), to print out the question and see whether the answer passed to it is correct.
(It might make more sense to move these methods to another class later instead, idk)

For the super class, I made the "AbstractTopic" class. As it'll only be used to make subclasses representing each topic of the quiz, there won't be any objects
instantiated directly from it, so this is why I made it an abstract class.

It's basically a template that can be used for each quiz topic. It has a String "topic" variable which will just store the name of the topic and an int "topicScore" to
store the user's score for this topic. It's also got an ArrayList which will be used to store all of the questions and answers for a given topic.
The askQs() method will just loop through each question in the ArrayList, print the question out, mark it and add 1 to the user's score if they got it right.
The printScore() method just prints out the user's score for that topic.

I created an subclass called "ArrayTopic" with 2 questions on arrays just to test it out.

There's also a class called "UserInterface" which isn't totally necessary but it means the TestClass will be cleaner.
(got the idea from here: https://java-programming.mooc.fi/part-6/2-separating-user-interface-from-program-logic)

This "UserInterface" class just prints out a list of quiz topics for the user to choose from, then when they select one it creates an instance of the selected topic,
and runs it.

So all the "TestClass" then does is run the user interface.