package lab1;

/**
 * Describe responsibilities here.
 *
 * @author      Naython
 * @version     1.00
 */
public class IntroJavaCourse extends Course {
    String prerequisites;
    
    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
          if(prerequisites == null || prerequisites.length() == 0) {
              throw new IllegalArgumentException("Prerequisites cannot be null or empty");
        }
        this.prerequisites = prerequisites;
    }

}
