package lab1;

/**
 * Describe responsibilities here.
 *
 * @author      Naython
 * @version     1.00
 */
public class IntroJavaCourse extends Course {
    private String prerequisites;
    
    public void getPrerequisites() {
        SimpleOutput so = new SimpleOutput();
        so.writeStringToConsole(prerequisites);
    }

    public void setPrerequisites(String prerequisites) {
          if(prerequisites == null || prerequisites.length() == 0) {
              throw new IllegalArgumentException("Prerequisites cannot be null or empty");
        }
        this.prerequisites = prerequisites;
    }

}
