package lab2;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class IntroToProgrammingCourse implements Course {
    private String courseName;
    private String courseNumber;
    private double credits;

    @Override
    public void setCourseNumber(String courseNumber) {
        if(courseNumber == null || courseNumber.length() == 0){
            throw new IllegalArgumentException("Course number cannot be null or empty");
        }else{ 
            this.courseNumber = courseNumber;
        }
    }

    @Override
    public void setCredits(double credits) {
         if(credits < 0.5 || credits > 4.0) {
            throw new IllegalArgumentException("Credits must be in the range of .5 and 4.0");
        }else{
            this.credits = credits;
        }
    }

    @Override
    public void getCourseNumber() {
        SimpleOutput so = new SimpleOutput();
        so.writeStringToConsole(courseNumber);
    }

    @Override
    public void getCredits() {
        SimpleOutput so = new SimpleOutput();
        so.writeDoubleToConsole(credits);
    }

    
}
