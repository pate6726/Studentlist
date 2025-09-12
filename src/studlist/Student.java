/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package studlist;

/**
 *
 * @author Megha Patel
 */
public class Student {
    private String sName;
    private String sId;

    
    public Student(String sName, String sId) {
        this.sName = sName;
        this.sId = sId;
    }
    

    
    /**
     * @return the sName
     */
    public String getsName() {
        return sName;
    }

    /**
     * @param sName the sName to set
     */
    public void setsName(String sName) {
        this.sName = sName;
    }

    /**
     * @return the sId
     */
    public String getsId() {
        return sId;
    }

    /**
     * @param sId the sId to set
     */
    public void setsId(String sId) {
        this.sId = sId;
    }

    @Override
public String toString() {
return "Name is " + getsName() + ", ID is " + getsId();
}
}
