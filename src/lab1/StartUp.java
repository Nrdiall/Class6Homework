/*
  The good thing about all these inhertitance thatI like a lot is the ability to 
simplify coding and make it easily readable to not only yourself, but to others 
who read our code. This is important since programmers will typically work in 
groups. Being able to make your code easier to read is really good for 
communication. The other benefit for inheritance is that it promotes 
polymorphism and adaptability. I can easily change or modify my code without 
to much problem and adapt to whatever situation I find is nececary.

    Being able to utilize Liskov Substitution method is really useful when you 
want to make your code more adaptable. eing able to change from one object to a 
different object makes it easy to change and modify coding easily making this
method really advantagious. 
 */
package lab1;

/**
 *
 * @author Naython
 */
public class StartUp {
     public static void main(String[] args) {
         Course c1 = new IntroToProgrammingCourse();
         //c1.setCredits(0);
         //The code above breaks the program because it doesn't pass validation.
         c1.setCredits(3);
         c1.getCredits();
         //c1.setCourseNumber("");
         //The code above breaks the program because it doesn't pass validation.
         c1.setCourseNumber("12345");
         c1.getCourseNumber();
         IntroJavaCourse c2 = new IntroJavaCourse();
         c2.setPrerequisites("You need Intro To Programming to take this class");
         c2.getPrerequisites();
         AdvancedJavaCourse c3 = new AdvancedJavaCourse();
         c3.setPrerequisites("You need the Intro To Java Course to take this class.");
         c3.getPrerequisites();
     }
}
