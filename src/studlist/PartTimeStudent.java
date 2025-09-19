/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studlist;

/**
 *
 * @author rohan
 */
public class PartTimeStudent extends Student  {
    public int numcourses;

    public void setNumcourses(int numcourses) {
        this.numcourses = numcourses;
    }
    public PartTimeStudent(String sName, String sId) {
        super(sName, sId);
    }
    public int getNumCourses(){
        
        return numcourses;
    }
 
}
