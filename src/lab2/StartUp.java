/*
I feel like this sort of architecture is good when you want certain methods to
be necessasry. In this case, I made the getters and setters that all the classes
should have manditory. Plus, with the help from netbeans one can easily get 
those methods from the interface super class and put them into each class without
having to type too much.

As for Liskovs method, it is a really good way to make your code more flexible 
and aadaptable to change. Sadly, I haven't been able to use it in my coding 
because of an error that I cannot see. From what I have learned, I know that 
this method should be used to make your code flexible and to have it easily make
changes whenever it is needed. The only time it shouldn't be used is when it is
not needed. If you have a very small number of sub-classes or if your code doesn't
allow for Liskov's method then the method shouldn't be used.  
 */
package lab2;

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
