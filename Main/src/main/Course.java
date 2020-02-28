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
public class Course {
    private String name, code;
    private int numStudents = 0;
    Student[] list = new Student[10];
    /** Creates a new instance of Course */
    public Course() {
    }
    public Course(String nm, String cd) {
        name = nm;
        code = cd;
    }
    
    public void addStudent( Student st) {
        list[numStudents] = st;
        numStudents ++;
    }
                      
    public double averageSc() {
        double s=0.0;
        for (int i=0; i<numStudents; i++)
           s += list[i].avScore();
        return (s/numStudents);
    }
    public int getNumStud() {
            return numStudents;
    }
       public String getName() {
          return name;
    } 
}
