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
public class StudList {

   
    public static void main(String[] args) {
        Student[] slist=new Student[5];
        
        slist[0]=new Student("Micheal","9923458765");
        slist[1]=new Student("Megha","10");
        slist[2]=new Student("Megha1","10");
        slist[3]=new Student("Megha2","10");
        slist[4]=new Student("Megha3","10");
        
        
        System.out.println(slist[0].getsId()+ " "+ slist[0].getsName());
       Sytsem.out.println("hello world");
        
       for (int i=0;i<slist.length;i++)
       {
            System.out.println(slist[i].toString());
    }

}
}
