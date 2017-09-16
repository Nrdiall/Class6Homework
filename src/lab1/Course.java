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
    
    public abstract String getPrerequisites();

    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        if(courseNumber == null || courseNumber.length() == 0){
            throw new IllegalArgumentException("Please enter a proper ID");
        }else{ 
            this.courseNumber = courseNumber;
        }
    }

    public double getCredits() {
        return credits;
    }

    public void setCredits(double credits) {
         if(credits == 0 || credits > 5){
            throw new IllegalArgumentException("Invalid number for credits");
        }else{ 
           this.credits = credits;
        }
       
    }
    
    
}
