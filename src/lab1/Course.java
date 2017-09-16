/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author Naython
 */
public abstract class Course {
    private String courseNumber;
    private double credits;
    

    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        if(courseNumber == null || courseNumber.length() == 0){
            throw new IllegalArgumentException("Course number cannot be null or empty");
        }else{ 
            this.courseNumber = courseNumber;
        }
    }

    public double getCredits() {
        return credits;
    }

   public void setCredits(double credits) {
        if(credits < 0.5 || credits > 4.0) {
            throw new IllegalArgumentException("Credits must be in the range of .5 and 4.0");
        }else{
            this.credits = credits;
        }
    }
       
    }
    
    
}
