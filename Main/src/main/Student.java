/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author up744652
 */
public class Student {
    private String name;      // class instance variables
    private int [] score = new int[3];   
    // Constructor
    public Student() {
    }
    // Constructor, performs validity check and sets new values
    public Student( String stName,  int stScore[]) {
        name = stName;
        for (int i=0; i<score.length; i++)
          score[i]= ((stScore[i]> 0) && (stScore[i]< 101))? stScore[i]: 0;
    } 
    // Modifier/Update methods
    public void setName( String n) {
        name = n;
    }
    public void setScore( int stSc[]) {
       score = stSc;
    }
    // Access methods
    public String  getName()  {
        return name;
    }  
    public int[] getScore() {
        return score;
    }
    // Calculates the average score
    public double avScore() {
        double s=0.0;
        for (int i=0; i< score.length; i++)
            s += score[i];
        return (s/3);
    }
    public void printOut() {
        System.out.println("\n Student data: ");
        System.out.println("\t name : "+ name);
        for (int i=0; i< score.length; i++)
            System.out.print("\tscore ["+ i+"] = " + score[i]);
        System.out.println("\n\t average score = " + avScore());
    }    
}
